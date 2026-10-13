import java.util.Scanner;

public class StudiKasus1_23 {
    public static void main(String[] args) {

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan jumlah cup  : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar  : ");
        uangBayar = sc.nextInt();
        
        sc.close();
    }
}