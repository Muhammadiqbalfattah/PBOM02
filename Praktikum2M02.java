import java.util.Scanner;

public class Praktikum2M02 {
    public static void main(String args[]) {
        /*Buatlah program utnuk mencari kata/frase dalam sebuah kalimat "kalau dilakukan dengan
        sepenuh hati maka besi batanganpun kalau digosok terus menerus akan menjadi jarum". dimana inputan
        berasal dari user, jika program tidak menerima inputan kata tersebut, maka program meminta user untuk
        menginput ulang. (pake substrings (?))*/
        //deklarasi

        Scanner sc = new Scanner(System.in);
        String kalimat;
        //opening
        System.out.println("Salin kalimat di bawah dengan benar  : ");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("\"Kalau dilakukan dengan" + " sepenuh hati maka besi batanganpun kalau digosok terus menerus" +
                " akan menjadi jarum\"");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.print("Salin kalimat lengkap : ");
        kalimat = sc.nextLine();

        for (int i=1;i <= 2;i++){

            if ( kalimat.contains("Kalau dilakukan dengan sepenuh hati maka besi batanganpun kalau digosok terus menerus akan menjadi jarum")) {
                System.out.println("Terima kasih telah memasukkan kalimat dengan benar !");

            } else {
                System.out.println("Kalimat kamu salah !");
                System.out.print("Salin kalimat lengkap : ");
                kalimat = sc.nextLine();
            }

        }







    }
}
//DONEE !