import java.util.Scanner;

public class StudiKasus223 {
    public static void main(String[] args) {
        String nama, jenis;
        int jumlahDokumen, juara;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine().trim().toLowerCase();

        if (jenis.equals("belmawa") 
            || jenis.equals("bakorma") 
            || jenis.equals("mandiri")) {

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            juara = sc.nextInt();

            if (jumlahDokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang "
                        + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + juara + ").");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            }
        }

        sc.close();
    }
}