package com.nyp.gameexample.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Coin extends Rectangle implements GameObject {
    private Texture texture;

    public Coin(int x, int y) {
        this.x = x;
        this.y = y;

        this.texture = new Texture("coin.png");
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, x, y);
    }


    public void dispose() {
        texture.dispose();
    }
}
