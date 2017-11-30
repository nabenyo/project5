//Documentation
//Description:
//Assumptions:
//Valid States:
//Anticipated Use:


import java.util.Random;

public class SeqExtract extends Sequence {

    private int SeqExtractState;

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SeqExtract(){
        SeqExtractState = 0;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SeqExtract(String userWord){
        super(userWord);
        if(userWord.length() > 2) {
            SeqExtractState = 1;
        }else{
            SeqExtractState = 0;
        }
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean encapsulate(String userWord){
        if(userWord.length()>=3) {
            super.encapsulate(userWord);
           SeqExtractState = 1;
        }
        return userWord.length()>=3;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public String SequenceEmit(String userWord){
        String word = super.SequenceEmit();
        if(SeqExtractState == 1){
            return word.replaceFirst(userWord, "");
        }else{
            return word;
        }
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean SeqExtractGuess(String userWord){
        if(SequenceGuess(userWord)){
            SeqExtractState = 0;
            return true;
        }else{
            return false;
        }
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public String toString(){
        return super.toString() + "\nSeqExtractState current state = "
                + this.SeqExtractState;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public int hashCode(){
        return 1;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean equals(){
        return true;
    }
}
