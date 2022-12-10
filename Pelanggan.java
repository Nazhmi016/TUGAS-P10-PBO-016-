import java.util.Scanner;
public class Pelanggan {
    int id_pelanggan;
    String nama;
    String no_hp;


    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA PELANGGAN");
        System.out.println("Masukan ID Pelanggan   : ");
        id_pelanggan=input.nextInt();
        System.out.println("Masukan Nama   :");
        nama= input.next();
        System.out.println("Masukan No HP :");
        no_hp= input.next();
    }

    void lihat_data(){

    }
}