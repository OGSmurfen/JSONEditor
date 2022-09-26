package org.example;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public void WriteIntoFile() {
        Scanner keyboardTwo = new Scanner(System.in);
        System.out.println("Enter number of people:");
        int numberNames = Integer.parseInt(keyboardTwo.nextLine());

        for(int i=0; i<numberNames; i++)
        {
            System.out.println("Enter name:");
            String name = keyboardTwo.nextLine();
            System.out.println("Enter age:");
            Double age = Double.valueOf(keyboardTwo.nextLine());

            JSONObject objectOne = new JSONObject();
            objectOne.put("name", name);
            objectOne.put("age", age);


            try (FileWriter file = new FileWriter("demo.json")) {
                file.write("[" + objectOne.toString() + "]");
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("File overwritten!");
    }
}
