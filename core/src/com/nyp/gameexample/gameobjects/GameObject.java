package com.nyp.gameexample.gameobjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface GameObject {
    abstract void render(SpriteBatch batch);
    abstract void dispose();
}
