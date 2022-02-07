package com.aquam.unit_12.Map;

import com.aquam.unit_12.ToyTrain;

import java.util.HashMap;
import java.util.Map;
// HashMap это несортированный нобор ключ-значение,
// TreeMap ищет место, чтобы вставить эл-т, так как там эл-ты отсортированы
// Unmodifiable map - эл-ты добавить и изменить нельзя, только в некоторых случаях можно, если я сама создам метод (?)
public class MainMap {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("English", "Hello");
        languages.put("German", "Hallo");
        languages.put("Russian", "Privet");

        System.out.println(languages.put("Russian", "Dobroe utro"));    // Privet
        System.out.println(languages.put("Italian", "Ciao"));   // null

        System.out.println(languages.get("Russian"));   // Dobroe utro
        System.out.println(languages.get("GermanGerman"));  // null

        System.out.println(languages.containsKey("English"));   // true

        // no order in HashMap
        for (String oneKey : languages.keySet()) {
            System.out.println(oneKey + " : " + languages.get(oneKey));
        }

        languages.remove("Russian");
        for (String key : languages.keySet()) {
            System.out.println(languages.get(key));
        }

        // key can not be changed
        // Map can not be a key, other classes can
        languages.replace("English", "Hi");
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
