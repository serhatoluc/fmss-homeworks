import java.util.Scanner;

//ODEV8
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin yılın kaçıncı
	günü olduğunu döndüren getDayOfYear isimli metodu yazınız ve test ediniz. Metot geçersiz bir tarih için
	-1 değerini döndürecektir
----------------------------------------------------------------------------------------------------------------------*/


public class GetDayOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        int month;
        int year;
        int result;

        System.out.print("Lütfen kontrol etmek istediğiniz tarihin gününü giriniz: ");
        day = input.nextInt();
        System.out.print("Lütfen kontrol etmek istediğiniz tarihin ayını giriniz: ");
        month = input.nextInt();
        System.out.print("Lütfen kontrol etmek istediğiniz tarihin yılını giriniz: ");
        year = input.nextInt();

        result = getDayOfYear(day, month, year);
        System.out.printf("\nGirmiş olduğunuz tarihe göre bu gün yılın %d'inci günü.\n", result);

    }
    static int getDayOfYear (int day, int month, int year){
        int result = 0;

        if ((month == 2) && (day == 29)){
            if (year % 4 == 0) {
                System.out.printf("\nGirmiş olduğunuz : %d / %d / %d tarihi doğru bir tarihtir.", day, month, year);
                result = whichDay(day, month);
            }else {
                System.out.println("Girmiş olduğunuz tarih hatalı, lütfen tekrar deneyiniz.");
                return -1;
            }
        } else if ((year >= 0) && (month == 2) && (day <= 28)) {
            System.out.printf("\nGirmiş olduğunuz : %d / %d / %d tarihi doğru bir tarihtir.", day, month, year);
            result = whichDay(day, month);
        } else if ((year >= 0) && ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (day > 0 && day <= 31)) {
            System.out.printf("\nGirmiş olduğunuz : %d / %d / %d tarihi doğru bir tarihtir.", day, month, year);
            result = whichDay(day, month);
        } else if ((year >= 0) && ((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 0 && day <= 30)) {
            System.out.printf("\nGirmiş olduğunuz : %d / %d / %d tarihi doğru bir tarihtir.", day, month, year);
            result = whichDay(day, month);
        } else {
            System.out.println("Girmiş olduğunuz tarih hatalı, lütfen tekrar deneyiniz.");
            return -1;
        }

        return result;
    }

    static int whichDay (int day, int month){
        int result = 0;

        switch (month) {
            case 1:
                result = day;
                break;
            case 2:
                result = (31 + day);
                break;
            case 3:
                result = (59 + day);
                break;
            case 4:
                result = (90 + day);
                break;
            case 5:
                result = (120 + day);
                break;
            case 6:
                result = (151 + day);
                break;
            case 7:
                result = (181 + day);
                break;
            case 8:
                result = (212 + day);
                break;
            case 9:
                result = (243 + day);
                break;
            case 10:
                result = (273 + day);
                break;
            case 11:
                result = (304 + day);
                break;
            case 12:
                result = (334 + day);
                break;
        }
        return result;
    }
}
