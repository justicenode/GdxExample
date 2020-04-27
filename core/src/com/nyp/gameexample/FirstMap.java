package com.nyp.gameexample;

import com.nyp.gameexample.gameobjects.Player;
import com.nyp.gameexample.gameobjects.Tile;
import com.nyp.gameexample.gameobjects.TileType;

import java.util.ArrayList;

/**
 * Example map
 * @author Carlo Meier
 */
class FirstMap extends Map {
    public FirstMap(Player player) {
        super(new ArrayList<>(), player);

        // Set starting position
        posX = 720;
        posY = 180;

        // Add tiles
        tiles.add(new Tile(TileType.GRASS_LEFT, 0, 1));
        tiles.add(new Tile(TileType.BOX, 0, 2));
        tiles.add(new Tile(TileType.BOX, 0, 3));
        tiles.add(new Tile(TileType.GRASS_MID, 1, 1));
        tiles.add(new Tile(TileType.FENCE, 1, 2, true));
        tiles.add(new Tile(TileType.GRASS_MID, 2, 1));
        tiles.add(new Tile(TileType.FENCE, 2, 2, true));
        tiles.add(new Tile(TileType.GRASS_MID, 3, 1));
        tiles.add(new Tile(TileType.FENCE, 3, 2, true));
        tiles.add(new Tile(TileType.GRASS_MID, 4, 1));
        tiles.add(new Tile(TileType.FENCE_BROKEN, 4, 2, true));
        tiles.add(new Tile(TileType.GRASS_RIGHT, 5, 1));
        tiles.add(new Tile(TileType.SIGN_RIGHT, 5, 2, true));

        tiles.add(new Tile(TileType.CASTLE_LEFT, 7, 1));
        tiles.add(new Tile(TileType.CASTLE_MID, 8, 1));
        tiles.add(new Tile(TileType.CASTLE_MID, 9, 1));
        tiles.add(new Tile(TileType.CASTLE_RIGHT, 10, 1));

        tiles.add(new Tile(TileType.GRASS_HALF, 11, 2));
        tiles.add(new Tile(TileType.GRASS_HALF_LEFT, 13, 0));
        tiles.add(new Tile(TileType.GRASS_HALF_MID, 14, 0));
        tiles.add(new Tile(TileType.GRASS_HALF_RIGHT, 15, 0));

        tiles.add(new Tile(TileType.DIRT_CLIFF_LEFT, 16, 1));
        tiles.add(new Tile(TileType.DIRT_MID, 17, 1));
        tiles.add(new Tile(TileType.DIRT_HILL_LEFT2, 18, 1));
        tiles.add(new Tile(TileType.DIRT_HILL_LEFT, 18, 2));
        tiles.add(new Tile(TileType.DIRT_CENTER, 19, 1));
        tiles.add(new Tile(TileType.DIRT_CENTER, 20, 1));
        tiles.add(new Tile(TileType.DIRT_MID, 19, 2));
        tiles.add(new Tile(TileType.DIRT_MID, 20, 2));
        tiles.add(new Tile(TileType.DIRT_CLIFF_RIGHT, 21, 2));
        tiles.add(new Tile(TileType.DOOR_CLOSED_MID, 19, 3, true));
        tiles.add(new Tile(TileType.DOOR_CLOSED_TOP, 19, 4, true));

        // Add lava underneath for extra dramatic effect
        for(int i = -6; i < 25; i++) {
            tiles.add(new Tile(TileType.LIQUID_LAVA_TOP_MID, i, -1));
            tiles.add(new Tile(TileType.LIQUID_LAVA, i, -2));
            tiles.add(new Tile(TileType.LIQUID_LAVA, i, -3));
        }
    }
}
