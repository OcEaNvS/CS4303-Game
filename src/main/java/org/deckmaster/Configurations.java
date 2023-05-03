package org.deckmaster;

import processing.core.PFont;

public class Configurations {
    /**
     * Font settings
     */
    public static float CARD_FONT_SIZE_PROPORTION = 0.009f;
    public static PFont CARD_FONT = Game.game.createFont("Bell MT", Game.game.width * Configurations.CARD_FONT_SIZE_PROPORTION);
    public static float EVT_TITLE_FONT_SIZE_PROPORTION = 0.028f;
    public static float EVT_DES_FONT_SIZE_PROPORTION = 0.012f;
    public static PFont EVT_TITLE_FONT = Game.game.createFont("Edwardian Script ITC", Game.game.width * Configurations.EVT_TITLE_FONT_SIZE_PROPORTION);
    public static PFont EVT_DES_FONT = Game.game.createFont("Bell MT", Game.game.width * Configurations.EVT_DES_FONT_SIZE_PROPORTION);

    /**
     * Card settings
     */

    public static float CARD_HEIGHT_PROPORTION = 0.18f;
    public static float CARD_WIDTH_PROPORTION = 0.07f;
    public static float CARD_IMAGE_X_PROPORTION = 0.78f;
    public static float CARD_IMAGE_Y_PROPORTION = 0.84f;

    public static float CARD_TITLE_HEIGHT_PROPORTION = 0.055f;

    /**
     * Property settings
     */
    public static float PROPERTY_ICON_SIZE_PROPORTION = 0.06f;
    public static float PROPERTY_VALUE_INTERVAL_PROPORTION = 0.65f;

    /**
     * Inventory settings
     */
    public static int BATCH_MAX_CARDS_NUM = 8;
    public static float INVENTORY_HEIGHT_PROPORTION = 0.975f;

    /**
     * Event screen settings
     */
    public static float EVT_MAIN_WIDTH_PROPORTION = 0.54f;
    public static float EVT_MAIN_HEIGHT_PROPORTION = 0.7f;
    public static float EVT_TITLE_Y_PROPORTION = 0.07f;
    public static float EVT_DES_Y_PROPORTION = 0.07f;
    public static float EVT_TEXT_WIDTH_PROPORTION = 0.9f;
    public static float EVT_IMG_WIDTH_PROPORTION = 0.125f;
    public static float EVT_IMG_HEIGHT_PROPORTION = 0.35f;
    public static float EVT_Y_PROPORTION = 0.07f;
    public static float SLOT_HEIGHT_PROPORTION = 0.64f;
    public static float EVT_BTN_HEIGHT_PROPORTION = 0.935f;
    public static float EVT_BTN_SIZE_PROPORTION = 0.04f;
}