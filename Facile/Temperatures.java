import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of temperatures to analyse
        
        if (N==0) { System.out.println(0); }
        in.nextLine();
        String TEMPS = in.nextLine(); // the N temperatures expressed as integers ranging from -273 to 5526
        String numbersString[] = TEMPS.split("\\s+");
        int[] numbers = new int[numbersString.length];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        
        int myNumber = 0;
        int distance = Math.abs(numbers[0] - myNumber);
        int idx = 0;
        
        for(int c = 1; c < numbers.length; c++){
            int cdistance = Math.abs(numbers[c] - myNumber);
            if (cdistance < distance) {
                idx = c;
                distance = cdistance;
            }
            else if (cdistance == distance && distance>0) {
                idx = c;
                distance = cdistance;
            }
        }
        int theNumber = numbers[idx]; System.out.println(theNumber); }}