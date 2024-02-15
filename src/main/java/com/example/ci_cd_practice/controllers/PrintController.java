package com.example.ci_cd_practice.controllers;

import com.example.ci_cd_practice.services.PrintService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class PrintController {
    private PrintService printService;
    @GetMapping("/print")
    public ResponseEntity<String> print(){
        return ResponseEntity.ok(printService.print());
    }
}
