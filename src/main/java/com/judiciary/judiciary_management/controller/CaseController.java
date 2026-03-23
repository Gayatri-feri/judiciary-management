package com.judiciary.judiciary_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.judiciary.judiciary_management.entity.Case;
import com.judiciary.judiciary_management.entity.User;
import com.judiciary.judiciary_management.repository.CaseRepository;
import com.judiciary.judiciary_management.repository.UserRepository;

import java.util.List;

@Controller
@RequestMapping("/cases")
public class CaseController {

    @Autowired
    private CaseRepository caseRepository;

    @Autowired
    private UserRepository userRepository;

    // ✅ SAVE CASE
    @PostMapping("/save")
    public String saveCase(
            @RequestParam String caseType,
            @RequestParam String description,
            @RequestParam String status,
            @RequestParam String userId,
            @RequestParam(required = false) String newUser
    ) {

        Case c = new Case();
        c.setCaseType(caseType);
        c.setDescription(description);
        c.setStatus(status);

        User user;

        // 🔥 Add new user
        if (userId.equals("new")) {
            user = new User();
            user.setName(newUser);
            user.setEmail(newUser + "@mail.com");
            user.setPassword("1234");
            user.setRole("LAWYER");
            user = userRepository.save(user);
        } else {
            user = userRepository.findById(Long.parseLong(userId)).orElse(null);
        }

        c.setUser(user);
        caseRepository.save(c);

        return "redirect:/dashboard";
    }

    // ✅ VIEW ALL CASES (VERY IMPORTANT)
    @GetMapping
    @ResponseBody
    public List<Case> getAllCases() {
        return caseRepository.findAll();
    }

    // ✅ DELETE CASE
    @GetMapping("/delete/{id}")
    public String deleteCase(@PathVariable Long id) {
        caseRepository.deleteById(id);
        return "redirect:/dashboard";
    }
 // ✅ UPDATE CASE
    @PostMapping("/update")
    public String updateCase(
            @RequestParam Long caseId,
            @RequestParam String caseType,
            @RequestParam String description,
            @RequestParam String status
    ) {

        Case c = caseRepository.findById(caseId).orElse(null);

        if (c != null) {
            c.setCaseType(caseType);
            c.setDescription(description);
            c.setStatus(status);

            caseRepository.save(c);
        }

        return "redirect:/cases-page";
    }
}