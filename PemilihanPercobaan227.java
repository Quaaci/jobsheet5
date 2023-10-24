import java.util.Scanner;

public class PemilihanPercobaan227 {
   public static void main(String[] args) {
    Scanner input00 = new Scanner(System.in);
    System.out.println("Nilai uas     :  ");
    float uas = input00.nextFloat();
    System.out.println("Nilai uts     :  ");
    float uts = input00.nextFloat();
    System.out.println("Nilai kus     :  ");
    float kuis = input00.nextFloat();
    System.out.println("Nilai tugas   :  ");
    float tugas = input00.nextFloat();

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

    String message = total < 65 ? "Remidi" : "Tidak remidi";
    System.out.println("Nilai akhir =" + total + "sehingga" + message);

    if (total > 80){
        System.out.println("konversi nilai anda = A ");
    } else if (total > 73){
        System.out.println("konversi nilai anda = B+");
    }else if(total > 65){
        System.out.println("konversi nilai anda = B");
    }else if(total > 60){
        System.out.println("konversi nilai anda = C+");
    }else if(total > 50){
        System.out.println("konversi nilai anda = C");
    }else if(total > 39){
        System.out.println("konversi nilai anda = D");
    }else if(total < 39){
        System.out.println("konversi nilai = E");
    }
    
 

   } 
}
