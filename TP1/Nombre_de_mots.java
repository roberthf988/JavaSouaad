import java.util.Scanner;

public class Entry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phrase:");
        String phrase = sc.nextLine();
        System.out.println(AnalysePhrase.nombreDeMots(phrase));
    }
}

class AnalysePhrase{
     static int nombreDeMots(String phrase){
        phrase = phrase.trim();
        String[] words = phrase.split("\\s+");
        return words.length;
    }
}
