package com.nyp.gameexample;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nyp.gameexample.gameobjects.GameObject;

public class MovementControls implements GameObject {
    private Texture texture;
    private float x, y, size, stepSize;
    private Map map;

    public MovementControls(Map map) {
        this(map, 400);
    }

    public MovementControls(Map map, float stepSize) {
        this.map = map;
        texture = new Texture("flatDark03.png");
        size = 400;
        x = Gdx.graphics.getWidth() - 20 - size;
        y = 20;
        this.stepSize = stepSize;
    }

    @Override
    public void render(SpriteBatch batch) {
        if (Gdx.input.isTouched()) {
            int x = Gdx.input.getX();
            int y = Gdx.graphics.getHeight() - Gdx.input.getY();
            float s3 = size / 3;
            if (x > this.x + s3 && x < this.x + size - s3 &&
                    y < this.y + size && y > this.y + s3 * 2) {
                map.jump();
            } else if (x > this.x && x < this.x + s3 &&
                    y < this.y + size - s3 && y > this.y + s3) {
                map.posX += stepSize * Gdx.graphics.getDeltaTime();
            } else if (x > this.x + s3 && x < this.x + size - s3 &&
                    y < this.y + s3 && y > this.y) {

                System.out.println("BOTTOM");
            } else if (x > this.x + s3 * 2 && x < this.x + size &&
                    y < this.y + size - s3 && y > this.y + s3) {
                map.posX -= stepSize * Gdx.graphics.getDeltaTime();
            }
        }

        batch.draw(texture, x, y, size, size);
    }

    @Override
    public void dispose() {
        texture.dispose();
    }
}
