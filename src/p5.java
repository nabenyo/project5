//Program Overview
//
import java.util.Random;
public class p5 {

    public static void main(String[] args) {
        Sequence[] seqArray = engage();
        for(int i = 0; i <3; i++){
            System.out.println(seqArray[i].SequenceEmit());
        }
        SeqExtract extract = new SeqExtract("bookkeeper");
    }

    public static Sequence[] engage(){
        Sequence[] seqArray = new Sequence[4];
        seqArray[0] = new Sequence("assessment");
        seqArray[1] = new SequenceEnum("mississippi");
        seqArray[2] = new SpasEnum("oppressors");
        return seqArray;
    }
}
