package by.training.maven;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.JsonSyntaxException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello, girl! " + ConverterJsonToPerson.convert(args));
    }
}
