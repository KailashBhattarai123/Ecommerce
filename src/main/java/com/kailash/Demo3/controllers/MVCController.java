package com.kailash.Demo3.controllers;

import com.kailash.Demo3.model.User;
import com.kailash.Demo3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MVCController {

    @Autowired
    UserService userService;


}

