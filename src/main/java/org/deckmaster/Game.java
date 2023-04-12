package org.deckmaster;
import processing.core.PApplet;
import processing.core.PVector;
import processing.opengl.PShader;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Game extends PApplet {
    public static Game game = null;
    PVector cameraPosition = new PVector(0, 0);

    @Override
    public void settings() {
        size(displayWidth, displayHeight, P2D); fullScreen();
    }

    @Override
    public void setup() {
        game = this;
    }

    @Override
    public void mouseReleased() {
    }

    @Override
    public void draw() {
        background(0);
    }

//    private void calcCameraPos() {
//        if (Math.abs(cameraPosition.x - player.location.x) > width / 4f) {
//            if (cameraPosition.x > player.location.x) {
//                cameraPosition.x -= Math.abs(cameraPosition.x - player.location.x) - width / 4f;
//            } else {
//                cameraPosition.x += Math.abs(cameraPosition.x - player.location.x) - width / 4f;
//            }
//        }
//
//        if (Math.abs(cameraPosition.y - player.location.y) > height / 4f) {
//            if (cameraPosition.y > player.location.y) {
//                cameraPosition.y -= Math.abs(cameraPosition.y - player.location.y) - height / 4f;
//            } else {
//                cameraPosition.y += Math.abs(cameraPosition.y - player.location.y) - height / 4f;
//            }
//        }
//    }

    public void update() {

    }

    @Override
    public void keyPressed() {
        Input.checkKeyPressed();
    }

    @Override
    public void keyReleased() {
        Input.checkKeyReleased();
    }

    public boolean overRect(int x, int y, int width, int height) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }

    public static void main(String[] args) {
        PApplet.main(Game.class);
    }
}
