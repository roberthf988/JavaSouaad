import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char c = 'l';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phrase:");
        String phrase = sc.nextLine().trim();
        String[] words = phrase.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            char[] letters = words[i].toCharArray();
            StringBuilder word2 = new StringBuilder();

            for (int j = 0; j < letters.length; j++) { // fix #2
                if (estVoyelle(letters[j])) { // fix #3
                    letters[j] = c;
                }
                word2.append(letters[j]);
            }

            words[i] = word2.toString();
        }

        for (String n : words) {
            System.out.print(n + " ");
        }
    }

    public static boolean estVoyelle(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}




import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char c = 'l';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phrase:");
        String phrase = sc.nextLine();

        StringBuilder result = new StringBuilder(phrase.length());

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (estVoyelle(ch)) {
                result.append(c);
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
    }

    public static boolean estVoyelle(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

