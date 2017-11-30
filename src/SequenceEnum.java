//Documentation
//Description:
//Assumptions:
//Valid States:
//Anticipated Use:

import java.util.Random;

public class SequenceEnum extends Sequence implements Inverter{
    public static final Random rand = new Random();
    private int SequenceEnumState;

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SequenceEnum(){
        SequenceEnumState = 0;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SequenceEnum(String word){
        super(word);
        if(word.length() > 2) {
            SequenceEnumState = 1;
        }else{
            SequenceEnumState = 0;
        }
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean encapsulate(String userWord){
        if(userWord.length()>=3) {
            super.encapsulate(userWord);
            SequenceEnumState = 1;
        }
        return userWord.length()>=3;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public String SequenceEmit(){
        String word = super.SequenceEmit();
        if(this.SequenceEnumState == 1){
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
    public boolean SequenceEnumGuess(String word){
        if(SequenceGuess(word)){
            SequenceEnumState = 0;
            return true;
        }else{
            return false;
        }
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public String toString(){
        return super.toString() + "\nSequenceEnum current state = "
                + this.SequenceEnumState;
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
