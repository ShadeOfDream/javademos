public class Main {

    public static void main(String[] args) {
        //intellisense: . > open menu
        //reusability: bir kere yaz, defalarca kullan, aynısını yazma. kodun, tekrar tekrar kullanılabilirliği
        //code refactoring: kodları temizleme
        /*System.out.println("Öğrenci sayım : 9"); // +1 öğrenci eklendiğinde her satır güncellenmesi iş yükünü arttırıyor
        System.out.println("Öğrenci sayım : 10");
        System.out.println("Öğrenci sayım : 10");
        System.out.println("Öğrenci sayım : 10");*/
        //int ogrenciSayisi = 11; //camel case - variable name
        int ogrenciSayisi = 12;
        String mesaj = "Öğrenci Sayısı : "; //tekrar tekrar kullanabilmek ve hafızadan tasarruf etmek
        System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
    }
}
