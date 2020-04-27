package com.nyp.gameexample;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nyp.gameexample.gameobjects.Player;
import com.nyp.gameexample.gameobjects.Tile;

import java.util.ArrayList;

/**
 * Map class that utilises {@link Tile}'s to render
 * @author Carlo Meier
 */
public class Map {
    protected ArrayList<Tile> tiles;
    protected float posX;
    public float posY;
    private float velocity;
    private float gravity;
    private Player player;
    private boolean jumping = false;

    public Map(ArrayList<Tile> tiles, Player player) {
        this.player = player;
        this.tiles = tiles;
        velocity = 0;
        gravity = 0.2f;
        posX = 0;
        posY = 0;
    }

    /**
     * renders the map
     * @param batch {@link SpriteBatch}
     */
    public void render(SpriteBatch batch) {
        // Teleport player upwards if hes halfway stuck in the ground
        if (getGround() < posY) {
            posY = getGround();
        }
        if (jumping) {
            velocity = -10;
            jumping = false;
        }
        posY += velocity;
        if (!isGrounded()) {
            // Increase falling speed
            velocity += gravity;
        } else {
            // If the player is touching the ground set falling speed to 0
            velocity = 0;
        }

        // Render all tiles
        for (Tile t : tiles) t.render(batch, posX, posY);
    }

    /**
     * lets the player jump if hes touching the ground
     */
    public void jump() {
        if (isGrounded()) jumping = true;
    }

    /**
     * cleanup & free resources
     */
    public void dispose() {
        tiles.forEach(Tile::dispose);
    }

    /**
     * determines whether the {@link Player} is touching the ground or not
     * @return true if the {@link Player} is touching the ground
     */
    private boolean isGrounded() {
        return posY >= getGround();
    }

    /**
     * determines the y coordinate at which the {@link Player} should stop falling down
     * @return y coordinate of ground level
     */
    private float getGround() {
        float ground = 1000;
        for (Tile t : tiles) {
            if (t.isBackground()) continue;
            if ((t.getLeftX(posX) <= player.x + player.width && t.getRightX(posX) >= player.x + player.width) ||
                    (t.getLeftX(posX) <= player.x && t.getRightX(posX) >= player.x)) {
                float g = Gdx.graphics.getHeight() / 2 + (-t.y * t.size - t.size) - player.height / 2;
                if (ground > g) ground = g;
            }
        }
        return ground;
    }
}
