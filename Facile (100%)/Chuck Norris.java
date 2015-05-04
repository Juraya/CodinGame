import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // On récupère le message à traduire
        String MESSAGE = in.nextLine();
        
        // On traduit en binaire
        byte[] bytes = MESSAGE.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
         int val = b;
         for (int i = 0; i < 8; i++)
         {
            int valeur = ((val & 128)==0 ? 0 : 1);
            if (i!=0 || valeur!=0) { binary.append(valeur); }
            val <<= 1; } binary.append(' '); }
        
        // On traduit maintenant en unaire
        int conseq = 1;
        StringBuilder unary = new StringBuilder();
        
        for (int j=1; j < binary.length(); j++) {
            
            if (binary.charAt(j)==' ' && j<binary.length()-1 ) { binary.deleteCharAt(j); }
            
            // Si les caractères similaires s'enchainent, on se contente de les compter
            if ( binary.charAt(j-1)==binary.charAt(j) ) { conseq++; /*System.err.println("Similaire, on enchaine !");*/ }
            
            // Sinon, on les traduit
            else if ( binary.charAt(j-1)!=binary.charAt(j) ) {
                
                // Si le caractère précédent est un 0
                if (binary.charAt(j-1)=='0') {
                    unary.append("00 ");
                    for (int k=0; k<conseq; k++) { unary.append("0"); }
                    if (j<binary.length()-1) {unary.append(' ');}
                }
                
                // Si le caractère précédent est un 1
                else if (binary.charAt(j-1)=='1') {
                    unary.append("0 ");
                    for (int k=0; k<conseq; k++) { unary.append("0"); }
                    if (j<binary.length()-1) {unary.append(' ');}
                }
                conseq=1; }
                
            // Si c'est un espace, on met un espace
            else if ( binary.charAt(j)==' ') { unary.append(' '); }} System.out.println(unary);}}