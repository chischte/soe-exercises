package ch.juventus.socketproject;

import java.io.Serializable;

public class SolutionObject implements Serializable {
    private String solution;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getSolution() {
        return solution;
    }

    public String getName() {
        return name;
    }
}
