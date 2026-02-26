package strings.level2;

public class VowelConsonantCounter {
    public static String checkCharType(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }

        return "Not Letter";
    }

    public static int[] countVowelsConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            String type = checkCharType(text.charAt(i));

            if (type.equals("Vowel"))
                vowels++;
            else if (type.equals("Consonant"))
                consonants++;
        }

        return new int[]{vowels, consonants};
    }

}
