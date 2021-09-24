package com.timilehinvincent.springbootjokeapp.controllers;

import com.timilehinvincent.springbootjokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    public void setJokeService(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"","/"})
    public String showJoke(Model model){

        //To get a random joke using the Joke service
        model.addAttribute("joke", jokeService.getJoke());

        return "joke";
    }



}
