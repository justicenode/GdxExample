package com.nyp.gameexample.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Example class for coins
 * @author Carlo Meier
 */
public class Coin extends Rectangle implements GameObject {
    private Texture texture;

    public Coin(int x, int y) {
        this.x = x;
        this.y = y;

        this.texture = new Texture("coin.png");
    }

    /**
     * renders the coin
     * @param batch {@link SpriteBatch}
     */
    public void render(SpriteBatch batch) {
        batch.draw(texture, x, y);
    }

    /**
     * cleanup & free resources
     */
    public void dispose() {
        texture.dispose();
    }
}
