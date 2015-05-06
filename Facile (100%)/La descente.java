import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] Montagnes = new int[8];

        while (true) {

            int SX = in.nextInt();
            int SY = in.nextInt();
            
            // Recherche de la montagne la plus haute
            int max = 0;
            int place = 0;
            
            for (int i = 0; i < 8; i++) {
                int M = in.nextInt();
                if ( M >= max && M!=0) {
                max = M;
                place = i;
                }
            }
            if (SX == place) { System.out.println("FIRE"); } else { System.out.println("HOLD"); }}}}
