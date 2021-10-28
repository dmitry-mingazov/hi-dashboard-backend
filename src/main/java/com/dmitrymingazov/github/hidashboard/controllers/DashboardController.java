package com.dmitrymingazov.github.hidashboard.controllers;

import com.dmitrymingazov.github.hidashboard.data.Dashboard;
import com.dmitrymingazov.github.hidashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping()
    public List<Dashboard> findAll() { return dashboardService.findAll();}

    @GetMapping("/{id}")
    public Dashboard findById(@PathVariable String id) { return dashboardService.findById(id);}

    @GetMapping("/of/{user}")
    public List<Dashboard> findAllByUser(@PathVariable String user) { return dashboardService.findAllByUser(user);}

    @PostMapping()
    public Dashboard save(@RequestBody Dashboard dashboard) { return dashboardService.save(dashboard); }

    @PutMapping("/{id}")
    public Dashboard update(@RequestBody Dashboard dashboard) { return dashboardService.save(dashboard); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) { dashboardService.deleteById(id);}
}
