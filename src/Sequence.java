//Documentation
//Description: Provide functionality in checking object state,
//adding and changing word after instantiation, emitting the word, guessing
//the word, hashing, printing to string, and comparing.
//Assumptions:
//Valid States: 1 - Valid, 0 - Invalid
//Anticipated Use: The Sequence class can serve as a template for general
//guessing and word holding objects.

//String Invert(int index);



public class Sequence implements Inverter{

    private int SequenceState;
    private String word;
    private int guesses;

    //Description: Default constructor for sequence. Allows the class to be
    //instantiated prior to the word being set. Used for default construction
    //of child classes.
    //Pre-conditions: None
    //Post-conditions: Object will not be initialized in a valid state (0)
    public Sequence(){
        SequenceState = 0;
    }

    //Description: Constructor for Sequence, will initialize the object with a
    //word set for the class data member. In almost all instances you should
    //use this constructor to create the a Sequence object. word length must be
    //greater than or equal to 3 characters.
    //Pre-conditions: None
    //Post-conditions: Object is initialized in a valid state (1) and the word
    //date member is set with the passed through string
    public Sequence(String word){
        if(word.length() > 2) {
            SequenceState = 1;
            this.word = word;
        }
        else{
            SequenceState = 0;
        }
    }

    //Description: Used to to add or replace the word. Returns a boolean
    //denoting whether or not the word was accepted and state valid.
    //Pre-conditions: None
    //Post-conditions: If accepted, object is set to valid state and word will
    //be updated
    public boolean encapsulate(String word){
        if(word.length()>=3)
            this.word = word;
            SequenceState = 1;
        return word.length()>=3;
    }

    //Description: Returns the class data member word. If used when in a non
    //valid state, a null value or stale word may be returned.
    //Pre-conditions: word is in a valid state, word has been set
    //Post-conditions: None
    public String SequenceEmit(){
        if(SequenceState == 1){
            return this.word;
        }else{
            return this.word;
        }
    }

    //Description: Invert function will modify the word and invert the letter
    //found of @index with @index+1. If the index supplied is less than 0 or is
    //the last letter of the word or greater, the function will simply return
    //the original word.
    //Pre-conditions: If used when in a non valid state, will likely throw an
    //exception.
    //Post-conditions: None
    public String invert(int index){
        if(index >= this.word.length()-1)
            return this.word;
        else if(index < 0)
            return this.word;
        else {
            String beginning = this.word.substring(0, index);
            String end = this.word.substring(index + 2);
            return beginning + this.word.substring(index + 1, index + 2)
                    + this.word.substring(index, index + 1) + end;
        }
    }

    //Description: Used to query the word. A string can be passed through and
    //a boolean will be returned if the word variable matches the word class
    //data member.
    //Pre-conditions: Word has been instantiated and object in a valid state
    //Post-conditions:
    public boolean SequenceGuess(String userWord){
        guesses++;
        if(this.word.equals(userWord)){
            SequenceState = 0;
        }
        return this.word.equals(userWord);
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public int getState(){
        return SequenceState;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public String getWord(){
        return this.word;
    }

    //Description: Prints out the current state of the objects and the word.
    //Pre-conditions: None
    //Post-conditions: None
    public String toString(){
        return "word: " + this.word + "\ntotal guesses: " + guesses +
                "\nSequence current state = " + this.SequenceState;
    }

    //Description: Prints a unique value to associate with the object
    //Pre-conditions: None
    //Post-conditions: None
    public int hashCode(){
        return 1;
    }

    //Description: Used to compare two objects and determine if they are equal
    //Pre-conditions: None
    //Post-conditions: None
    public boolean equals(Sequence comparator){
        if(comparator instanceof SeqExtract
                && this.SequenceState ==
                comparator.SequenceState
                && comparator.getWord() == this.getWord()){
            return true;
        }else{
            return false;
        }
    }
}