package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class readFile {
    public void readFromFile() throws IOException {
        String data = new String(Files.readAllBytes(Paths.get("./demo.json")));

        //read as json array
        JSONArray jsonArray = new JSONArray(data);

        for(int i = 0; i < jsonArray.length(); i++){
            //parse in json object

            String str = jsonArray.get(i).toString();

            JSONObject object1 = new JSONObject(str);

            String name = object1.getString("name");
            int age = object1.getInt("age");
            System.out.println("Name: " + name);
            System.out.println("Age:" + age);
        }
    }
}
