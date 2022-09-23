import java.util.Scanner;

//ODEV 1
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren getDigitsCount isimli
	metodu NumberUtil isimli bir sınıfın içerisinde yazınız ve klavyeden alınan değerlerle çağırarak test ediniz

	123 -> 12 -> 1 -> 0
----------------------------------------------------------------------------------------------------------------------*/

public class NumberUtil {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int digit;

        System.out.println("Lütfen Bir Sayı Giriniz: ");
        number = input.nextInt();

        digit = getDigitsCount(number);

        System.out.println("Girdiğiniz Sayı " + digit + " Basamaklıdır.");

    }

    static int getDigitsCount (int number){

        int i = 0;

        for (i = 0; number != 0; i++) {

            number = (number / 10);
            //System.out.println(i + " " + number);

        }

        return i;
    }

}

