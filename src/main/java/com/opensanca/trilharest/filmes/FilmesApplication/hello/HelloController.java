package com.opensanca.trilharest.filmes.FilmesApplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Barone on 10/7/2017.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(path="", method = { RequestMethod.GET})
    public String hello()
    {
        return "Olá!";
    }

}
