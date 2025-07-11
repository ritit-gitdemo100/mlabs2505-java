package com.mlabs.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping
	public OAuth2User home(@AuthenticationPrincipal OAuth2User principal, Model model) {
		
        if (principal != null) {
            // Access user details from the OAuth2User object
             String name = principal.getAttribute("name");
             System.out.println("Welcome "+name);
        }
        return principal;
	}

}
