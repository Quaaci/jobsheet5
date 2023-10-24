import java.util.Scanner;

/**
 * PemilihanPercobaan127
 */
public class PemilihanPercobaan127 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.println("Masukan angka:  ");
        int angka = input00.nextInt();

        String jenis = (angka % 2 == 0) ? "genap" : "ganjil";
           System.out.println(jenis);
       
    }
} 
