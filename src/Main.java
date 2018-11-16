/*
Exercise 1
Matilda has finished writing an article and wants to print it.
Develop the code that she uses to write an article and print it.
Follow the instructions below:
You need the following classes: Article, Printer and PrintApplication.
An Article has a title and a text. It also has the methods getTitle and getText.
A Printer can print an article, which means it just writes the title and the text on the screen.
In the PrintApplication class main method, create an Article and a Printer and print the article with the printer.

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your text: ");
        Scanner scanner = new Scanner(System.in);
        String articleText = scanner.nextLine();
        System.out.println("Your username is " + articleText);

    }
}
