package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        Menu menu = new Menu();
        menu.DisplayMenu();
        String B = keyboard.nextLine();
        do {

            if(B.equals("/exit"))break;
           // if(B.equals("X"))break;
            switch (B) {
                case "/info":
                {
                    Info info = new Info();
                    info.DisplayInfo();
                    break;
                }
                case "/read":
                {
                    readFile Cheta = new readFile();
                    Cheta.readFromFile();
                    break;
                }
                case "/write":
                {
                    WriteFile Pisha = new WriteFile();
                    Pisha.WriteIntoFile();
                    break;
                }
                case "/help":
                {
                    menu.DisplayMenu();
                }

            }
            B = keyboard.nextLine();

        }while(!B.equals("/exit"));

    }
}