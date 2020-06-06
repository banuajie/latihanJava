package latihan;

public class variable {
    public static void main(String args[]){
        // cara penulisan variable yang ke 1
        int hasil = 10;
        double ipk = 3.06;
        char kelas = 'B';
        String kegiatan = "Belajar permrograman Java";

        System.out.println(hasil);
        System.out.println(ipk);
        System.out.println(kelas);
        System.out.println(kegiatan);
        System.out.println("=========================");
        
        // cara penulisan variable ke 2
        int a, b, c;
        a = 3;
        b = a;
        a = a+b;
        c = b+b+a;
        
        // nilai a akan berubah menjadi "6" karena nilai yang berlaku adalah nilai variable yang terakhir
        // berarti nilai c = 3+3+6
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
