package latihan;

public class konstanta {
    public static final int KURS_DOLLAR = 14000;
    public static final double PI = 3.06;
    public static final String WEBSITE = "Duniailkom";
    
    public static void main(String args[]){
        /*
            Nilai konstanta adalah konstan (tidak dapat dirubah" nilainya), akan menjadi error bila dirubah nilainya
            Untuk mencobanya silahkan aktifkan variable "KURS_DOLLAR" di bawah ini dengan menghapus tanda "//"
        */
        // KURS_DOLLAR = 13500;
        
        System.out.println("Kurs dollar saat ini " + KURS_DOLLAR);
        System.out.println("IPK saya " + PI);
        System.out.println("Belajar java di " + WEBSITE);
    }
}
