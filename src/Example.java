import javax.security.auth.kerberos.EncryptionKey;
import java.io.IOException;
import java.util.Scanner;

public class Example {

    public static final String ALPHABET = ".,«»:?! абвгдеёжзийклмнопрстуфхцчшщъыьэюя0123456789";
    public static void main(String[] args) throws IOException {
        Start.start();
        Scanner console = new Scanner(System.in);
        int i = console.nextInt();

        if (i == 1) {
            Еncryption.toEnterTheKey();
        } else if (i == 2) {
            Decoding.toEnterTheKey();
        } else if (i == 3) {
            BruteForce.toBruteForce();

        } else {
            System.out.println("Сделайте корректный выбор режима работы.");
        }



    }
}
