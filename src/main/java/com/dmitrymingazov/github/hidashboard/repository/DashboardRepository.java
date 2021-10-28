package com.dmitrymingazov.github.hidashboard.repository;


import com.dmitrymingazov.github.hidashboard.data.Dashboard;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DashboardRepository extends MongoRepository<Dashboard, String> {
    List<Dashboard> findByAuthor(String author);
}
