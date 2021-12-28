package proje1;



import java.util.Scanner;

public class SesliHarfSayisi {

    /*
      Girilen bir stringdeki sesli harf sayısını return eden
      parametre olarak bir String alacak ve int olarak sesli harf sayısını
      return edecek getSesliSayisi() isimli bir method yazın.
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız. Scanner classı da burada tanımlayınız
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(getSesliSayisi(str));
    }

    // bu methodun parametre ve return typelarını doğru yapılandırın
    public static int getSesliSayisi(String str){
        String sesliHarfler ="aeıioöuü";
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if(sesliHarfler.indexOf(str.charAt(i))>-1);  //-1 in mantığı ise index en son 0 a kadar devam edebilir
            count++;
            //indexOf methodu String e ait bir method ve bir String içerisinde aradığımız karakterin hangi sırada  olduğunu tam sayı (int) şeklinde verir.
            //buradaki -1 in esas mantığından biri de indexof methodunda String de olmayan bir karakter girince -1 sonucu veriyor.
            //Yani index in -1 den büyük olması demek girilen ifadenin Stringde yer alması demek


        }
        return count;
    }
}
