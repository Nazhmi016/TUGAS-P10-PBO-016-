import java.util.Scanner;

public class Jahitmenjahit {
    int kode_jahit;
    int id_pelanggan;
    int id_bahan;
    int id_penjahit;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA JAHIT");
        System.out.println("Masukan Kode Jahit       :");
        kode_jahit=input.nextInt();
        System.out.println("Masukan ID Pelanggan      :");
        id_pelanggan= input.nextInt();
        System.out.println("Masukan ID Bahan          :");
        id_bahan= input.nextInt();
        System.out.println("Masukan ID Penjahit       :");
        id_penjahit= input.nextInt();
    }

    void jenis_kelas(){

    }
    void update_data(){

    }

}