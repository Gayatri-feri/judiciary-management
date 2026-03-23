package com.judiciary.judiciary_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

import com.judiciary.judiciary_management.repository.UserRepository;

@Controller
public class DashboardController {

    @Autowired
    private UserRepository userRepository;

    // Welcome page
    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    // Dashboard page
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "dashboard";
    }
    @GetMapping("/cases-page")
    public String casesPage() {
        return "cases";
    }
}