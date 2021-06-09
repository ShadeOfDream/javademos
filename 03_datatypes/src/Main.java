public class Main {

    public static void main(String[] args) {
    //değişkenin tuttuğu verinin tipi belirtilmeli : java, tip güvenli dil.
        int sayi = 12;
        //sayi ="Ankara"; //Incompatible types sayi değişkeni int olarak tanımlandığı için string bir değer alamaz.
        //sayi = 13;
        //sayi = 13111111111; //Integer number too large
        byte sayi1 = 13;
        sayi1 =127;
        //sayi1 =128; Incompatible types required: byte Found: int
        //sayi1 = -129;
        double sayi2 = 12.5; //ondalıklı sayıların default u double, genelde  integer.
        // genelde int ve double kullanılır... noktadan sonra daha az hassasiyeti olan sayılarda float , 0-100 arası sayılar için byte, short, tc no üzerinde işlem yapılmadığı için metinsel tutulması,sayısal olarak long tutulması
        char karakter = 'A';
        //ASCII Code ile bu da sayısal karşılını elde etmiş oluyor
        //char karakter2 = "A"; //incompatible types Found: java.lang.String
        //char karakter2 = 'AB'; //Too many characters in character literal
        //String sehir = "Ankara"; //karakter topluluğu
        boolean dogruMu = false; //0 1 değerini tutar
        //sayısal değerler


        ////////////////////////////////////////////////////////////////
        //Primitive type - ilkel tip: bir dilin en temel veri tipleridir.
        // boolean - true/false - 1 byte        -- range
        // char - single character(Unicode) - 2bytes
        // byte - integer - 1 byte - (-128 to 127)
        // short - integer - 2 bytes - (-32768 to 32767)
        // int - integer - 4 bytes
        // long - integer - 8 bytes
        // float - floating point number - 4 bytes
        // double floating point number - 8 bytes
        //////////////////////////////////////////////////////////////////////
    }
}
