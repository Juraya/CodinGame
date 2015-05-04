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
            
            for (int i = 0; i < Montagnes.length; i++) {
                Montagnes[i] = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
            }
            
            // Recherche de la montagne la plus haute
            int max = 0;
            int place = 0;
            for ( int i = 0; i < Montagnes.length; i++) {
            if ( Montagnes[i] >= max && Montagnes[i]!=0) {
                max = Montagnes[i];
                place = i;
                }
            }
            if (SX == place) { System.out.println("FIRE"); } else { System.out.println("HOLD"); }}}}