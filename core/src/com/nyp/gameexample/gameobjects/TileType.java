package com.nyp.gameexample.gameobjects;

public enum TileType {
    BOX("box"),
    BOX_ALT("boxAlt"),
    BOX_COIN("boxCoin"),
    BOX_COIN_DISABLED("boxCoinDisabled"),
    BOX_COIN_ALT("boxCoinAlt"),
    BOX_COIN_ALT_DISABLED("boxCoinAltDisabled"),
    BOX_EMPTY("boxEmpty"),
    BOX_EXPLOSIVE("boxExplosive"),
    BOX_EXPLOSIVE_DISABLED("boxExplosiveDisabled"),
    BOX_EXPLOSIVE_ALT("boxExplosiveAlt"),
    BOX_ITEM("boxItem"),
    BOX_ITEM_DISABLED("boxItemDisabled"),
    BOX_ITEM_ALT("boxItemAlt"),
    BOX_ITEM_ALT_DISABLED("boxItemAltDisabled"),
    BOX_WARNING("boxWarning"),
    BRICK_WALL("brickWall"),
    BRIDGE("bridge"),
    BRIDGE_LOGS("bridgeLogs"),
    CASTLE("castle"),
    CASTLE_CENTER("castleCenter"),
    CASTLE_CENTER_ROUNDED("castleCenterRounded"),
    CASTLE_CLIFF_LEFT("castleCliffLeft"),
    CASTLE_CLIFF_LEFT_ALT("castleCliffLeftAlt"),
    CASTLE_CLIFF_RIGHT("castleCliffRight"),
    CASTLE_CLIFF_RIGHT_ALT("castleCliffRightAlt"),
    CASTLE_HALF("castleHalf"),
    CASTLE_HALF_LEFT("castleHalfLeft"),
    CASTLE_HALF_MID("castleHalfMid"),
    CASTLE_HALF_RIGHT("castleHalfRight"),
    CASTLE_HILL_LEFT("castleHillLeft"),
    CASTLE_HILL_LEFT2("castleHillLeft2"),
    CASTLE_HILL_RIGHT("castleHillRight"),
    CASTLE_HILL_RIGHT2("castleHillRight2"),
    CASTLE_LEDGE_LEFT("castleLedgeLeft"),
    CASTLE_LEDGE_RIGHT("castleLedgeRight"),
    CASTLE_LEFT("castleLeft"),
    CASTLE_MID("castleMid"),
    CASTLE_RIGHT("castleRight"),
    DIRT("dirt"),
    DIRT_CENTER("dirtCenter"),
    DIRT_CENTER_ROUNDED("dirtCenterRounded"),
    DIRT_CLIFF_LEFT("dirtCliffLeft"),
    DIRT_CLIFF_LEFT_ALT("dirtCliffLeftAlt"),
    DIRT_CLIFF_RIGHT("dirtCliffRight"),
    DIRT_CLIFF_RIGHT_ALT("dirtCliffRightAlt"),
    DIRT_HALF("dirtHalf"),
    DIRT_HALF_LEFT("dirtHalfLeft"),
    DIRT_HALF_MID("dirtHalfMid"),
    DIRT_HALF_RIGHT("dirtHalfRight"),
    DIRT_HILL_LEFT("dirtHillLeft"),
    DIRT_HILL_LEFT2("dirtHillLeft2"),
    DIRT_HILL_RIGHT("dirtHillRight"),
    DIRT_HILL_RIGHT2("dirtHillRight2"),
    DIRT_LEDGE_LEFT("dirtLedgeLeft"),
    DIRT_LEDGE_RIGHT("dirtLedgeRight"),
    DIRT_LEFT("dirtLeft"),
    DIRT_MID("dirtMid"),
    DIRT_RIGHT("dirtRight"),
    DOOR_CLOSED_MID("door_closedMid"),
    DOOR_CLOSED_TOP("door_closedTop"),
    DOOR_OPEN_MID("door_openMid"),
    DOOR_OPEN_TOP("door_openTop"),
    FENCE("fence"),
    FENCE_BROKEN("fenceBroken"),
    GRASS("grass"),
    GRASS_CENTER("grassCenter"),
    GRASS_CENTER_ROUNDED("grassCenterRounded"),
    GRASS_CLIFF_LEFT("grassCliffLeft"),
    GRASS_CLIFF_LEFT_ALT("grassCliffLeftAlt"),
    GRASS_CLIFF_RIGHT("grassCliffRight"),
    GRASS_CLIFF_RIGHT_ALT("grassCliffRightAlt"),
    GRASS_HALF("grassHalf"),
    GRASS_HALF_LEFT("grassHalfLeft"),
    GRASS_HALF_MID("grassHalfMid"),
    GRASS_HALF_RIGHT("grassHalfRight"),
    GRASS_HILL_LEFT("grassHillLeft"),
    GRASS_HILL_LEFT2("grassHillLeft2"),
    GRASS_HILL_RIGHT("grassHillRight"),
    GRASS_HILL_RIGHT2("grassHillRight2"),
    GRASS_LEDGE_LEFT("grassLedgeLeft"),
    GRASS_LEDGE_RIGHT("grassLedgeRight"),
    GRASS_LEFT("grassLeft"),
    GRASS_MID("grassMid"),
    GRASS_RIGHT("grassRight"),

