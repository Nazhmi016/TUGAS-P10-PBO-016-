import java.util.Scanner;
public class Penjahit{
    int id_penjahit;
    String nama;


    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA PENJAHIT");
        System.out.println("Masukan ID Penjahit   : ");
        id_penjahit=input.nextInt();
        System.out.println("Masukan Nama   :");
        nama= input.next();
    }
    void update_data(){

    }
}