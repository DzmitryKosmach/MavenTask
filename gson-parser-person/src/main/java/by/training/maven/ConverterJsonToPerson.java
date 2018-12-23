package by.training.maven;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConverterJsonToPerson {
    public static Person convert (String[] fileNames){
        String jsonFileName = null;
        try {
            jsonFileName = fileNames[0];
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader(jsonFileName));
            Person person = gson.fromJson(reader, Person.class);
            return person;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Missing parameter");
        } catch (FileNotFoundException e) {
            System.err.println("The json file: " + jsonFileName + " do not found!");
        } catch (JsonSyntaxException e) {
            System.err.println("Invalid JSON object!");
        }
        return null;
    }

}
