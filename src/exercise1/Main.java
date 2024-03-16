package exercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wordsList = List.of("Hello", "World", "Java", "Programming", "Language", "Hi");

        //1. Filter out words containing the letter "a"
        List<String> list1 = wordsList.stream().filter(w -> w.contains("a")).toList();
        System.out.println("==================Words containing the letter \"a\"==================");
        System.out.println(list1);

        //2. Filter out words longer than 3 and transform each word into its inverse.
        List<String> list2 = wordsList.stream().filter(w -> w.length() > 3).map(w -> new StringBuilder(w).reverse().toString()).toList();
        System.out.println("===================Words longer than 3 and its inverse===================");
        System.out.println(list2);

        //3. Filter strings containing the letter "e" and flatten each string into a list of its characters.
        List<String> list3 = wordsList.stream().filter(w -> w.contains("e")).flatMap(w -> w.chars().mapToObj(c -> String.valueOf((char) c))).toList();
        System.out.println("===================Strings containing the letter \"e\" and its characters===================");
        System.out.println(list3);

        //4. Transform each string into its uppercase version.
        List<String> list4 = wordsList.stream().map(String::toUpperCase).toList();
        System.out.println("============Transform each string into its uppercase version==============================");
        System.out.println(list4);

        //5. Convert each string into its length.
        List<Integer> wordsLengths = wordsList.stream().map(String::length).toList();
        System.out.println("=============Words Lengths=====================================");
        System.out.println(wordsLengths);

        //6. Transform each string into a list of its characters, then flatten all lists into a single list of characters.
        List<Character> list6 = wordsList.stream().flatMap(w -> w.chars().mapToObj(c -> (char) c)).toList();
        System.out.println("=============List of its characters, then flatten all lists into a single list of characters====================");
        System.out.println(list6);

        //7.From a list of words, transform each name into a string of the form "Name - Index", where the index represents the position of the name in the list.
        List<String> list7 = wordsList.stream().map(w -> w + " - " + wordsList.indexOf(w)).toList();
        System.out.println("=============Add the index of each word to the end of the word====================");
        System.out.println(list7);
    }
}
