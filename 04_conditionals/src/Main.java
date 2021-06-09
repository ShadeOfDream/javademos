public class Main {

    public static void main(String[] args) {
        //int sayi = 20;
        // int sayi = 19;
        //int sayi = 14;
        int sayi = 24;
        if(sayi < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        }
        /*if(sayi < 15) {
            System.out.println("Sayı 15'ten küçüktür");
        }*/
        else if (sayi == 20){
            System.out.println("Sayı 20'ye eşittir.");
        }
        else{
            System.out.println("Sayı 20'den büyüktür.");
        }
        //defensive programming - olası tüm şartlara karşılık verebilmesi
    }
}
