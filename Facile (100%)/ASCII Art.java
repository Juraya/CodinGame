import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // Largeur d'une lettre
        int L = in.nextInt();
        in.nextLine();
        System.err.println("Les lettres sont à "+L+" de largeur.");
        
        // Hauteur d'une lettre
        int H = in.nextInt();
        in.nextLine();
        System.err.println("Les lettres sont à "+H+" de hauteur.");
        
        // Ligne de texte
        String T = in.nextLine();
        T = T.toUpperCase();
        System.err.println("Mot à traduire : "+T);
        
        char[][] alphabet = new char[H][L*27];
        StringBuilder[] lignes = new StringBuilder[H];
        
        for (int i=0; i<H; i++) {
        lignes[i] = new StringBuilder();
        }
		
        // Alphabet ASCII
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            for (int j = 0; j < ROW.length(); j++) {
                alphabet[i][j]=ROW.charAt(j);
            } System.err.println(); }
			
        // Recherche des indexes de chaque lettre du mot   
        int[] indexes = new int[T.length()];
        for (int i = 0; i < T.length(); i++) {
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(T.charAt(i))!=(-1)) { indexes[i] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(T.charAt(i)); }
            else { indexes[i]="ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf("Z")+1; }
        }
		
        // Affichage de la réponse
        for (int k = 0; k < indexes.length; k++) {
        int secondindex = indexes[k]*L;
        for (int i = 0; i < H; i++) {
            for (int j = secondindex; j < secondindex+L; j++) {
                lignes[i].append(alphabet[i][j]); }}}
        for (int i = 0; i<lignes.length; i++) { System.out.println(lignes[i]); }}}