public class Q9 {

    public static void main(String[] args) {
        /*
        Soru:   kullanicidan bir tam sayi alin
                sayi negatif ise "gecersiz sayi"
                tek basamakli ise "rakam"
                iki basamakli ise "iki basamakli sayi"
                bunun disindaki sayilar icin "buyuk sayi" yazdirin
         */

        int sayi= -20;

        if (sayi<0){
            System.out.println("gecersiz sayi");
        }else if(sayi<10){
            System.out.println("rakam");
        } else if (sayi<100) {
            System.out.println("iki basamakli sayi");
        }else {
            System.out.println("buyuk sayi");
        }
    }
}
