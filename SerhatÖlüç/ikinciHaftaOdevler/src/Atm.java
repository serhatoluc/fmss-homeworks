import javax.sound.midi.Soundbank;
import java.util.Scanner;

//ODEV 10
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden bir kullanıcı adı ve şifre isteyen basit ATM uygulamasının bir parçasını aşağıdaki
	açıklamalara göre yazınız:
	Açıklamalar:
	- Kullanıcı adı ve şifre 3 kez denenebilecektir
	- 3 kez deneme sırasında doğru giriş yapılırsa "Giriş Başarılı", 3 kez deneme de yanlış olursa
	"Giriş Başarısız. Deneme hakkınız bitti" mesajı verilecektir.
	- Kullanıcı adı ve şifrenin doğruluğu program içerisinde belirlenen bir kullanıcı adı ve şifre ile yapılacacktır
----------------------------------------------------------------------------------------------------------------------*/


public class Atm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName = "serhatoluc";
        String userPassword = "123456-";
        String receivedName;
        String receivedPassword;
        int right = 3;

        System.out.println("***** FMSS Bank'a Hoşgeldiniz *****");

        while (right != 0) {

            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            receivedName = input.nextLine();
            System.out.print("Lütfen kullanıcı şifrenizi giriniz: ");
            receivedPassword = input.nextLine();

            if (receivedName.equals(userName) && receivedPassword.equals(userPassword)) {
                System.out.println("Giriş Başarılı, Hoşgeldiniz...");
                break;
            } else {
                System.out.println("Hatalı bir giriş yaptınız lütfen tekrar deneyiniz.");
                right --;
            }
        }

        if (right == 0) {
            System.out.println("Giriş Başarısız, Deneme Hakkınız Bitti.");
        }
    }
}
