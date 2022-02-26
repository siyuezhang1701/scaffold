package com.example.scaffold.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/heartbeat")
    public ResponseEntity<String> heartbeat() {
        return ResponseEntity.ok("LLAP!");
    }
}
