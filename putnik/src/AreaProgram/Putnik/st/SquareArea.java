package AreaProgram.Putnik.st;

import java.awt.*;

public class SquareArea {

    private int x;
    private int y;

    private int width;
    private int height;
    private boolean hasWall;

    public SquareArea(int x, int y, int width, int height, boolean hasWall) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.hasWall = hasWall;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return x;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public boolean HasWall(){
   return hasWall;
    }

    public void setHasWall(boolean hasWall){
        this.hasWall = hasWall;
    }

    public boolean contains(int px, int py){
        return(px >= x && px < x + width) && (py >= y && py < y + height);
    }

    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);

        if (hasWall){
            g.setColor(Color.BLACK);
            g.fillRect(x + width/ 2 - 5,y,10, height);
        }
    }

}


