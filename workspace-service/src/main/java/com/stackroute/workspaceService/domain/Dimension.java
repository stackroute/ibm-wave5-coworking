package com.stackroute.workspaceService.domain;


import lombok.Data;

@Data
public class Dimension {
    int width;
    int height;

    public Dimension() {
    }

    public Dimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

