package com.dmitrymingazov.github.hidashboard.data;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Dashboard {
    @Id
    private String id;

    private String author;
    private List<Widget> widgets;

    public Dashboard(String id, String author, List<Widget> widgets) {
        this.id = id;
        this.author = author;
        this.widgets = widgets;
    }

    public String getId() { return this.id;}

    public String getAuthor() { return this.author; }

    public List<Widget> getWidgets() { return this.widgets;}

}
