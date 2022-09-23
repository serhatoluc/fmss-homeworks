import java.util.Scanner;

//ODEV 2
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren getReverse isimli metodu
	yazınız ve test ediniz. Örneğin -123 sayısı için metot -321 sayısını döndürecektir
	123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
----------------------------------------------------------------------------------------------------------------------*/

public class ReverseGet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int result;



        System.out.print("Lütfen Tersini Çevirmek İstediğiniz Sayıyı Giriniz: ");
        number = input.nextInt();


        System.out.print("Girdiğiniz Sayının Tersi: ");
        getReverse(number);

    }

    static void getReverse (int number){

        while (number != 0) {

            System.out.print(number % 10);
            number /= 10;

        }
    }
}
