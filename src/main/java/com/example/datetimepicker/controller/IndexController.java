package com.example.datetimepicker.controller;
import com.example.datetimepicker.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {

    @GetMapping
    public String main(Model model) {
        model.addAttribute("event", new Event());
        return "index";
    }

    @PostMapping
    public String save(Event event, Model model) {
        model.addAttribute("event", event);
        return "saved";
    }
}