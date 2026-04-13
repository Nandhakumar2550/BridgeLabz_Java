package searchingAndFileHanding;

public class SearchSentence {

    // Method to search for a word in an array of sentences
    static String search(String arr[], String word){

        // Traverse each sentence in the array
        for(String sentence : arr){

            // Check if the sentence contains the given word
            if(sentence.contains(word))

                // Return the first matching sentence
                return sentence;
        }

        // If no sentence contains the word, return "Not Found"
        return "Not Found";
    }

    public static void main(String[] args) {

        // Array of sentences
        String arr[] = {
                "Java is easy",
                "Python is powerful",
                "C++ is fast"
        };

        // Search for the word "Python" and print result
        System.out.println(search(arr, "Python"));
    }
}