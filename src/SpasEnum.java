public class SpasEnum extends SequenceEnum {
    private int state;
    private String word;

    public String emit(){
        if(this.state == 1)
            return this.word;
        else
            return this.word;
    }
}