    LADDER_MID("ladderMid"),
    LADDER_TOP("ladderTop"),
    LIQUID_LAVA("liquidLava"),
    LIQUID_LAVA_TOP("liquidLavaTop"),
    LIQUID_LAVA_TOP_MID("liquidLavaTop_mid"),
    LIQUID_WATER("liquidWater"),
    LIQUID_WATER_TOP("liquidWaterTop"),
    LIQUID_WATER_TOP_MID("liquidWaterTop_mid"),
    LOCK_BLUE("lockBlue"),
    LOCK_GREEN("lockGreen"),
    LOCK_RED("lockRed"),
    LOCK_YELLOW("lockYellow"),
    ROCK_HILL_LEFT("rockHillLeft"),
    ROCK_HILL_RIGHT("rockHillRight"),
    ROPE_ATTACHED("ropeAttached"),
    ROPE_HORIZONTAL("ropeHorizontal"),
    ROPE_VERTICAL("ropeVertical"),
    SAND("sand"),
    SAND_CENTER("sandCenter"),
    SAND_CENTER_ROUNDED("sandCenter_rounded"),
    SAND_CLIFF_LEFT("sandCliffLeft"),
    SAND_CLIFF_LEFT_ALT("sandCliffLeftAlt"),
    SAND_CLIFF_RIGHT("sandCliffRight"),
    SAND_CLIFF_RIGHT_ALT("sandCliffRightAlt"),
    SAND_HALF("sandHalf"),
    SAND_HALF_LEFT("sandHalfLeft"),
    SAND_HALF_MID("sandHalfMid"),
    SAND_HALF_RIGHT("sandHalfRight"),
    SAND_HILL_LEFT("sandHillLeft"),
    SAND_HILL_LEFT2("sandHillLeft2"),
    SAND_HILL_RIGHT("sandHillRight"),
    SAND_HILL_RIGHT2("sandHillRight2"),
    SAND_LEDGE_LEFT("sandLedgeLeft"),
    SAND_LEDGE_RIGHT("sandLedgeRight"),
    SAND_LEFT("sandLeft"),
    SAND_MID("sandMid"),
    SAND_RIGHT("sandRight"),
    SIGN("sign"),
    SIGN_EXIT("signExit"),
    SIGN_LEFT("signLeft"),
    SIGN_RIGHT("signRight"),
    SNOW("snow"),
    SNOW_CENTER("snowCenter"),
    SNOW_CENTER_ROUNDED("snowCenter_rounded"),
    SNOW_CLIFF_LEFT("snowCliffLeft"),
    SNOW_CLIFF_LEFT_ALT("snowCliffLeftAlt"),
    SNOW_CLIFF_RIGHT("snowCliffRight"),
    SNOW_CLIFF_RIGHT_ALT("snowCliffRightAlt"),
    SNOW_HALF("snowHalf"),
    SNOW_HALF_LEFT("snowHalfLeft"),
    SNOW_HALF_MID("snowHalfMid"),
    SNOW_HALF_RIGHT("snowHalfRight"),
    SNOW_HILL_LEFT("snowHillLeft"),
    SNOW_HILL_LEFT2("snowHillLeft2"),
    SNOW_HILL_RIGHT("snowHillRight"),
    SNOW_HILL_RIGHT2("snowHillRight2"),
    SNOW_LEDGE_LEFT("snowLedgeLeft"),
    SNOW_LEDGE_RIGHT("snowLedgeRight"),
    SNOW_LEFT("snowLeft"),
    SNOW_MID("snowMid"),
    SNOW_RIGHT("snowRight"),
    STONE("stone"),
    STONE_CENTER("stoneCenter"),
    STONE_CENTER_ROUNDED("stoneCenter_rounded"),
    STONE_CLIFF_LEFT("stoneCliffLeft"),
    STONE_CLIFF_LEFT_ALT("stoneCliffLeftAlt"),
    STONE_CLIFF_RIGHT("stoneCliffRight"),
    STONE_CLIFF_RIGHT_ALT("stoneCliffRightAlt"),
    STONE_HALF("stoneHalf"),
    STONE_HALF_LEFT("stoneHalfLeft"),
    STONE_HALF_MID("stoneHalfMid"),
    STONE_HALF_RIGHT("stoneHalfRight"),
    STONE_HILL_LEFT2("stoneHillLeft2"),
    STONE_HILL_RIGHT2("stoneHillRight2"),
    STONE_LEDGE_LEFT("stoneLedgeLeft"),
    STONE_LEDGE_RIGHT("stoneLedgeRight"),
    STONE_LEFT("stoneLeft"),
    STONE_MID("stoneMid"),
    STONE_RIGHT("stoneRight"),
    STONE_WALL("stoneWall"),
    TORCH_LIT("tochLit"),
    TORCH_LIT2("tochLit2"),
    TORCH("torch"),
    WINDOW("window");

    private final String fileName;

    TileType(String fileName) {
        this.fileName = fileName;
    }

    String getFileName() {
        return fileName;
    }
}
