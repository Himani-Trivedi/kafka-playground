package com.java.v1.controller;

import com.java.v1.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/one")
    public ResponseEntity<String> sendOne(@RequestBody String message) {
        String result = messageService.sendOneMessage(message);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/five")
    public ResponseEntity<String> sendFive(@RequestBody String message) {
        String result = messageService.sendFiveMessages(message);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/ten")
    public ResponseEntity<String> sendTen(@RequestBody String message) {
        String result = messageService.sendTenMessages(message);
        return ResponseEntity.ok(result);
    }
}
