package com.sorcererscode.service1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consume")
public class ConsumerController {

    @GetMapping
    public MessageDto consumeMessage() {
        RestTemplate restTemplate = new RestTemplate();
        String producerResourceUrl = "http://service-2:8085/produce";
        ResponseEntity<MessageDto> response  = restTemplate.getForEntity(producerResourceUrl, MessageDto.class);
        return response.getBody();
    }
}
