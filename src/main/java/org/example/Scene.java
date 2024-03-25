package org.example;

import org.example.entity.Shape;

import java.util.Collection;
import java.util.List;

public class Scene {

    public Scene(Collection<Shape> figure) {
        this.figure = figure;
    }

    public Collection<Shape> getFigure() {
        return figure;
    }

    public void setFigure(Collection<Shape> figure) {
        this.figure = figure;
    }

    Collection<Shape> figure;

    public Scene() {
    }


    public void draw() {
        for (Shape s : getFigure()) {
            s.draw();
        }
    }
}
