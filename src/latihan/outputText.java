package latihan;

public class outputText {
    public static void main(String args[]){
        // Menampilkan output text cara sederhana
        System.out.println("Belajar bahasa");
        System.out.println("Java");
        System.out.println("Di Duniailkom");
        
        System.out.println("================");
        
        // Menampilkan output text dengan variable
        String nama = "Nugraha Banuajie";
        
        System.out.print("Halo ");
        System.out.println(nama);
        System.out.println("Salam Kenal...");
        
        System.out.println("================");
        
        // Menampilkan output text dengan variable secara bersamaan ke-1
        String namaToko = "toko Berkah";
        
        System.out.println("Saya beli beras di " + namaToko);
        System.out.println("Samping Puskesmas...");
        
        System.out.println("================");
        
        // Menampilkan output text dengan variable secara bersamaan ke-2
        String namaPerusahaan = "Bank Mandiri";
        
        System.out.println("Saya bekerja di " + namaPerusahaan + " sebagai Java Developer");
        
        System.out.println("================");
        
        //menampilkan output text dengan "System.out.printf" dan "System.out.format"
        String namaKaryawan = "Ajie";
        
        System.out.printf("Hallo %s, salam kenal...", namaKaryawan);
        System.out.println();
        System.out.format("Hallo %s, salam kenal...", namaKaryawan);
    }
}
