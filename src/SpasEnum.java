//Documentation
//Description:
//Assumptions:
//Valid States:
//Anticipated Use:

public class SpasEnum extends Sequence {

    //Description: Default constructor, allows initialization without word
    //data member
    //Pre-conditions: None
    //Post-conditions: Loads in inactive state (0)
    public SpasEnum(){
    }

    //Description: Constructor for initializing object with word.
    //Pre-conditions: Word passed through is greater than 2 characters
    //Post-conditions: If parameters met for word,
    public SpasEnum(String userWord){
        super(userWord);
    }

    //Description: Emits the word. If in active state, word will be arbitrarily
    //concatenated with a subsequence of the word at the end of the word. If
    //inactive, word will be truncated at one half the length of the word.
    //Pre-conditions: State of word determines the outcome of the return
    //Post-conditions: None
    public String SequenceEmit(){
        String word = super.SequenceEmit();
        if(this.getState() == 1)
            return word + word.substring(0,word.length()/3);
        else
            return word.substring(0,word.length()/2);
    }

    //Description: Adds word to an object initialized with and empty word,
    //updates word if word already set.
    //Pre-conditions: None
    //Post-conditions: Word will be set to a valid state if assumptions met
    //(word >= 3 characters)
    public boolean encapsulate(String userWord){
        if(userWord.length()>=3) {
            super.encapsulate(userWord);
        }
        return userWord.length()>=3;
    }

    //Description: Allows application programmer to guess the original word
    //by passing through a string. Returns a boolean if guess is correct.
    //Pre-conditions:
    //Post-conditions:
    public boolean SequenceGuess(String userWord){
        if(super.SequenceGuess(userWord)){
            return true;
        }else{
            return false;
        }
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public int hashCode(){
        String word = this.getWord();
        String obj = "SpasEnum";
        int state = this.getState();
        int result = 17;
        result = 37 * result + (word == null ? 0 : word.hashCode());
        result = 37 * result + state;
        result = 37 * result + obj.hashCode();
        return result;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean equals(Sequence comparator){
        if(comparator instanceof SpasEnum
                && this.getState() ==
                ((SpasEnum) comparator).getState()
                && comparator.getWord() == this.getWord()){
            return true;
        }else{
            return false;
        }
    }
}
