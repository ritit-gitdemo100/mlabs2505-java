package com.rit;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Greet extends SimpleTagSupport {
    public void doTag() throws JspException, IOException
    {
        JspWriter out = getJspContext().getOut();
        out.println("Welcome to RIT Infotech Solutions");
    }
}
