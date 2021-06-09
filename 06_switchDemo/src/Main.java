public class Main {

    public static void main(String[] args) {
        //öğrenci sınav notu mesajı
        char grade = 'A';
        //char grade = 'B';
        //char grade = 'C';
        //char grade = 'D';
        //char grade = 'F';
        //char grade = 'E';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                /*System.out.println("Çok Güzel : Geçtiniz");
                break;*///C case i ile aynı çıktıyı verir
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
            //control + shift + alt + L -- code format intellij
        }
    }
}
