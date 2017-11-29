//Documentation
//Description:
//Assumptions:
//Valid States:
//Anticipated Use:

//String Invert(int index);



public class SequenceEnum implements Sequence, Inverter{
    private int state;
    private String word;

    public SequenceEnum(){
        state = 0;
    }

    public SequenceEnum(String word){
        state = 1;
        this.word = word;
    }

    public boolean encapsulate(String word){
        if(word.length()>=3)
            this.word = word;
            activate();
        return word.length()>=3;
    }

    //Description: Invert function will modify the word and invert the letter found of @index with @index+1.
    //If the index supplied is less than 0 or is the last letter of the word or greater, the function will
    //simply return the original word.
    //Pre-conditions:
    //Post-conditions:
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

    public String emit(){
        if(this.state == 1){
            return this.word;
        }else{
            return this.word;
        }
    }

    public void activate(){
        state = 1;
    }

    public void deactivate(){
        state = 0;
    }

    public int isActive(){
        return state;
    }
}
