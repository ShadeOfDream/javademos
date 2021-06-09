public class Main {

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 23;
        //verilen 3 sayıdan en büyüğünü bulma
        if(sayi1 > sayi2 && sayi1 > sayi3){
            System.out.println("Verilen 3 sayıdan, Sayi1 en büyük sayıdır. Sayı: "+sayi1);
        }else if (sayi2 >sayi1 && sayi2>sayi3){
            System.out.println("Verilen 3 sayıdan, Sayi2 en büyük sayıdır. Sayı: "+sayi2);
        }else{
            System.out.println("Verilen 3 sayıdan, Sayi3 en büyük sayıdır. Sayı: "+sayi3);
        }
        //çözüm
        int enBuyuk =sayi1;
        if(enBuyuk < sayi2){
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı : " +enBuyuk);

    }
}
