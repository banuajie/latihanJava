package latihan;

import java.util.Scanner;

public class inputData {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Anda : ");
        String nama = input.nextLine();
        System.out.print("Username  : ");
        String akun = input.nextLine();
        System.out.print("Usia      : ");
        int usia = input.nextInt();
        
        System.out.println();
        
        System.out.println("Selamat datang " + nama);
        System.out.println("Anda login sebagai " + akun);
        System.out.println("Semoga di usia Anda yang ke " + usia + " diberikan kesehatan selalu, aamiin...");
        /*
            Selain "nextLine" dan "nextInt" ada banyak input tipe data, diantaranya :
                - nextBoolean()
                - nextByte()
                - nextDouble()
                - nextFloat()
                - nextInt()
                - nextLine()
                - nextLong()
                - nextShort()
        */
    }
}