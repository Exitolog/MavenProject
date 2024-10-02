package ru.geekbrains;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;

import java.lang.reflect.Type;

/**
 * Hello world!
 *
 */
public class App 

{
    public static void main( String[] args ) {
        Person ivan = new Person("Ivan", "Ivanov", 20);
        Gson gson = new Gson();
        String json = gson.toJson(ivan);
        System.out.println("Сериализованный обьект: " + json);

        Person deserializ = gson.fromJson(json ,Person.class);
        System.out.println("Десериализованный обьект: " + deserializ);

    }
}
