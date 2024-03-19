package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.GameClasses.Entity;
import com.mygdx.game.GameClasses.PlayerEntity;

import java.net.CacheRequest;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	private OrthographicCamera camera;
	private PlayerEntity player;
	@Override
	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1440, 900);
		player = new PlayerEntity("Player", 100, 100, 1, 0, 1440/2, 900/2, Entity.Direction.DOWN);
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		player.move();
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(player.img, player.x, player.y);
		batch.end();
		camera.update();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		player.img.dispose();
	}
}
