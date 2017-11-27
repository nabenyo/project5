public class p5 {

    public static void main(String[] args) {
        SequenceEnum test = new SequenceEnum();
        test.encapsulate("Nick");
        System.out.println(test.emit());
        System.out.println("Hello World");
        SpasEnum test1 = new SpasEnum();
        test1.activate();
        System.out.println(test1.isActive());
    }
}
