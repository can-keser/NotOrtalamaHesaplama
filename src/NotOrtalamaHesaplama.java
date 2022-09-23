import java.util.Scanner;
public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
        int fizik,matematik,biyoloji,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuz:");
        matematik = input.nextInt();
        System.out.print("fizik notunuz:");
        fizik = input.nextInt();
         System.out.print("kimya notunuz:");
        kimya = input.nextInt();
         System.out.print("biyoloji notunuz:");
        biyoloji = input.nextInt();
         System.out.print("turkce notunuz:");
        turkce = input.nextInt();
         System.out.print("tarih notunuz:");
        tarih = input.nextInt();
         System.out.print("muzik notunuz:");
        muzik = input.nextInt();
        double ort=(matematik+muzik+tarih+turkce+fizik+biyoloji+kimya)/7.0;
       String mesaj=ort>=60?"Sınıfı geçti":"Sınıfta kaldı";
       System.out.println("Ortalama puan:"+ort);
       System.out.println("Geçme durumu:"+mesaj);
    }

}
