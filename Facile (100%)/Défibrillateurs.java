import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        
        double compar=9999;
        String solution="";
        double rad=0.017453292519943;
        
        Scanner in = new Scanner(System.in);

        
        // Longitude utilisateur
        String LON = in.next(); 
        in.nextLine();
        
        
        // Latitude utilisateur
        String LAT = in.next();
        in.nextLine();
        
        
        // Nombre de défibrilateurs
        int N = in.nextInt();
        in.nextLine();
        
        
        StringBuilder longiUS = new StringBuilder(LON); longiUS.setCharAt(LON.indexOf(","), '.');
        double longiU = Double.parseDouble(longiUS.toString()); longiU=longiU*rad;
        
        StringBuilder latiUS = new StringBuilder(LAT); latiUS.setCharAt(LAT.indexOf(","), '.');
        double latiU=Double.parseDouble(latiUS.toString()); latiU=latiU*rad;
        
        for (int i = 0; i < N; i++) {
            
            // On lit une ligne du fichier
            String ligne = in.nextLine();
            
            // On divise la ligne et on met ca dans un tableau
            String[] parts = ligne.split(";");
            
            // On convertit les positions
            StringBuilder longiS = new StringBuilder(parts[4]); longiS.setCharAt(longiS.indexOf(","), '.');
            double longi = Double.parseDouble(longiS.toString()); longi=longi*rad;
            
            StringBuilder latiS = new StringBuilder(parts[5]); latiS.setCharAt(latiS.indexOf(","), '.');
            double lati = Double.parseDouble(latiS.toString()); lati=lati*rad;
            
            // On calcule la différence
            double calc = Math.sqrt(Math.pow((longi-longiU),2)+Math.pow((lati-latiU),2));
            
            // Si la différence est moindre on l'enregistre
            if (calc < compar) { compar= calc; solution=parts[1]; }
        }
        System.out.println(solution);
    }
}