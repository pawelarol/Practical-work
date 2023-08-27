import AreaProgram.Putnik.st.Area;
import Traveler.Putnik.st.DataTraveler;

import java.util.concurrent.TransferQueue;

public class StartPage {
    public static void main(String[] args) {
     startAllPrograms();

    }

    public static void startAllPrograms() {
        printPath();
        travelPutnik();
    }
static void travelPutnik(){
    Area area = new Area(10, 10,3,7);

    DataTraveler traveler = new DataTraveler(0,9,9,0);

    area.print(traveler);
    while (traveler.getX() != 0 || traveler.getY() != 0) {
        traveler.move();
        area.print(traveler);
    }
    area.print(traveler);
    }

private static int x;
    private static int  y;
    private static int maxY;
    private static int maxX;
    public static void printPath(){
        for(int i = 0; i <= maxY; i++){
            for(int j = 0; j <= maxX; j++){
                if(i == y && j == x){
                    System.out.println("X");
                } else if ( i == 0 && j == maxX){
                    System.out.println("E");
                } else if ( i == maxY && j == 0){
                    System.out.println("S");
                } else if (i == 0 && j == 0){
                    System.out.println("Start");
                } else if (i == maxY && j == maxX){
                    System.out.println("Finish");
                } else {
                    System.out.println(".");
                }
            }
        }
    }


    public static void setMaxY(int maxY) {
        StartPage.maxY = maxY;
    }

    public static void setMaxX(int maxX) {
        StartPage.maxX = maxX;
    }

    public static void setY(int y) {
        StartPage.y = y;
    }

    public static void setX(int x) {
        StartPage.x = x;
    }
}


