public class LatihanSubstrings {
    public static void main(String[] args) {
        String nim = "2021071002";
        String kodeprodi = nim.substring(4, 7);
        String angkatan = nim.substring(0, 4);
        String namaProdi = "";
        // artinya 4-7 = 3 jadi mengambil 3 angka dari pointer angka ke -4
        //System.out.println("Kode Prodi = " + kodeprodi);
        //System.out.println("Angkatan = " + angkatan);

        if (kodeprodi.equals( "071")) {
            namaProdi = "Informatika";
        }
        System.out.println("Nim : " + nim);
        System.out.println("Nama Prodi: " + namaProdi);

    }

}

/* Nilai total :
Jika >=  80, maka A
Jika 70 - 79, maka B
jika 60 - 69, maka C
Jika 50 - 59, maka D
Jika < 50, maka E
 */