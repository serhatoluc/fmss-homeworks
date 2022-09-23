import java.util.Scanner;

//ODEV7
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin geçerli bir
	tarih olup olmadığını test eden isValidDate isimli metodu yazınız ve test ediniz
----------------------------------------------------------------------------------------------------------------------*/

public class TrueDate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.print("Lütfen kontrol etmek istediğiniz tarihin gününü giriniz: ");
        day = input.nextInt();
        System.out.print("Lütfen kontrol etmek istediğiniz tarihin ayını giriniz: ");
        month = input.nextInt();
        System.out.print("Lütfen kontrol etmek istediğiniz tarihin yılını giriniz: ");
        year = input.nextInt();

        isValidDate(day, month, year);

    }

    static void isValidDate (int day, int month, int year){
        if ((month == 2) && (day == 29)){
            if (year % 4 == 0) {
                System.out.printf("Girmiş olduğunuz : %d / %d / %d tarihi doğru bir tarihtir.", day, month, year);
            }else {
                System.out.println("Girmiş olduğunuz tarih hatalı, lütfen tekrar deneyiniz.");
            }
        } else if ((year >= 0) && (month == 2) && (day <= 28)) {
            System.out.printf("Girmiş olduğunuz : %d / %d / %d tarihi doğru bir tarihtir.", day, month, year);
        } else if ((year >= 0) && ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (day > 0 && day <= 31)) {
            System.out.printf("Girmiş olduğunuz : %d / %d / %d tarihi doğru bir tarihtir.", day, month, year);
        } else if ((year >= 0) && ((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 0 && day <= 30)) {
            System.out.printf("Girmiş olduğunuz : %d / %d / %d tarihi doğru bir tarihtir.", day, month, year);
        } else {
            System.out.println("Girmiş olduğunuz tarih hatalı, lütfen tekrar deneyiniz.");
        }
    }
}
