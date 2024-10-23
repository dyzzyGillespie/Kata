import java.util.Scanner;

public class Sobes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        System.out.println("Введите букву");
        char c = scanner.next().charAt(0);
        letterSum(text,c);

    }
    public static void letterSum(String text,char ch){
        int count = text.length() - text.replaceAll(String.valueOf(ch),"").length();
        System.out.println(count);

       }
    }


