import java.util.Scanner;

//ODEV 3
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren
	pow isimli metodu yazınız.
	Açıklamalar:
	- Math sınıfının pow metodu kullanılmayacaktır
	- Metot b nin negatif değerleri için 1 değerini döndürecektir
	- Metot NumberUtil sınıfı içerisinde yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/


public class NumberUtilPow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base;
        int pow;
        int result;

        System.out.print("Lütfen Taban Sayısını Giriniz: ");
        base = input.nextInt();
        System.out.print("Lütfen Üs Sayısını Giriniz: ");
        pow = input.nextInt();

        result = pow(base, pow);

        System.out.println("İşleminizin Sonucu: " + result);

    }

    static int pow (int base, int pow) {
        int result = 1;

        if (pow < 0){
            return 1;
        }

        for(;pow != 0; pow--){

            result *= base;
        }

        return result;
    }
}
