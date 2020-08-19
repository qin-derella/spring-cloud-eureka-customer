package com.example.springcloudeurekacustomer.romote;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class HelloRemoteFallBack implements HelloRemote {
    @Override
    public String hello(String name) {
        return "default";
    }
}
