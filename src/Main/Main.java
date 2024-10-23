package Main;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String s = new String();
        for (int i = 0; i< string.length(); i++){
          if (string.charAt(i) % 2 == 0){
              s = s.concat(Character.toString(i));
          }
            System.out.println(s.toString());
        }



    }
}
