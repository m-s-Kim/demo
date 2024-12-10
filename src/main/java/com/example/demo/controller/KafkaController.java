package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer producer;

    @PostMapping("/publish")
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "Message sent to Kafka!";
    }
}