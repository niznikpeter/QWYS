/**
 * Created by kikos on 9.1.2017.
 */
import java.util.Scanner;
public class Hlavna
{
    public static void main(String[] args)
    {
        // scanners
        Scanner number = new Scanner(System.in);
        Scanner name = new Scanner(System.in);

        // welcome
        System.out.println("Výtajte v hre QWIS");

        // create tim
        System.out.print("Zadaj počet timov: ");
        int pocetTimov = number.nextInt();
        Tim[] a = new Tim[pocetTimov];

        // question
        Question q = new Question();

        // helping variables to definition name timand members
        String nameTim = " ";
        String nameMember = " ";
        int numberMember = 0;

        // definition name tim and name members
        for(int t = 0; t < a.length; t++)
        {
            System.out.print("Zadaj názov " + (t+1) + ". timu: ");
            nameTim = name.nextLine();

            System.out.print("Zadaj počet členov " + (t+1) + ". timu: ");
            numberMember = number.nextInt();

            // helping field to name members
            String[] nameMembers = new String[numberMember];

            // input name members
            for(int namem = 0; namem < nameMembers.length; namem++)
            {
                System.out.print("Zadaj meno " + (namem+1) + ". člena:");
                nameMember = name.nextLine();
                nameMembers[namem] = nameMember;
            }

            a[t] = new Tim(nameTim, nameMembers);
            System.out.println();
        }

        // helping variables to questions and answers
        int category = 0;
        int in = 0;

        //  questions and answers
        for(int round = 1; round <= 10; round++)
        {
            System.out.println(round + ". kolo");
            for(int tim = 0; tim < a.length; tim++)
            {
                a[tim].vypisNazovTimu();

                System.out.println("Kategórie: 1 - SXT / 2 - SIE / 3 - PRO / 4 - PAY / 5 - AEN / 6 - DAT");
                System.out.print("Vyber kategóriu: ");
                category = input(1,6);

                q.pickQuestion(category);

                System.out.print("Bola odpoveď správna? 1 - ÁNO  /  0 - NIE ");
                in = input(0,1);
                a[tim].nastavBody(q.addPoints(in));

                if(in == 1)
                {
                    a[tim].nastavPocetSpravnych();
                    a[tim].pripocitajBodyZaSpravne(q.addPoints(in));
                }
                if(in == 0)
                {
                    a[tim].nastavPocetNespravnych();
                    a[tim].pripocitajBodyZaNespravne(q.addPoints(in));
                }
            }
            // writing results after that round
            System.out.println("Stav po " + round + ". kole:");
            System.out.println("Tim        Body    Počet správnych    Počet nesprávnych    Body za správne    Body za nesprávne");
            for(Tim b : sort(a))
            {
                b.info();
            }
        }
        // finall results
        System.out.println("Konečné výsledky:");
        System.out.println("Poradie Tim        Body    Počet správnych    Počet nesprávnych    Body za správne    Body za nesprávne");
        int order = 1;
        for(Tim b : sort(a))
        {
            System.out.print(order + ".      ");
            b.info();
        }
        System.out.println("Ďakujeme že ste si zahrali hru QWIS.");
    }
    /*
    method for correct input from users,
    When users enter input which ins't in selected range,
    this method asks users for new input

     */
    public static int input(int from, int to)
    {
        while(true)
        {
            int v = 0;
            try
            {
                Scanner sc = new Scanner(System.in);
                v = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.print("Zly vstup, zadaj znovu:");
                continue;
            }
            if(v < from || v > to)
            {
                System.out.print("Zly vstup, zadaj znovu:");
                continue;
            }
            else
                return v;
        }
    }
    // helping method for method sort
    public static Tim[] swap(Tim[] a,int p,int d )
    {
        Tim tmp = a[p];
        a[p] = a[d];
        a[d] = tmp;
        return a;
    }
    // method for sort some field
    public static Tim[] sort(Tim[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = 0; j < a.length -i -1; j++)
            {
                if(a[j].getBody() < a[j+1].getBody())
                {
                    a = swap(a,j,j+1);
                }
            }
        }
        return a;
    }


}
