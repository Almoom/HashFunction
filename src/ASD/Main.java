package ASD;

/*
Урок 6. Деревья
1. Реализовать простейшую хэш-функцию. На вход функции подается строка, на выходе сумма кодов символов.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку символов:");
        String text = reader.readLine();
        System.out.println(HashFunction(text));
    }
    public static int HashFunction (String t){
        byte[] codes = t.getBytes();
        int sum = 0;
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < codes.length; i++) {
            sum += codes[i];
        }
        return sum;
    }
}
