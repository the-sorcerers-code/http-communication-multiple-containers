package com.sorcererscode.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class ProducerController {

    @GetMapping
    public MessageDto produceMessage() {
        MessageDto message = new MessageDto();

        message.setTheMessage("Welcome to service number 2");
        message.setTheId(1);

        return message;
    }
}
