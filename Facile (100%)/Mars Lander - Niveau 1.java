import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < N; i++) {
            int LAND_X = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int LAND_Y = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int HS = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int VS = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int F = in.nextInt(); // the quantity of remaining fuel in liters.
            int R = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int P = in.nextInt(); // the thrust power (0 to 4).
            
            /*
            // Solution valable mais pas assez d'économie de fuel
            if ( Y<= 2070) {
                System.out.println("0 4");
            }
            */
            
            System.err.println(VS);
            if (Y >= 2150) {
            
            if (VS <= -60) {
                System.out.println("0 3");
            }

            else if (VS <= -50 && VS > -60) {
                System.out.println("0 2");
            }
            
            else if (VS <= -40 && VS > -50) {
                System.out.println("0 1");
            }
            
            else if (VS > -40) {
                System.out.println("0 0");
            }
            }

            else System.out.println("0 4");
            
    }
}
}