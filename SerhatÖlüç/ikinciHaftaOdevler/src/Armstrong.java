import java.util.Scanner;

//ODEV 4
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden
	isArmstrong metodunu yazınız ve test ediniz.
	Açıklamalar:
	- Bir sayının her basamağının basamak sayıncı kuvvetleri toplamı sayının kendisine eşitse bu sayıya Armstrong
	sayısı denir
	153 -> 1 + 125 + 27 = 153
	- Sayı negatif ise false döndürebilirsiniz
----------------------------------------------------------------------------------------------------------------------*/

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int result;

        System.out.print("Lütfen Bir Armstrong Sayısı Olup Olmadığını Belirlemek İstediğiniz Sayıyı Giriniz: ");
        number = input.nextInt();

        result = isArmstrong(number);


    }

    static int isArmstrong (int number){
        int i;
        int newNumber;
        int lastDigit;
        int result = 0;
        int pow = 1;

        newNumber = number;

        for (i = 0; newNumber != 0; i++){
            newNumber /= 10;
        }

        int a = i;

        while (number != 0){

            lastDigit = (number % 10);
            pow = 1;

            while (i != 0) {

                pow *= lastDigit;
                i--;

            }

            result += pow;
            number /= 10;
        }

        System.out.println(result);
        return 1;
    }
}
