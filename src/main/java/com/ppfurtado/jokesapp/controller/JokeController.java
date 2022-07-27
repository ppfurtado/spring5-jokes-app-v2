package com.ppfurtado.jokesapp.controller;


import com.ppfurtado.jokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        String phrase = jokeService.getJoke();

        model.addAttribute("phrase", phrase);

        return "index";
    }
}
