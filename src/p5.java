//Program Overview
//

public class p5 {

    public static void main(String[] args) {
        SequenceEnum test = new SequenceEnum();
        test.encapsulate("Nick");
        SeqExtract test1 = new SeqExtract();
        test1.encapsulate("AllenAppleton");
        System.out.println(test1.invert(7));
        //System.out.println("Nick".substring(0,0));
    }
}
