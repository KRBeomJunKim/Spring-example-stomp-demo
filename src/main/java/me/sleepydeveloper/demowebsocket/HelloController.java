package me.sleepydeveloper.demowebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @MessageMapping("/hello")
    @SendTo("/topic/hello")
    public HelloMessage hello(HelloMessage helloMessage) {
        return helloMessage;
    }

}
