import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        /*
        Soru:       Kullanicidan bir harf isteyin,
                    girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
                    yoksa girilen harfi yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='a' && krk<='z'){
            // kucuk harf girildi demektir
            System.out.println((char)(krk-32));

        }else{
            // kucuk harf degil demektir
            System.out.println(krk);
        }


    }
}
