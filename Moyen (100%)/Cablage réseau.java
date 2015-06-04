import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int min = 100;
        int max = 0;
        int med = 0;
        int[] tabY = new int[N];
        
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            int Y = in.nextInt();
            tabY[i] = Y;
            if (X<min) { min = X; }
            if (X>max) { max = X; }
            System.err.println(tabY[i]);
        }
        
        Arrays.sort(tabY);
        med = tabY[(N-1)/2];
        int somme = 0;
        
        for (int i = 0; i<N; i++) {
            if (tabY[i]-med>=0) {
            somme = somme+(tabY[i]-med); }
            if (tabY[i]-med<0) {
                somme = somme+(med-tabY[i]);
            }
        }
        
        System.err.println("Coordonnée minimum : "+min);
        System.err.println("Coordonnée maximum : "+max);
        System.err.println("Le cable horizontal sera donc de longueur : "+(max-min));
        System.err.println("La hauteur du cable horizontal est de : "+med);
        
        System.out.println(somme+(max-min));
    }
}