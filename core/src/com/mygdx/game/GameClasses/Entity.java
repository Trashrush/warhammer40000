package com.mygdx.game.GameClasses;

public abstract class Entity {

    protected String name;
    protected int hp;
    protected int stamina;
    protected int lvl;
    protected float progress;
    public float x;
    public float y;
    Direction direction;
    public Entity (String name, int hp, int stamina, int lvl, float progress, float x, float y, Direction direction) {
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.lvl = lvl;
        this.progress = progress;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move() {

    }

    public void fight(Entity opponent) {

    }

    public enum Direction {
        RIGHT,
        LEFT,
        UP,
        DOWN,
    }

}
