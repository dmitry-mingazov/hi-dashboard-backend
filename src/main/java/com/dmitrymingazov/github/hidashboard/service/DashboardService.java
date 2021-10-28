package com.dmitrymingazov.github.hidashboard.service;

import com.dmitrymingazov.github.hidashboard.data.Dashboard;
import com.dmitrymingazov.github.hidashboard.exception.EntityNotFoundException;
import com.dmitrymingazov.github.hidashboard.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {
    @Autowired
    private DashboardRepository dashboardRepository;

    public List<Dashboard> findAll() { return dashboardRepository.findAll(); }

    public Dashboard findById(String id) { return dashboardRepository.findById(id).orElseThrow(EntityNotFoundException::new);}

    public Dashboard save(Dashboard dashboard) { return dashboardRepository.save(dashboard);}

    public void deleteById(String id) { dashboardRepository.deleteById(id);}

    public List<Dashboard> findAllByUser(String user) { return dashboardRepository.findByAuthor(user);}
}
