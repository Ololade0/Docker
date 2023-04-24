package com.docker.docker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    @RequestMapping("/welcome")
    public String welcome(){
        return "spring Boot Docker Demo";
    }

    @RequestMapping("/banks")
    public String registerBank() {
        return "hi";
    }

}

