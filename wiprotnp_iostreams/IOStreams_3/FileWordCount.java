import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();

        TreeMap<String, Integer> map = new TreeMap<>();

        try {
            Scanner file = new Scanner(new File(inputFile));

            while (file.hasNext()) {
                String word = file.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }

            file.close();

            FileWriter writer = new FileWriter(outputFile);

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }

            writer.close();

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("File not found");
        }

        sc.close();
    }
}