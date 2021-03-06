package com.example.aop.controller;

import com.example.aop.annotation.Dcode;
import com.example.aop.annotation.Timer;
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

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        // db logic
        Thread.sleep(1000*2);
    }

    @Dcode
    @PutMapping("/put")
    public User put(@RequestBody User user){

        System.out.println("put");
        System.out.println(user);

        return user;
    }
    // AOP 적용사례 이클립스에서 구현(어노테이션 없이)
    //mvc 패턴 연습
}
