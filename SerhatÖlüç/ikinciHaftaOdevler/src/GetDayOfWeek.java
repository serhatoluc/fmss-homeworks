import java.util.Scanner;

//ODEV 9
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki
	açıklamalara göre haftanın hangi gününe geldiğini döndüren getDayOfWeek metodunu yazınız.
	Açıklamalar:
		- Metot geçersiz bir tarih için -1 değerini döndürecektir.
		- Haftanın günü 1.1.1900 ile verilen tarih arasındaki gün sayısının 7 değerine modu alınarak bulunabilir
		- 7 değerine mod alındıktan sonra sıfır Pazar, 1 pazartesi, .., 6 cumartesi günü için
		elde edilecek değerdir
		- 1.1.1900' den önceki tarihler geçersiz kabul edilecektir
----------------------------------------------------------------------------------------------------------------------*/



public class GetDayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        int month;
        int year;
        int result;
        String rightDay;

        System.out.print("Lütfen kontrol etmek istediğiniz tarihin gününü giriniz: ");
        day = input.nextInt();
        System.out.print("Lütfen kontrol etmek istediğiniz tarihin ayını giriniz: ");
        month = input.nextInt();
        System.out.print("Lütfen kontrol etmek istediğiniz tarihin yılını giriniz: ");
        year = input.nextInt();

        result = getDayOfYear(day, month, year);
        System.out.printf("\nGirmiş olduğunuz tarihe göre bu gün yılın %d'inci günü.\n", result);
        rightDay = whichDayWeek(result);
        System.out.print("Bu gün günlerden " + rightDay + ".\n");

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

    static String whichDayWeek (int result){
        int modDay = (result % 7);
        String resultDay = "";

        switch (modDay) {
            case 0:
                resultDay = "Pazar";
                break;
            case 1:
                resultDay = "Pazartesi";
                break;
            case 2:
                resultDay = "Salı";
                break;
            case 3:
                resultDay = "Çarşamba";
                break;
            case 4:
                resultDay = "Perşembe";
                break;
            case 5:
                resultDay = "Cuma";
                break;
            case 6:
                resultDay = "Cumartesi";
                break;
        }
        return resultDay;
    }
}
