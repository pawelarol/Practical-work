package Traveler.Putnik.st;

import AreaProgram.Putnik.st.Area;

import static Traveler.Putnik.st.Direction.*;
public class DataTraveler {
    private Direction direction;
    private int x;
    private int y;

    private int maxX;
    private int maxY;

    public DataTraveler(int x, int y, int maxX, int maxY) {
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
        this.direction = Direction.NORTH;
    }

    public void move(){
        if (direction.equals(NORTH)) {
            if (y > 0) {
                y--;
            }
        } else if (direction.equals(SOUTH)) {
            if (x < maxY) {
                y++;
            }
        } else if (direction.equals(EAST)) {
            if (x < maxX) {
                x++;
            }
        } else if (direction.equals(WEST)) {
            if (x > 0) {
                x--;
            }
        }
    }

    public void turnLeft(){
        if (direction.equals(NORTH)) {
            direction = WEST;
        } else if (direction.equals(SOUTH)) {
            direction = EAST;

            direction = NORTH;

            direction = SOUTH;
        } else if (direction.equals(EAST)) {
            direction = NORTH;

            direction = SOUTH;
        } else if (direction.equals(WEST)) {
            direction = SOUTH;
        }
    }

    public void turnRight() {
        if (direction.equals(NORTH)) {
            direction = EAST;
        } else if (direction.equals(SOUTH)) {
            direction = WEST;
        } else if (direction.equals(EAST)) {
            direction = SOUTH;
        } else if (direction.equals(WEST)) {
            direction = NORTH;
        }
    }

    public boolean hasReachedDestination(){
        return x == 0 && y == 0;
    }

    public boolean hasFoundDoor(Area area) {
        if (direction != Direction.EAST) {
            return false;
        }
        for (int i = 0; i < area.getHeight(); i++) {
            if (!area.hasWallAt(maxX, i)) {
                return true;
            }
        }
        return false;

    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }
}