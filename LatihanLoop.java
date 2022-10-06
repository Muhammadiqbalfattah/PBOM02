//Unconditional Loop
import java.util.Scanner;

public class LatihanLoop {
    public static void main(String[] args) {
        /* Halo selamat datang, Apakah ingin mengulang lagi? [y/t]*/
        Scanner sc = new Scanner(System.in);
        String jawab = "y";
        while( jawab.equals( "y")) {
            System.out.println("Halo Selamat Datang !");
            System.out.println("Apakah ingin mengulang lain? [y/n]");
            jawab = sc.nextLine();
        }
        System.out.println("Terima kasih telah menggunakan program ini !");
    }
}
