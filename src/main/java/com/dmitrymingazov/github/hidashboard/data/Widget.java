package com.dmitrymingazov.github.hidashboard.data;

import org.springframework.data.annotation.Id;

public class Widget {

    @Id
    private String id;

    private int x;
    private int y;
    private int width;
    private int height;

    public Widget(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
