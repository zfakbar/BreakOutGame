package com.gametech.breakoutgame;


import android.graphics.RectF;

public class Brick {

    private RectF rect;

    private boolean isVisible;

    public Brick(int row, int column, int width, int height) {

        isVisible = true;

        int padding = 1;

        float left = column * width + padding;
        float top = row * height + padding;
        float right = column * width + width - padding;
        float bottom = row * height + height - padding;

        rect = new RectF(left,top,right,bottom);

//        Log.d("Brick","left : "+left+" top : "+top+" right : "+right+" bottom : "+bottom);
    }

    public RectF getRect() {
        return this.rect;
    }

    public void setInvisible() {
        isVisible = false;
    }

    public boolean getVisibility() {
        return isVisible;
    }
}
