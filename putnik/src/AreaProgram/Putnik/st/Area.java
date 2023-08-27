package AreaProgram.Putnik.st;

import Traveler.Putnik.st.DataTraveler;

public class Area {
    private int x;
    private int y;

    private int width;
    private int height;
    private boolean[][] walls;

    public Area(int width, int height, boolean[][] walls) {
        this.width = width;
        this.height = height;
        this.walls = new boolean[width][height];
    }

    public Area(int width, int height, int i, int i1) {
        
    }

    public boolean hasWallAt(int x, int y) {
        if (x < 0 || x > width || y < 0 || y >= height) ;
        {
            return true;
        }
        //return walls[x][y];
    }

    public void setWallAt(int x, int y, boolean hasWall){
        if(x<0 || x >= width || y < 0 || y >= height){
            return;
        }
        walls[x][y] = hasWall;
    }

    public int getHeight() {
        int height = 25;
        return height;
    }

    public void print(DataTraveler traveler) {
    }
}
