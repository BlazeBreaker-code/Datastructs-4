//Suraj Mohan N01234931
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class WordInAscending {
    public static void main(String[] args) {
        // Set text in a string
        String text = "Good morning. Have a good class. " +
                "Have a good visit. Have fun!";
        // Create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[ \n\t\r.,;:!?(){]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        ArrayList<Instances> list = new ArrayList<>();
        map.forEach((k, v) -> list.add(new Instances(k, v)));
        Collections.sort(list);

        System.out.println("Words in ascending order of occurrence: ");
        String format = "%-15s%d";

        for (Instances word: list) {
            System.out.printf(format, word.word, word.counter);
            System.out.println();
        }
    }

    private static class Instances implements Comparable<Instances> {
        int counter;
        String word;

        public Instances(String word, int counter) {
            this.word = word;
            this.counter = counter;
        }

        @Override
        public int compareTo(Instances o) {
            return (o.counter > counter) ? -1 : 1;
        }
    }
}