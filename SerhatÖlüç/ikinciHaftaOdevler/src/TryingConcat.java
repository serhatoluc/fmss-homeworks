import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ODEV 12
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden quit girilene kadar alınan yazıların arasında - karakteri olacak şekilde
	birleştirilmiş bir String oluşturan programı yazınız.
	Örnek:
	ankara, istanbul, izmir girilirse
	ankara-istanbul-izmir
----------------------------------------------------------------------------------------------------------------------*/

public class TryingConcat {

    public static void main(String[] args) {

        wordConcat();
    }

    public static void wordConcat (){
        Scanner input = new Scanner(System.in);
        String receivedWord;
        int i = 0;
        List<String> words = new ArrayList<>();

        for (i = 0; ; i++){
            System.out.println("Lütfen bir sözcük giriniz");
            receivedWord = input.nextLine();
            if (receivedWord.equals("quit")) {
                break;
            }
            words.add(i, receivedWord);
        }
        /*while (i != 0) {
            System.out.println(words[i]);
        }*/
    }
}
