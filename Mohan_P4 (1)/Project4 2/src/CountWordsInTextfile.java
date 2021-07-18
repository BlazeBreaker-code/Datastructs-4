//Suraj Mohan N01234931
import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountWordsInTextfile {
    public static void main(String[] args) throws Exception {
        File input = new File(args[0]);
        Map<String, Integer> map = new TreeMap<>();

        //scans the contents of the file
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNext()) {
                //splits when it encounters parameters and then stores it in the map
                String[] word = scan.nextLine().split("[ \n\t\r\"\'.,;:!?()]");
                storage(map, word);
            }
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        // Get key and value from each entry
        System.out.println("Occurrences of words in selected file: ");
        for (Map.Entry<String, Integer> entry: set)
            System.out.println(entry.getValue() + "\t" + entry.getKey());
    }

    private static void storage(Map<String, Integer> map, String[] word) {
        for (int i = 0; i < word.length; i++) {
            String finalAns = word[i].toLowerCase();
            if (finalAns.length() > 0 && Character.isLetter(finalAns.charAt(0))) {
                if (!map.containsKey(finalAns)) {
                    map.put(finalAns, 1);
                } else {
                    int y = map.get(finalAns);
                    y++;
                    map.put(finalAns, y);
                }
            }
        }
    }
}
