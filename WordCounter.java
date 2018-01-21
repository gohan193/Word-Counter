package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * <p>
 * Runs through the text file bible.txt and prints out top ten 
 * frequent words in the whole text file .
 * </p>
 *
 * @author Jeffrey
 * @version 1.0
 */
public class WordCounter {
    /**
     * Magic number nine.
     */
    private static final int NINE = 9;
    /**
     * MAgic number ten.
     */
    private static final int TEN = 10;
    /**
     * Declares ArrayList.
     */
    private ArrayList<Word> list;
    /**
     * Declares Scanner.
     */
    private Scanner wordScanner;

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param bible
     *            command line arguments.
     * @return
     * @throws FileNotFoundException 
     */

    public void parseBook(String bible) throws FileNotFoundException {
        list = new ArrayList<Word>();
        wordScanner = new Scanner(new File(bible));

        while (wordScanner.hasNext()) {
            boolean check = false;
            String word = wordScanner.next().trim().toLowerCase();
            Iterator<Word> run = list.iterator();
            
            while (run.hasNext()) {
                Word temp = run.next();
                String subtemp = temp.getWord();
                
                if (word.equals(subtemp)) {
                    temp.incrementFrequency();
                    check = true;
                }
                
            }
            if (!check) {
                Word myWord = new Word(word);
                list.add(myWord);
            }
            
        }
         System.out.println(list.size());
    }
    
    /**
     * Prints top ten repeated words.
     * @param num accepts ints 
     */
    public void printTopWords(int num) {
        list.sort(null);
        for (int i = 0; i <= NINE; i++) {

            System.out.println(list.get(i)); // get word from list
        }

    }

        /**
         * Main Method.
         * @param args main
         * @throws FileNotFoundException 
         */
    public static void main(String[] args) throws FileNotFoundException {
        // your code will go here!!!
        WordCounter words = new WordCounter();
        try {
        words.parseBook("bible.txt");
        
        

        words.printTopWords(TEN);

        System.out.println("Question one was called and ran sucessfully.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Text file is spelt worng and is not readable");
        }

    }

};
