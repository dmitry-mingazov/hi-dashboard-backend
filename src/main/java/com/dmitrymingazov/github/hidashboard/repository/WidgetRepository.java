package com.dmitrymingazov.github.hidashboard.repository;

import com.dmitrymingazov.github.hidashboard.data.Widget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WidgetRepository extends MongoRepository<Widget, String> { }
