package string_Extra.level1;

public class RemoveCharacter {
    public static String remove(String text, char removeChar) {

        String result = "";

        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != removeChar)
                result += text.charAt(i);

        return result;
    }
}
