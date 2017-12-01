//Program Overview
//
import java.util.Random;
import java.util.Scanner;
public class p5 {

    public static void main(String[] args) {
        /*Sequence[] seqArray = engage();
        for(int i = 0; i <3; i++){
            System.out.println(seqArray[i].SequenceEmit());
        }
        guessingGame(seqArray);*/
        SequenceEnum newtest = new SequenceEnum("Nick");
        SequenceEnum comparison = new SequenceEnum("Nick");
        System.out.println(newtest.equals(comparison));
    }

    public static Sequence[] engage(){
        Sequence[] seqArray = new Sequence[4];
        seqArray[0] = new Sequence("assessment");
        seqArray[1] = new SequenceEnum("mississippi");
        seqArray[2] = new SpasEnum("oppressors");
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
}
