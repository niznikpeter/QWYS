import java.io.Console;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by otep9 on 13.01.2017.
 */
public class Question {
    public int random = 50;
    public int tmp = 50;

    private String questionsDAT[] = new String[50];
    private String answersDAT[] = new String[50];

    private String questionsAEN[] = new String[50];
    private String answersAEN[] = new String[50];

    private String questionsSXT[] = new String[50];
    private String answersSXT[] = new String[50];

    private String questionsSIE[] = new String[50];
    private String answersSIE[] = new String[50];

    private String questionsPRO[] = new String[50];
    private String answersPRO[] = new String[50];

    private String questionsPAY[] = new String[50];
    private String answersPAY[] = new String[50];

    public void pickQuestion(int a) {
        Scanner scan  =new Scanner(System.in);
        Random rn = new Random();
        int ran = rn.nextInt(random);
        switch (a) {
            case 1:                                    //vyberie nahodnu otazku z temy SXT
                System.out.println(questionsSXT[ran]);
                System.out.println("Správna odpoveď je: (Stlac Enter pre zobrazenie spravnej odpovede)");
                scan.nextLine();                       //pauza
                System.out.println(answersSXT[ran]);
                doNotRepeatQuestion(ran, questionsSXT);
                doNotRepeatAnswer(ran, answersSXT);
                break;
            case 2:                                    //vyberie nahodnu otazku z temy SIE
                System.out.println(questionsSIE[ran]);
                System.out.println("Správna odpoveď je: ");
                scan.nextLine();
                System.out.println(answersSIE[ran]);
                doNotRepeatQuestion(ran, questionsSIE);
                doNotRepeatAnswer(ran, answersSIE);
                break;
            case 3:                                    //vyberie nahodnu otazku z temy PAY
                System.out.println(questionsPAY[ran]);
                System.out.println("Správna odpoveď je: ");
                scan.nextLine();
                System.out.println(answersPAY[ran]);
                doNotRepeatQuestion(ran, questionsPAY);
                doNotRepeatAnswer(ran, answersPAY);
                break;
            case 4:                                    //vyberie nahodnu otazku z temy PRO
                System.out.println(questionsPRO[ran]);
                System.out.println("Správna odpoveď je: ");
                scan.nextLine();
                System.out.println(answersPRO[ran]);
                doNotRepeatQuestion(ran, questionsPRO);
                doNotRepeatAnswer(ran, answersPRO);
                break;
            case 5:                                    //vyberie nahodnu otazku z temy AEN
                System.out.printf(questionsAEN[ran]);
                System.out.println("Správna odpoveď je: ");
                scan.nextLine();
                System.out.println(answersAEN[ran]);
                doNotRepeatQuestion(ran, questionsAEN);
                doNotRepeatAnswer(ran, answersAEN);
                break;
            case 6:                                    //vyberie nahodnu otazku z temy DAT
                System.out.printf(questionsDAT[ran]);
                System.out.println("Správna odpoveď je: ");
                scan.nextLine();
                System.out.println(answersDAT[ran]);
                doNotRepeatQuestion(ran, questionsDAT);
                doNotRepeatAnswer(ran, answersDAT);
                break;
            default:
                System.out.println("Wrong input!!");
                break;
        }
        random--;

    }

    public void doNotRepeatQuestion(int ran, String s[]) {
        String temp = s[ran];
        s[ran] = s[tmp];
        s[tmp] = temp;
        tmp--;
    }

    public void doNotRepeatAnswer(int ran, String s[]) {
        String temp = s[ran];
        s[ran] = s[tmp];
        s[tmp] = temp;
        tmp--;
    }

    public int addPoints(int i) {
        if (i == 1)
            return 5;
        else
            return -5;
    }


}
