package searchingAndFileHanding;

public class SearchSentence {

    static String search(String arr[], String word){

        for(String sentence : arr){

            if(sentence.contains(word))
                return sentence;
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String arr[] = {
                "Java is easy",
                "Python is powerful",
                "C++ is fast"
        };

        System.out.println(search(arr,"Python"));
    }
}
