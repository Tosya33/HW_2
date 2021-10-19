package Lesson_3;

import java.util.*;
public class Words {
    public static void main(String[] args) {
        num1();
        num2();
    }

    private static void num1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "красный", "синий", "желтый", "черный",
                "розовый", "коричневый", "пурпурный",
                "оранжевый", "зеленый", "голубой",
                "бордо", "абрикосовый", "абрикосовый",
                "серый", "серый", "болотный",
                "болотный", "хаки", "хаки", "хаки"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void num2() {
        Directory directory = new Directory();

        directory.add("Алешин", "890022222222");
        directory.add("Иванов", "89105554433");
        directory.add("Ковалев", "89105544233");
        directory.add("Алешин", "89105554438");
        directory.add("Антонов", "89105054433");
        directory.add("Кузин", "89106564433");
        directory.add("Алешин", "89105154437");
        directory.add("Варфоломеев", "89105554431");
        directory.add("Малов", "89155554433");

        System.out.println(directory.get("Алешин"));
        System.out.println(directory.get("Иванов"));
        System.out.println(directory.get("Малов"));
        System.out.println(directory.get("Кузин"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
