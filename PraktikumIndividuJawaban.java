import java.util.Scanner;

public class PraktikumIndividuJawaban {
    public static void main(String[] args) {
        /* 1) Buat program untuk menginput nilai dari 0 -10, jika program tidak menerima
        inputan nilai tersebut, maka program meminta user(penginput) untuk menginput ulang. (Basic Looping) */

        // deklarasi
        Scanner sc = new Scanner(System.in);
        int i;
        int benar =2;

        // masukan nilai 0-10 part

        //System.out.println("Masukkan Angka 0-10 untuk menghentikan program !");
        //i = sc.nextInt();

        // conditional statement
        do {
            System.out.println(" Angka 0-10 untuk menghentikan program !");
        } while ( benar == 1); {
            System.out.println("Masukkan Angka 0-10 untuk menghentikan program !");
            i = sc.nextInt();
            if ( i > 10){
                benar=1;
                System.out.println(" Anilai benar !" +benar );
            }
        }


    }

}
