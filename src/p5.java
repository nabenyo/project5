//Program Overview
//

import java.util.Scanner;
public class p5 {

    public static void main(String[] args) {
        Sequence[] seqArray = engage();
        //guessingGame(seqArray);
        extraction();
        demonstration();
    }

    public static Sequence[] engage(){
        Sequence[] seqArray = new Sequence[4];
        seqArray[0] = new SequenceEnum("assessment");
        seqArray[2] = new SequenceEnum("mississippi");
        seqArray[1] = new SpasEnum("oppressors");
        seqArray[3] = new SpasEnum("tallahassee");
        return seqArray;
    }

    public static void guessingGame(Sequence[] seqArray){
        Scanner input = new Scanner(System.in);
        for(Sequence x:seqArray){
            while(x.getState() == 1){
                System.out.print("Please guess the following word: ");
                System.out.println(x.SequenceEmit());
                boolean result = x.SequenceGuess(input.nextLine());
                if(!result){
                    System.out.println("I'm sorry, that was incorrect, " +
                            "please guess again");
                }else{
                    System.out.println("\nGreat job! You guessed the word!\n");
                    System.out.println(x.toString());
                    System.out.println("\n\n");
                }
            }
        }
    }

    public static void extraction(){
        Scanner input = new Scanner(System.in);
        SeqExtract extractTest = new SeqExtract("tennessee");
        String puzzle = extractTest.getWord();
        System.out.println("Please type an extraction of the word" +
                "printed above.\nWhatever you type will be extracted from" +
                " the word. \nYou will need to type the portion" +
                "to remove from the \nword in order to get to the word" +
                " 'see': ");
        System.out.println();
        while(!puzzle.equals("see")){
            System.out.println(extractTest.getWord());
            puzzle = extractTest.SequenceEmit(input.nextLine());
            if(puzzle.equals("see")){
                System.out.println("Great job!");
            }else{
                System.out.println("Please try again");
            }
        }
    }

    public static void demonstration(){
        SeqExtract extractCompare1 = new SeqExtract("test");
        SpasEnum spasCompare = new SpasEnum("test");
        SeqExtract extractCompare2 = new SeqExtract("test");
        System.out.println(
                "Generating three separate objects to demonstrate compare:\n" +
                        "1. SeqExtract: test\n" +
                        "2. SpasEnum: test\n" +
                        "3. SeqExtract: test\n");
        System.out.print("1 is equal to 3 [true]: ");
        System.out.println(extractCompare1.equals(extractCompare2));
        System.out.print("1 is equal to 2 [false]: ");
        System.out.println(extractCompare1.equals(spasCompare) + "\n");
        extractCompare1.SequenceGuess("test");
        System.out.print("Modifying state of 1\n1 is equal to 2 [false]: ");
        System.out.println(extractCompare1.equals(extractCompare2));
    }
}
