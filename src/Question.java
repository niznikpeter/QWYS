import java.util.Random;

/**
 * Created by otep9 on 13.01.2017.
 */
public class Question {
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
        Random rn = new Random();
        int ran = rn.nextInt(50);
        switch (a) {
            case 1:                                    //vyberie nahodnu otazku z temy SXT
                System.out.println(questionsSXT[ran]);
            case 2:                                    //vyberie nahodnu otazku z temy SIE
                System.out.println(questionsSIE[ran]);
            case 3:                                    //vyberie nahodnu otazku z temy PRO
                System.out.println(questionsPAY[ran]);
            case 4:                                    //vyberie nahodnu otazku z temy PAY
                System.out.println(questionsPAY[ran]);
            case 5:                                    //vyberie nahodnu otazku z temy AEN
                System.out.printf(questionsAEN[ran]);
            case 6:                                    //vyberie nahodnu otazku z temy DAT
                System.out.printf(questionsDAT[ran]);
            default:
                System.out.println("Wrong input!!");
        }
    }
    public void checkAnswer(){

    }
    public void doNotRepeatQuestion() {

    }

    public void giveQuestion() {

    }

    public void addPoints() {

    }
}
