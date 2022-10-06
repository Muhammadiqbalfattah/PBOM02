import java.util.Scanner;
public class Strings {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String kalimat = "kalau dilakukan dengan sepenuh hati maka besi batanganpun kalau digosok terus menerus akan menjadi jarum";
        System.out.println("Salin kalimat diatas !");
        kalimat = sc.nextLine();

        if (kalimat.contains("kalau")) {
            System.out.println("kalau dilakukan dengan sepenuh hati maka besi batanganpun kalau digosok terus menerus akan menjadi jarum");
        } else {
            System.out.println("Salah!");
        }
    }
}
