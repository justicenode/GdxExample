package com.nyp.gameexample.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Player extends Rectangle {
    private Texture[] frames;
    private int state;

    public Player() {
        this(0, 0);
    }

    public Player(float x, float y) {
        this.x = x;
        this.y = y;

        frames = new Texture[4];
        frames[0] = new Texture("player/p1_stand.png");
        frames[1] = new Texture("frame-2.png");
        frames[2] = new Texture("frame-3.png");
        frames[3] = new Texture("frame-4.png");
        state = 0;

        width = frames[0].getWidth();
        height = frames[0].getHeight();
    }

    public void render(SpriteBatch batch) {
        //state++;
        if (state >= frames.length) state = 0;

        batch.draw(frames[state], x, y);
    }

    public void dispose() {
        frames[0].dispose();
        frames[1].dispose();
        frames[2].dispose();
        frames[3].dispose();
    }
}
