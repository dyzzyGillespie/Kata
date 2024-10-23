import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculated(scanner.nextInt(),scanner.next().charAt(0),scanner.nextInt());

    }
    public static void  calculated(int a,char c ,int b ){
        switch (c){
            case '+':
                int result = a + b;
                System.out.println(result);
                break;
            case '-':
                result =  a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                result = a / b;
                System.out.println(result);
            default:
                System.out.println("Ошибка");
        }


    }
}
