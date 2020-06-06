package latihan;

public class tipeDataInteger {
    public static void main(String args[]){
        byte var1;      // jangkauan maksimal nilai byte -128 hingga 127
        short var2;     // jangkauan maksimal nilai short -32,768 hingga 32,767
        int var3;       // jangkauan maksimal nilai int -2,147,483,648 hingga 2,147,483,647
        long var4;      // jangkauan maksimal nilai long -9,223,372,036,854,775,808 hingga 9,223,372,036,854,775,807
        
        var1 = 120;
        var2 = 32000;
        var3 = 1000000000;
        var4 = 1000000000000000L;   // Karakter "L" diperlukan karena secara default angka bulat di Java dianggap sebagai int.
    }
}
