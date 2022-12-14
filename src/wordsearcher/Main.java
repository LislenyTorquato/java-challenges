package wordsearcher;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String sentence = scanner.nextLine();
        String[] word = sentence.split(" ");
        System.out.println("Enter the comparative word");
        String inputWord = scanner.nextLine();
        boolean equalWord = false;
        for (String w : word){
            if (w.equals(inputWord))
                equalWord = true;
        }
        System.out.println(equalWord);
    }
}
