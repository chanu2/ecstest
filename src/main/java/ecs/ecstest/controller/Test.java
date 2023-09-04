package ecs.ecstest.controller;


import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Test {

    private final EntityManager em;


    @GetMapping("/test")
    public String test1(){
        return "hi my name is chanwoo ";
    }

    @PostMapping("/init")
    public void init(){


    }

}
