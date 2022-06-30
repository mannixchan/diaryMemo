package gnim.top.diarymemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PassportController {
    @GetMapping("/hello")
    public Integer hello() {
        System.out.println("hello");
        return 888;
    }
}
