package com.drawingApp;

import java.awt.*;

class TextLabel {
    String text;
    int x, y;
    Font font;

    TextLabel(String text, int x, int y, Font font) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.font = font;
    }
}