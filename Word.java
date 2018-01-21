package q1;
/**
 * 
 * Word class for WordCounter.
 *
 * @author Jeffrey
 * @version 2017
 */
        
public class Word implements Comparable<Word> {
    /**
     * Declares String word.
     */
    private final String word;
    /**
     * Declares int frequency.
     */
    private int frequency;
    
    /**
     * Constructor.
     * Constructs an object of type Word.
     * @param word String accepts string word
     */
    public Word(String word) {
        this.frequency = 1;
        this.word = word;

    }
    
    /**
     * Gets frequency.
     * @return frequency
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * Gets Word.
     * @return word
     */
    public String getWord() {
        return word;
    }
    
    /**
     * Increments frequency.
     * @return frequency
     */
    public int incrementFrequency() {
        return frequency++;

    }

    @Override
    public String toString() {
        return "Word [word=" + word + ", frequency=" + frequency + "]";
    }

    @Override
    public int compareTo(Word o) {
       
    
        if (this.getFrequency() < o.getFrequency()) {
            return 1;
         
            
        } else if (getFrequency() == o.getFrequency()) {
            return 0;
        } else {
            return -1;
        }
    

}
}
