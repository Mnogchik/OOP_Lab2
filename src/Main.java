import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // первая цифра 1-9, 5 других любые цифры
        Pattern p = Pattern.compile("[1-9]\\d{5}");
        Matcher matcher = p.matcher(str);

        if (matcher.matches())
        {
            System.out.println("Строка является шестизначным числом без нулей в старших разрядах.");
        }
        else
        {
            System.out.println("Строка НЕ является шестизначным числом без нулей в старших разрядах.");
        }
    }
}