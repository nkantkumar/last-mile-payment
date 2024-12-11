package sg.quick.labmda;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class FirstRepeated{
    public static void main(String args[]) {
        String input = "Java Articles are Awesome";

        Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        /* or can also try */

        Set<Character> seenCharacters = new HashSet<>();

      /*  return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seenCharacters.add(c))
                .findFirst()
                .orElse(null);*/
    }
    public void charCheck(){
        String input = "Java Articles are Awesome";
        Set<Character> seenCharacters = new HashSet<>();
        Character c1= input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seenCharacters.add(c))
                .findFirst()
                .orElse(null);
    }
}
