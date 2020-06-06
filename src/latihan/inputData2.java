package latihan;

import java.util.Scanner;

public class inputData2 {
    public static void main(String args[]){
        String nama, alamat;
        int umur;
        double ipk;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("## Biodata Mahasiswa ##");
        System.out.println("=======================");
        
        System.out.print("Nama      : ");
        nama = input.nextLine();
        
        System.out.print("Umur      : ");
        umur = input.nextInt();
        
        System.out.print("IPK       : ");
        ipk = input.nextDouble();
        input.nextLine();
        /*
            Tambahan "input.nextLine()" diatas diperlukan sebagai trik agar tidak bermasalah
            dengan karakter "Enter" yang kita input setelah mengisi nilai ipk.
            Tanpa perintah ini, proses input alamat tidak bisa dilakukan karena secara
            otomatis langsung berisi karakter "Enter" yang ditekan pada saat mengakhiri input ipk.
        */
        
        System.out.print("Alamat    : ");
        alamat = input.nextLine();
        
        System.out.println("=======================");
        System.out.println();
        
        System.out.println(nama + " berusia " + umur + " tahun");
        System.out.println("Memiliki IPK " + ipk);
        System.out.println("Dan beralamat di " + alamat);
    }
}
