import  java.util.Scanner;
import java.util.*;


public class Quizapplication {
    int marks;
    // int startgame;
    int  viewsummary;
    int wronganswer;
    int correctanswer =0;
    int confirmsubmission;
    // System.out.println("Do you want to start the game enter 1 to proced");
    System.out.println("do you want to start game enter 1");
    Scanner scanner =new Scanner(System.in);
    int startgame =scanner.nextInt();
    if(statgame ==1)
    {
        question1();
        static void question1()
        {
            System.out.println("which of the following is a bird");
            System.out.println("1. phoenix");
            System.out.println("2. cat");
            System.out.println("3. crow");
            System.out.println("4.buffalow");

        }
        int correctoption1= 1;
        System.out.println("enter your option");
        int useroption1 =scanner.nextInt();
        if(useroption1  ==  correctoption1)
        {
            ++correctanswer;
        }
        else{
            ++wronganswer;
        }







    }//startgamme  loop
    

}
