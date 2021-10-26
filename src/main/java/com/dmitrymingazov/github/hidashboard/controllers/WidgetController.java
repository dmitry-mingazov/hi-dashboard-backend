package com.dmitrymingazov.github.hidashboard.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WidgetController {

    @GetMapping("/api/widget")
    public String getWidgets() {
        return "Widgets controller works";
    }
}
