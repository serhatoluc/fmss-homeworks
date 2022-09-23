import java.util.Scanner;

//ODEV6
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden bir yıl değerine göre yılın artık yıl olup olmadığını
	test eden isLeapYear isimli metodu yazınız ve test ediniz
----------------------------------------------------------------------------------------------------------------------*/

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Lütfen Artık Yıl Olup Olmadığını Bulmak İstediğiniz Yılı Giriniz: ");
        year = input.nextInt();

        leapYearCalculator(year);
    }

    static void leapYearCalculator (int number) {

        if (number % 4 == 0) {
            if ((number % 100 == 0) && (number % 400 == 0)) {
                if (number % 4000 == 0) {
                    System.out.println(number + " Yılı artık yıl değildir.");
                }else {
                    System.out.println(number + " Yılı artık yıldır.");
                }
            }else {
                System.out.println(number + " Yılı artık yıldır.");
            }
        }else {
            System.out.println(number + " Yılı artık yıl değildir.");
        }
    }
}
