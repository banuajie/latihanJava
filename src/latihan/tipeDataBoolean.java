package latihan;

public class tipeDataBoolean {
    public static void main(String args[]){
        boolean var1, var2, var3, var4, var5;
        
        var1 = true;    // penulisan true atau false harus kecil semua
        var2 = false;
        
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        
        System.out.println();
        
        /*
            Umumnya, tipe data boolean di dapat dari hasil operasi perbandingan,
            seperti apakah sebuah angka sama dengan angka lain, apakah lebih besar atau lebih kecil, dst.
        */
        
        var3 = 12 < 10;
        var4 = 30 > 25;
        var5 = 'A' == 'a';
        
        System.out.println("var3 (12 < 10) = " + var3);
        System.out.println("var4 (30 > 25) = " + var4);
        System.out.println("var5 ('A' == 'a') = " + var5);
    }
}
