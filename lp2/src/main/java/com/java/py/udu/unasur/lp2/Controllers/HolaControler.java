package com.java.py.udu.unasur.lp2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaControler {
    @GetMapping("/")
    String hola (){
        return"Hola mundo";
    }
}
