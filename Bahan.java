import java.util.Scanner;
public class Bahan {
    int id_bahan;
    String nama;
    String tugas;


    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA BAHAN");
        System.out.println("Masukan ID Bahan  : ");
        id_bahan=input.nextInt();
        System.out.println("Masukan Nama Bahan   :");
        nama= input.next();
        System.out.println("Masukan Jenis Bahan   :");
        tugas= input.next();
    }
    void update_data(){

    }
}