package com.ms.sb.controller;

import com.ms.sb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/hello")
public class HelloController {
    private final HelloService hs;
    public HelloController(@Autowired HelloService hs){this.hs = hs;}

    @GetMapping
    public Ho get(){
        return new Ho("hey",5);
    }
record Ho(String h,
          int o){

}
}
