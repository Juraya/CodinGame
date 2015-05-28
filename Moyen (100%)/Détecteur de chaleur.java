import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // Largeur du building.
        int H = in.nextInt(); // Hauteur du building.
        in.nextLine();
        int N = in.nextInt();
        in.nextLine();
        int X0 = in.nextInt(); // Position horizontale de Batman
        int Y0 = in.nextInt(); // Position verticale de Batman
        in.nextLine();
        
        int xmin = 0; int ymin = 0;
        int xmax = W; int ymax = H;

        while (true) {
            String BOMB_DIR = in.next();
            in.nextLine();

            if (BOMB_DIR.contains("L")) {
                xmax = X0;
            }
            if (BOMB_DIR.contains("R")) {
                xmin = X0 + 1;
            }
            if (BOMB_DIR.contains("U")) {
                ymax = Y0;
            }
            if (BOMB_DIR.contains("D")) {
                ymin = Y0 + 1;
            }
            X0 = (xmin + xmax) / 2;
            Y0 = (ymin + ymax) / 2;
            System.out.println(X0 + " " + Y0); }}}