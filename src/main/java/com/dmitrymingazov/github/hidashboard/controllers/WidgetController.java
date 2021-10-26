package com.dmitrymingazov.github.hidashboard.controllers;

import com.dmitrymingazov.github.hidashboard.data.Widget;
import com.dmitrymingazov.github.hidashboard.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/widget")
public class WidgetController {
    @Autowired
    private WidgetService widgetService;

    @GetMapping()
    public List<Widget> getWidgets() {
        return widgetService.findAll();
    }

    @GetMapping("/{id}")
    public Widget findById(@PathVariable String id) {
        return widgetService.findById(id);
    }

    @PostMapping
    public Widget create(@RequestBody Widget widget) {
        return widgetService.save(widget);
    }

    @PutMapping("/{id}")
    public Widget update(@RequestBody Widget widget) {
        return widgetService.save(widget);
    }

    @DeleteMapping
    public void deleteById(@PathVariable String id) {
        widgetService.deleteById(id);
    }
}
