package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Character[] glassn = {'e', 'y', 'u', 'i', 'o', 'a'}; //созд массив гласных для проверки
        Scanner scan = new Scanner(System.in); //экзампляр класса сканер
        int n = 0; // инициализируем всякое
        char[] chArray;
        int numGlass = 0;
        System.out.println("Enter the number of words:");
        int number = scan.nextInt(); //считываем количество слов
        String[] line = new String[number];
        System.out.println("Enter your words:");
        for (int i = 0; i < number; i++) {
            line[i] = scan.nextLine();
            chArray = line[i].toCharArray();
            n = chArray.length;
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < glassn.length; j++) {
                    if (chArray[k] == glassn[j]) {
                        numGlass++;
                    }
                }
            }
        }

        System.out.println("количество гластных: " + numGlass);
    }
}

