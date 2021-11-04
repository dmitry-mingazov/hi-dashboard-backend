package com.dmitrymingazov.github.hidashboard.controllers;

import com.dmitrymingazov.github.hidashboard.data.Dashboard;
import com.dmitrymingazov.github.hidashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/all")
    public List<Dashboard> findAll() { return dashboardService.findAll();}

    @GetMapping("/{id}")
    public Dashboard findById(@PathVariable String id) { return dashboardService.findById(id);}

    @GetMapping()
    public List<Dashboard> findAllByUser(Authentication auth) {
        System.out.println(auth.getName());
        return dashboardService.findAllByUser(auth.getName());
    }

    @PostMapping()
    public Dashboard save(@RequestBody Dashboard dashboard) { return dashboardService.save(dashboard); }

    @PutMapping("/{id}")
    public Dashboard update(@RequestBody Dashboard dashboard) { return dashboardService.save(dashboard); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) { dashboardService.deleteById(id);}
}
