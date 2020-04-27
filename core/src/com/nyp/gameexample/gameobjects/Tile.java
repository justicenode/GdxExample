package com.nyp.gameexample.gameobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Tile class to be used for the {@link com.nyp.gameexample.Map}
 * @author Carlo Meier
 */
public class Tile extends Rectangle implements GameObject {
    public int size;
    private Texture texture;
    private boolean background;

    public Tile(TileType texture) {
        this(texture, 0, 0);
    }

    public Tile(TileType texture, int x, int y) {
        this(texture, x, y, false);
    }
    public Tile(TileType texture, int x, int y, boolean background) {
        this(texture, x, y, background, 150);
    }

    public Tile(TileType texture, int x, int y, boolean background, int size) {
        this.texture = new Texture("tiles/" + texture.getFileName() + ".png");
        this.x = x;
        this.y = y;
        this.size = size;
        this.background = background;
    }

    /**
     * renders the tile at default location
     * @param batch {@link SpriteBatch}
     */
    public void render(SpriteBatch batch) {
        this.render(batch, 0, 0);
    }

    /**
     * renders the tile at specified location
     * @param batch {@link SpriteBatch}
     * @param xx x offset
     * @param yy y offset
     */
    public void render(SpriteBatch batch, float xx, float yy) {
        float x = this.x * size + xx;
        float y = this.y * size + yy;

        // Only draw visible Tiles to save resources
        if (x + size > 0 && x < Gdx.graphics.getWidth() &&
                y < Gdx.graphics.getHeight() && y + size > 0)
            batch.draw(texture, x, y, size, size);
    }

    /**
     * cleanup & free resources
     */
    public void dispose() {
        texture.dispose();
    }

    /**
     * returns if the {@link Tile} is a background {@link Tile} and should be considered for collision
     * @return true if the {@link Tile} is a background {@link Tile}
     */
    public boolean isBackground() {
        return background;
    }

    public float getRightX(float posX) {
        return x * size + posX + size;
    }

    public float getLeftX(float posX) {
        return x * size + posX;
    }
}

