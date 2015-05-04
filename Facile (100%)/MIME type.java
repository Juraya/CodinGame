import java.util.*;
import java.io.*;
import java.math.*;
 
class Solution {
 
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        in.nextLine();
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        in.nextLine();
       
        Map<String, String> mime = new HashMap<String,String>();
        for (int i = 0; i < N; i++) {
            mime.put(in.next().toUpperCase(), in.next());
            in.nextLine();
        }
       
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            if(!FNAME.contains(".")) {
                System.out.println("UNKNOWN");
                continue;
            }
           
            String ext = FNAME.substring(FNAME.lastIndexOf(".") + 1).toUpperCase();
            if(mime.containsKey(ext)) {
                System.out.println(mime.get(ext));
            } 
			else {
                System.out.println("UNKNOWN");
            }
        }
    }
}