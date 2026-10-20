package com.in.todoapp.controller;

import com.in.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoRepository todoRepository;

    @GetMapping({"", "/", "/home"})
    public String showPage(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "index";
    }
}
