package com.nyp.gameexample;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nyp.gameexample.gameobjects.Coin;
import com.nyp.gameexample.gameobjects.Player;

import java.util.ArrayList;
import java.util.Random;

public class GdxExampleGame extends ApplicationAdapter {
    SpriteBatch batch;
    com.nyp.gameexample.gameobjects.Player player;
    Texture bg;
    ArrayList<com.nyp.gameexample.gameobjects.Coin> coins = new ArrayList<>();
    MovementControls controls;
    Map map;
    Random rand;
    BitmapFont font;

    @Override
    public void create() {
        player = new Player();
        player.x = (Gdx.graphics.getWidth() - player.width) / 2;
        player.y = (Gdx.graphics.getHeight() - player.height) / 2;
        map = new FirstMap(player);
        controls = new MovementControls(map);
        batch = new SpriteBatch();
        font = new BitmapFont();

        bg = new Texture("bg.png");

        coins.add(new com.nyp.gameexample.gameobjects.Coin(0, 0));
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        // Map & BG
        batch.draw(bg, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        map.render(batch);

        // Player & Objects
//        coins.forEach(c -> c.render(batch));

        player.render(batch);

        // UI
        controls.render(batch);
        font.draw(batch, "X:" + map.posX + " Y:" + map.posY, 10, Gdx.graphics.getHeight() - 10);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        bg.dispose();
        player.dispose();
        map.dispose();
        coins.forEach(Coin::dispose);
    }
}
