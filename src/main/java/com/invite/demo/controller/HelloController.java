package com.invite.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String getWelcomePage() {
        return """
            <!DOCTYPE html>
            <html>
            <head><title>Welcome</title></head>
            <body style="font-family: Arial; padding: 40px; text-align: center;">
                <h1 style="color: #4CAF50;">🎉 Welcome to the AWS Cloud - Deployment using Codepipeline  !</h1>
                <p style="font-size: 18px;">Application is running successfully.</p>
                <p><a href="/api/health" style="color: #2196F3;">Check Health Status</a></p>
            </body>
            </html>
            """;
    }
}