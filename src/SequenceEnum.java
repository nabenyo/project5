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

    public String invert(int index){
        return this.word;
    }

    public String emit(){
        return word;
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
