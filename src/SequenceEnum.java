//Documentation
//Description:
//Assumptions:
//Valid States:
//Anticipated Use:

import java.util.Random;

public class SequenceEnum extends Sequence implements Inverter{
    public static final Random rand = new Random();


    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SequenceEnum(){
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SequenceEnum(String word){
        super(word);
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean encapsulate(String userWord){
        if(userWord.length()>=3) {
            super.encapsulate(userWord);
        }
        return userWord.length()>=3;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public String SequenceEmit(){
        String word = super.SequenceEmit();
        if(getState() == 1){
            int wordLength = word.length();
            int location = rand.nextInt(word.length());
            int insert = rand.nextInt(word.length());
            return word.substring(0,insert) + word.substring(location
                    , wordLength) + word.substring(insert);
        }else{
            return word;
        }
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean SequenceGuess(String word){
        if(super.SequenceGuess(word)){
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
        String obj = "SequenceEnum";
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
        if(comparator instanceof SequenceEnum
                && getState() ==
                ((SequenceEnum) comparator).getState()
                && comparator.getWord() == this.getWord()){
            return true;
        }else{
            return false;
        }
    }
}
