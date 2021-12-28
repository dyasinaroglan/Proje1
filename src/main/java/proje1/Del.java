package proje1;

import java.util.Scanner;

public class Del {
    /*
        Kullanıcıdan bir metin girmesini isteyin
        girilen metinde "del" yer alıyor ise silin ve silinmiş halini ekrana yazdırın,
        "del" yer almıyor ise metni olduğu gibi yazdırın
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız
        Scanner scanner = new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle= scanner.nextLine();
       if(cümle.contains("del")){
           System.out.println(cümle.replace("del",""));
        }
       else {
           System.out.println(cümle);
       }



    }


}
