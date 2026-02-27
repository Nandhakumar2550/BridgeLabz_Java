package string_Extra.level1;

public class RemoveDuplicates {
    public static String remove(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (result.indexOf(ch) == -1)
                result += ch;
        }

        return result;
    }
}
