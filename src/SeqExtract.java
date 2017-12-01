//Documentation
//Description:
//Assumptions:
//Valid States:
//Anticipated Use:

public class SeqExtract extends Sequence {

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SeqExtract(){
    }

    //Description:
    //Pre-conditions:
    //Post-conditions:
    public SeqExtract(String userWord){
        super(userWord);
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
    public String SequenceEmit(String userWord){
        String word = super.SequenceEmit();
        if(this.getState()== 1){
            return word.replaceFirst(userWord, "");
        }else{
            return word;
        }
    }

    //Description:
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
        String obj = "SeqExtract";
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
        if(comparator instanceof SeqExtract
                && this.getState() ==
                ((SeqExtract) comparator).getState()
                && comparator.getWord() == this.getWord()){
            return true;
        }else{
            return false;
        }
    }
}
