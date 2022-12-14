package wordreversal;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the words");
        String words = scanner.nextLine();
        String[] word = words.split(" ");
        Iterator<String> iterator = Arrays.stream(word).
                sorted(Comparator.reverseOrder()).iterator();

       String reversal = "";
        while (iterator.hasNext()){
            reversal += iterator.next();
            reversal += " ";
        }
        System.out.println(reversal);
    }
}
