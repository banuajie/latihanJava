package latihan;

import java.util.Scanner;

public class deretAngkaFPB {
    public static void main(String args[]){
        int a, b, x, y, z;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai A       : ");
        a = input.nextInt();
        System.out.print("Masukan Nilai B       : ");
        b = input.nextInt();
        System.out.print("Masukan Nilai Batas   : ");
        z = input.nextInt();
        
        System.out.println();
        
        for(x=a;x<=z;x=x+a){
            if(x%b == 0){
                System.out.print("(" + x + ") ");
            }
            else{
                System.out.print("" + x + " ");
            }
        }
        
        System.out.println();
        
        for(y=b;y<=z;y=y+b){
            if(y%a == 0){
                System.out.print("(" + y + ") ");
            }
            else{
                System.out.print("" + y + " ");
            }
        }
    }
}