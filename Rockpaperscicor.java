import java.util.Random;
import java.util.Scanner;

public class Rockpaperscicor {
    public static void main(String[] args) {

        //Deklarasi
        String[] rps = {"J","T"," K"};
        String comMove = rps[new Random().nextInt(rps.length)];
        //Scanner
        Scanner sc = new Scanner(System.in);
        String userMove;
        //Lopping + Condition Statement
        while (true){
        while (true) {
            System.out.println("Masukkan pilihanmu [J/T/K]");
            userMove = sc.nextLine();

            if (userMove.equals("J") || userMove.equals("T") || userMove.equals("K")) {
               break;
            }
            System.out.println(userMove + " Huruf ini tidak mewakili apapun !");
            // condition

            if (userMove.equals(comMove)) {
                System.out.println("Permainan Berakhir ! ");
            } else if (userMove.equals("r")) {
            } if (comMove.equals("r")) {
                System.out.println(" Kamu Menang !");
            } else if (comMove.equals("p")) {
                System.out.println(" Kamu Kalah !");
            } else if (comMove.equals("s")) {
                System.out.println("SERI !");
            }


          }
            System.out.println("Main lagi ? [y/n]");
            String lagi = sc.nextLine();

            if (!lagi.equals("Y")){
                break;
            }
        }

    }
}

//tinggal print computer moved & menang kalah nya !