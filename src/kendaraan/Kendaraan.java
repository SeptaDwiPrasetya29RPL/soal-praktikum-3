
package kendaraan;

import java.util.Scanner;


public class Kendaraan {
    static Scanner in = new Scanner(System.in);
    //Menambahkan Sifat Static pada Variable
    static String jenis;
    static String nama;
    static String cc;
    static String brand;
    static String kapasitas;

    static void data(){
        System.out.print("masukkan jenis kendaraan : ");
        jenis = in.nextLine();
        System.out.print("masukkan nama kendaraan : ");
        nama = in.nextLine();
        System.out.print("masukkan brand kendaraan : ");
        brand = in.nextLine();
        System.out.print("masukkan besar cc kendaraan : ");
        cc = in.nextLine();
        System.out.print("masukkan kapasitas kendaraan : ");
        kapasitas = in.nextLine();

    }
    static void out(){
        System.out.println("==========================");
        System.out.println("----- DATA KENDARAAN -----");
        System.out.println("NAMA            : "+jenis);
        System.out.println("NISN            : "+nama);
        System.out.println("T.T.L           : "+brand);
        System.out.println("JENIS KELAMIN   : "+cc);
        System.out.println("AGAMA           : "+kapasitas);

        System.out.println("=========================");
        
    
}
}
