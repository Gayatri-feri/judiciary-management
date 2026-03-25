package com.judiciary.judiciary_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // 👉 Show login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    // 👉 Handle login (accept ANY input)
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        @RequestParam String role,
                        Model model) {

        // store values
        model.addAttribute("userEmail", email);
        model.addAttribute("role", role);

        // 🔥 ROLE BASED DASHBOARD
        if (role.equalsIgnoreCase("Judge")) {
            return "judge-dashboard";
        } 
        else if (role.equalsIgnoreCase("Lawyer")) {
            return "lawyer-dashboard";
        } 
        else if (role.equalsIgnoreCase("Clerk")) {
            return "clerk-dashboard";
        } 
        else {
            return "client-dashboard";
        }
    }

    // 👉 Direct URL access (important for fixing errors)
    @GetMapping("/judge-dashboard")
    public String judgePage() {
        return "judge-dashboard";
    }

    @GetMapping("/lawyer-dashboard")
    public String lawyerPage() {
        return "lawyer-dashboard";
    }

    @GetMapping("/clerk-dashboard")
    public String clerkPage() {
        return "clerk-dashboard";
    }

    @GetMapping("/client-dashboard")
    public String clientPage() {
        return "client-dashboard";
    }
}