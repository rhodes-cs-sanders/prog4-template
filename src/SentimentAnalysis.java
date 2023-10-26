import java.io.InputStream;
import java.util.*;

public class SentimentAnalysis {
    public static void main(String[] args)
    {
        final boolean PRINT_TREES = false;  // whether or not to print extra info about the maps.

        BSTMap<String, Integer> wordFreqs = new BSTMap<String, Integer>();
        BSTMap<String, Integer> wordTotalScores = new BSTMap<String, Integer>();
        Set<String> stopwords = new TreeSet<String>();

        System.out.print("Enter filename: ");
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();

        processFile(filename, wordFreqs, wordTotalScores);

        System.out.println("Number of words is: " + wordFreqs.size());
        System.out.println("Height of the tree is: " + wordFreqs.height());

        if (PRINT_TREES)
        {
            System.out.println("Preorder:  " + wordFreqs.preorderKeys());
            System.out.println("Inorder:   " + wordFreqs.inorderKeys());
            System.out.println("Postorder: " + wordFreqs.postorderKeys());
            printFreqsAndScores(wordFreqs, wordTotalScores);
        }

        removeStopWords(wordFreqs, wordTotalScores, stopwords);

        System.out.println("After removing stopwords:");
        System.out.println("Number of words is: " + wordFreqs.size());
        System.out.println("Height of the tree is: " + wordFreqs.height());

        if (PRINT_TREES)
        {
            System.out.println("Preorder:  " + wordFreqs.preorderKeys());
            System.out.println("Inorder:   " + wordFreqs.inorderKeys());
            System.out.println("Postorder: " + wordFreqs.postorderKeys());
            printFreqsAndScores(wordFreqs, wordTotalScores);
        }

        while (true)
        {
            System.out.print("\nEnter a new review to analyze: ");
            String line = scan.nextLine();
            if (line.equals("quit")) break;

            String[] words = line.split(" ");

            // Your code here:
            // The words[] array holds the new movie review to analyze.
            // Get the average sentiment for each word (skipping stop words),
            // then calculate the average of those sentiments.  This "average of averages"
            // becomes your overall sentiment analysis score.
        }
    }

    /**
     * Read the file specified to add proper items to the word frequencies and word scores maps.
     */
    private static void processFile(String filename,
                                    BSTMap<String, Integer> wordFreqs, BSTMap<String, Integer> wordTotalScores)
    {
        InputStream is = SentimentAnalysis.class.getResourceAsStream(filename);
        if (is == null) {
            System.err.println("Bad filename: " + filename);
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] words = line.split(" ");

            // Your code here.
            // You have an array of words.  The first word in the array is the score.
            // Process all the remaining words to add them to the wordFreqs and wordTotalScores maps
            // in an appropriate way.
        }
        scan.close();
    }

    /**
     * Print a table of the words found in the movie reviews, along with their frequencies and total scores.
     * Hint: Call wordFreqs.inorderKeys() to get a list of the words, and then loop over that list.
     */
    private static void printFreqsAndScores(BSTMap<String, Integer> wordFreqs, BSTMap<String, Integer> wordTotalScores)
    {
        // Your code here.
    }

    /**
     * Read the stopwords.txt file and add each word to the stopwords set.  Also remove each word from the
     * word frequencies and word scores maps.
     */
    private static void removeStopWords(BSTMap<String, Integer> wordFreqs,
                                        BSTMap<String, Integer> wordTotalScores, Set<String> stopwords)
    {
        InputStream is = SentimentAnalysis.class.getResourceAsStream("stopwords.txt");
        if (is == null) {
            System.err.println("Bad filename: " + "stopwords.txt");
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        while (scan.hasNextLine()) {
            String word = scan.nextLine();

            // Your code here.
            // You should add the word to the stopwords set, and also remove it from the
            // two maps.
        }
        scan.close();
    }
}
