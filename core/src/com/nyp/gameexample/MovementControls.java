package com.nyp.gameexample;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nyp.gameexample.gameobjects.GameObject;

/**
 * basic movement controller with up/down/left/right buttons
 * @author Carlo Meier
 */
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

    /**
     * draws the ui and handles user input
     * @param batch {@link SpriteBatch}
     */
    @Override
    public void render(SpriteBatch batch) {
        // read user input
        if (Gdx.input.isTouched()) {
            int x = Gdx.input.getX(); // x coord of touch event
            int y = Gdx.graphics.getHeight() - Gdx.input.getY(); // y coord of touch event
            float s3 = size / 3;
            // Top Button
            if (x > this.x + s3 && x < this.x + size - s3 &&
                    y < this.y + size && y > this.y + s3 * 2) {
                map.jump();
            } // Left Button
            else if (x > this.x && x < this.x + s3 &&
                    y < this.y + size - s3 && y > this.y + s3) {
                map.posX += stepSize * Gdx.graphics.getDeltaTime();
            } //Bottom Button
            else if (x > this.x + s3 && x < this.x + size - s3 &&
                    y < this.y + s3 && y > this.y) {

            } // Right Button
            else if (x > this.x + s3 * 2 && x < this.x + size &&
                    y < this.y + size - s3 && y > this.y + s3) {
                map.posX -= stepSize * Gdx.graphics.getDeltaTime();
            }
        }

        // Draw UI
        batch.draw(texture, x, y, size, size);
    }

    /**
     * cleanup & free resources
     */
    @Override
    public void dispose() {
        texture.dispose();
    }
}
