/* 1) Buat program untuk menginput nilai dari 0 -10, jika program tidak menerima
        inputan nilai tersebut, maka program meminta user(penginput) untuk menginput ulang. (Basic Looping) */
import java.util.Scanner;
public class PraktikumM02 {
    public static void main(String args[]) {
        int angka;
        Scanner sc = new Scanner(System.in);
        // Looping Statement
        for (int i = 1; i < 3; i++) {
            System.out.print("Masukan angka 0-10 : ");
            angka = sc.nextInt();
            // Conditional Statement
            if (angka <= 10) {

                System.out.println("Kamu memasukan Angka yang benar ! ");
            } else {
                System.out.println("Mohon masukkan kembali angka 0-10 ! ");
               // angka = sc.nextInt();

            } continue;
        }
    }
}

//DONE
