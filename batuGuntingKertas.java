import java.util.Random;
import java.util.Scanner;

public class batuGuntingKertas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //opening
        System.out.println("--------------------------------------------");
        System.out.println("     ^ WELCOME TO SUIT INDONESIA GAME ^ ");
        System.out.println("       B = BATU G= GUNTING K = KERTAS");
        System.out.println("--------------------------------------------");

        while (true) {
            String[] bgk = {"B", "G", "K"};
            String comMove = bgk [new Random().nextInt(bgk.length)];

            String userMove;

            while (true) {
                System.out.println("Silahkan masukkan pilihanmu ! [B/G/K]");
                userMove = sc.nextLine();
                if (userMove.equals("B") || userMove.equals("G") || userMove.equals("K")) {
                    break;
                }
                System.out.println(userMove + " Tidak dimengerti. ");
            }
            System.out.println("Komputer memberi  :  " + comMove);

            if (userMove.equals(comMove)) {
                System.out.println("SERI !");
            } else if (userMove.equals("B")) {
                if (comMove.equals("K")) {
                    System.out.println("KAMU KALAH ! ");

                } else if (comMove.equals("G")) {
                    System.out.println("KAMU MENANG !");
                }
            } else if (userMove.equals("G")) {
                if (comMove.equals("K")) {
                    System.out.println("KAMU MENANG ! ");

                } else if (comMove.equals("B")) {
                    System.out.println("KAMU KALAH !");
                }
            } else if (userMove.equals("K")) {
                if (comMove.equals("B")) {
                    System.out.println("KAMU MENANG !");
                } else if (comMove.equals("G")) {
                    System.out.println("KAMU KALAH !");
                }
                System.out.println("PERMAINAN TELAH USAI, MAU LAGI?!  [Y/N]");
                String lagi = sc.nextLine();
                if (!lagi.equals("Y")){
                    System.out.println("YAH SEDIH DEH :'(");
                    break;
                }
            }

        }
    }
}

