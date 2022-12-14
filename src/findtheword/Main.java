package findtheword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");
        System.out.println(words[1]);
    }
}
