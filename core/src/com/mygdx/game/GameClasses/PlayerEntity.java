package com.mygdx.game.GameClasses;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class PlayerEntity extends Entity {
    public Rectangle sm;
    public Texture img;
    public PlayerEntity(String name, int hp, int stamina, int lvl, float progress, float x, float y, Direction direction) {
        super(name, hp, stamina, lvl, progress, x, y, direction);
        this.sm = new Rectangle(this.x, this.y, 10, 10);
        this.img = new Texture("spacemarine.png");
    }

    @Override
    public void move() {
        if(Gdx.input.isKeyPressed(Input.Keys.A)) this.x -= 200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.D)) this.x += 200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.W)) this.y += 200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.S)) this.y -= 200 * Gdx.graphics.getDeltaTime();
    }

}
