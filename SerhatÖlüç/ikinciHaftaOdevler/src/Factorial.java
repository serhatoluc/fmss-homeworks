import java.util.Scanner;


//ODEV5
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyelini döndüren factorial isimli
	metodu yazınız ve test ediniz.
	Açıklamalar:
	- Metot negatif sayılar için -1 değerini döndürecektir
	- Faktoriyel tanımı:
		0!= 1
		1!=1
		2!=1*2
		...
		n!=1 * 2 * ...* (n - 1) * n
	- Sınır taşması gözardı edilecektir
----------------------------------------------------------------------------------------------------------------------*/

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int result;

        System.out.print("Lütfen Faktoriyelini Hesaplamak İstediğiniz Sayıyı Giriniz: ");
        number = input.nextInt();

        result = factorial(number);
        System.out.print(number + "! = " + result);
    }

    static int factorial (int number) {
        int result = 1;

        if (number < 0) {
            return -1;
        }

        while (number != 0) {
            result *= number;
            number --;
        }

        return result;
    }
}
