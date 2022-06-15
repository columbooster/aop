package com.example.aop.controller;

import com.example.aop.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
        return id + " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        return user;
    }
    // 사용방식 추가 예시 dev
    // custom 사용 예시 ex

}
