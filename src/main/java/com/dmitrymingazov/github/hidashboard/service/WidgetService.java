package com.dmitrymingazov.github.hidashboard.service;

import com.dmitrymingazov.github.hidashboard.data.Widget;
import com.dmitrymingazov.github.hidashboard.exception.EntityNotFoundException;
import com.dmitrymingazov.github.hidashboard.repository.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WidgetService {
    @Autowired
    private WidgetRepository widgetRepository;

    public List<Widget> findAll() {
        return widgetRepository.findAll();
    }

    public Widget findById(String id) {
        return widgetRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Widget save(Widget widget) {
        return widgetRepository.save(widget);
    }

    public void deleteById(String id) {
        widgetRepository.deleteById(id);
    }
}
