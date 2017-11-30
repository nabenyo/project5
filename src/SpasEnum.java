//Documentation
//Description:
//Assumptions:
//Valid States:
//Anticipated Use:


import java.util.Random;

public class SpasEnum extends Sequence {

    private int SpasEnumState;

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SpasEnum(){
        SpasEnumState = 0;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SpasEnum(String userWord){
        super(userWord);
        if(userWord.length() > 2){
            SpasEnumState = 1;
        }else{
            SpasEnumState = 0;
        }

    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public String SequenceEmit(){
        String word = super.SequenceEmit();
        if(this.SpasEnumState == 1)
            return word + word.substring(0,word.length()/3);
        else
            return word.substring(0,word.length()/2);
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean encapsulate(String userWord){
        if(userWord.length()>=3) {
            super.encapsulate(userWord);
            SpasEnumState = 1;
        }
        return userWord.length()>=3;
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public boolean SpasEnumGuess(String userWord){
        if(SequenceGuess(userWord)){
            SpasEnumState = 0;
            return true;
        }else{
            return false;
        }
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public String toString(){
        return super.toString() + "\nSpasEnum current state = "
                + this.SpasEnumState;
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
