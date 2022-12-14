package findtheword.level2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scan.nextLine();
        System.out.println("Enter the position of the word");
        int n = scan.nextInt();
        String[] words = sentence.split(" ");
        System.out.println(words[n-1]);
    }
}
