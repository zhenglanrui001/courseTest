package com.example;

public class Club {
    private String name;
    private Playable playable;
    private Learnable learnable;

    public Learnable getLearnable() {
        return learnable;
    }

    public void setLearnable(Learnable learnable) {
        this.learnable = learnable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Playable getPlayable() {
        return playable;
    }

    public void setPlayable(Playable playable) {
        this.playable = playable;
    }
}
