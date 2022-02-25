package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class RollDiceController {

    // Roll Dice from Views Exercise
    @GetMapping("/roll-dice")
    public String showOptions() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String showResult(@PathVariable int n, Model model) {
        int randomNum = (int) (Math.random() * 6) + 1;
        if (n == randomNum) {
            model.addAttribute("result", "You guessed correctly!");
        } else {
            model.addAttribute("result", "Sorry, your guess was incorrect.");
        }
        return "roll-dice";
    }
}