package com.mlabs.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomRequestResponseFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String isLoggedIn = req.getHeader("isLoggedIn");
        String userId = req.getHeader("userId");

        if (isLoggedIn==null || !isLoggedIn.equalsIgnoreCase("true") || userId == null || userId.isBlank()) {
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED); 
            res.getWriter().write("Missing or invalid headers");
            return; 
        }

        res.addHeader("isLoggedIn", "true");
        res.addHeader("userId", userId);
        res.addHeader("X-App-Version", "1.0.0");

        chain.doFilter(request, response);
    }
}
