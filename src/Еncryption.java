import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.*;


public class Еncryption {
    public static void toEnterTheKey() throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите адрес файла на шифровку.");
        String in = console.nextLine();
        System.out.println("Введите адрес файла для записи.");
        String o = console.nextLine();
        System.out.println("Введите ключ для шифрования");
        int j = console.nextInt();
        j = j % 32;


        String s = Files.readString(Path.of(in));
        StringBuilder strBuilder = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);


            if (Character.isLetter(c)) {
                c = (char) (s.charAt(i) + j);

                if ((Character.isLowerCase(s.charAt(i)) && c > 'я')
                        || (Character.isUpperCase(s.charAt(i)) && c > 'Я'))

                    c = (char) (s.charAt(i) + j);
            }
            strBuilder.append(c);
            String cipherText = strBuilder.toString();

            try (PrintWriter out = new PrintWriter(o)) {
                out.print(cipherText);
            }
        }
    }
}




