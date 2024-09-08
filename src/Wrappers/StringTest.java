package Wrappers;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args)
    {
        String str1 = "Literal";
        String str2 = new String("new");
        char[] chars = {'s', 't', 'r', 'i', 'n', 'g'};
        String str3 = new String(chars);
        byte[] bytes = {72, 101, 108, 108, 111};
        String str4 = new String(bytes);
        StringBuilder sb = new StringBuilder("StringBuilder");
        String str5 = sb.toString();

        String fruits = "Orange,Apple,Pomegranate,Pear";
        String[] fruitArray = fruits.split(",");

        String longestFruit = "";

        for (String fruit : fruitArray) {
            if (fruit.length() > longestFruit.length()) {
                longestFruit = fruit;
            }
        }
        System.out.println("Longest fruit: " + longestFruit.toLowerCase());

        for (String fruit : fruitArray) {
            System.out.println("Reduction: " + fruit.substring(0, 3));
        }

        String newStr = "   Я_новая_строка      ";
        newStr = newStr.trim();
        newStr = newStr.replace('_', ' ');
        System.out.println("Processed string: \"" + newStr + "\"");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();

        System.out.println("Вы ввели: " + input);

        if (input.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }

        if (input.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }

        if (input.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        StringBuilder builder = new StringBuilder();
        builder.append(str1).append("\n").append(str2).append("\n").append(str3).append("\n")
                .append(str4).append("\n").append(str5).append("\n").append(fruits).append("\n")
                .append(newStr).append("\n");

        builder.reverse();

        System.out.println("Expanded string: \n" + builder.toString());
    }
}
