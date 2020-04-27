package com.nyp.gameexample;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nyp.gameexample.gameobjects.Player;
import com.nyp.gameexample.gameobjects.Tile;

import java.util.ArrayList;

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

    public void render(SpriteBatch batch) {
        if (getGround() < posY) {
            posY = getGround();
        }
        if (jumping) {
            velocity = -10;
            jumping = false;
        }
        posY += velocity;
        if (!isGrounded()) {
            velocity += gravity;
        } else {
            velocity = 0;
        }

        for (Tile t : tiles) t.render(batch, posX, posY);
    }

    public void jump() {
        if (isGrounded()) jumping = true;
    }

    public void dispose() {
        tiles.forEach(Tile::dispose);
    }

    private boolean isGrounded() {
        return posY >= getGround();
    }

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
