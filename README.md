# JSONEditor
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

            if(B.equals("x"))break;
            if(B.equals("X"))break;
            switch (B) {
                case "0":
                {
                    Info info = new Info();
                    info.DisplayInfo();
                    break;
                }
                case "1":
                {
                    readFile Cheta = new readFile();
                    Cheta.readFromFile();
                    break;
                }
                case "2":
                {
                    WriteFile Pisha = new WriteFile();
                    Pisha.WriteIntoFile();
                    break;
                }
                case "m":
                {
                    menu.DisplayMenu();
                }

            }
            B = keyboard.nextLine();

        }while(!B.equals("X"));

    }
}
