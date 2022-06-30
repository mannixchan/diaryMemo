package gnim.top.diarymemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passport")
public class PassportController {
    @PostMapping("/signin")
    public String login() {
        System.out.println("i'm loginning");
        return ("jojo");
    }
    @GetMapping("/hello")
    public Integer hello() {
        System.out.println("hello");
        return 888;
    }
}
