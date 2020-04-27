package com.nyp.gameexample.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.TimeUtils;

/**
 * example player class
 * @author Carlo Meier
 */
public class Player extends Rectangle {
    private Texture[] frames;
    private int state;
    private long animTimer;

    public Player() {
        this(0, 0);
    }

    public Player(float x, float y) {
        this.x = x;
        this.y = y;

        frames = new Texture[11];
        frames[0] = new Texture("player/p1_walk01.png");
        frames[1] = new Texture("player/p1_walk02.png");
        frames[2] = new Texture("player/p1_walk03.png");
        frames[3] = new Texture("player/p1_walk04.png");
        frames[4] = new Texture("player/p1_walk05.png");
        frames[5] = new Texture("player/p1_walk06.png");
        frames[6] = new Texture("player/p1_walk07.png");
        frames[7] = new Texture("player/p1_walk08.png");
        frames[8] = new Texture("player/p1_walk09.png");
        frames[9] = new Texture("player/p1_walk10.png");
        frames[10] = new Texture("player/p1_walk11.png");
        state = 0;

        width = frames[0].getWidth();
        height = frames[0].getHeight();

        animTimer = TimeUtils.nanoTime();
    }

    /**
     * renders the player
     * @param batch {@link SpriteBatch}
     */
    public void render(SpriteBatch batch) {
        // cycle through animations
        if (TimeUtils.nanoTime() - animTimer > 50000000) {
            state++;
            animTimer = TimeUtils.nanoTime();
        }
        if (state >= frames.length) state = 0;

        // draw the current texture
        batch.draw(frames[state], x, y);
    }

    /**
     * cleanup & free resources
     */
    public void dispose() {
        frames[0].dispose();
    }
}
