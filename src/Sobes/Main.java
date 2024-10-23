package Sobes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();

                int b = scanner.nextInt();
                number(a,b);

            }
            public static String number(int a, int b){
                String s = new String();
                if(a> b){
                    s = "Первое число больше второго";
                    System.out.println(s);
                }
                if(a< b){
                    s = "Первое число меньше второго";
                    System.out.println(s);}
                else{
                    s = "Числа равны";
                    System.out.println(s);}
                return  s;
            }


        }
    

