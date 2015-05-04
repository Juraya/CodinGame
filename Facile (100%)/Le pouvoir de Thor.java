import java.util.*;
import java.io.*;
import java.math.*;

class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        String r="";
        while (true) {
            int E = in.nextInt();
            if (TY<LY&&TX<LX) {r="SE"; TX++;TY++;}
            else if (TY==LY&&TX<LX){r="E";TX++;}
            else if (TY==LY&&TX>LX){r="W";TX--;}
            else if (TX==LX&&TY<LY){r="S";TY++;}
            else if (TX>LX&&TY<LY){r="SW";TX--;TY++;}System.out.println(r);}}}