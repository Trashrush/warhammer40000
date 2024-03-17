package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

import java.net.CacheRequest;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Rectangle sm;
	private OrthographicCamera camera;
	@Override
	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1440, 900);
		sm = new Rectangle(1440/2+30, 900/2+30, 10, 10);
		batch = new SpriteBatch();
		img = new Texture("spacemarine.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(img, sm.x, sm.y);
		batch.end();
		camera.update();
		if(Gdx.input.isKeyPressed(Input.Keys.A)) sm.x -= 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Input.Keys.D)) sm.x += 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Input.Keys.W)) sm.y += 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Input.Keys.S)) sm.y -= 200 * Gdx.graphics.getDeltaTime();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
