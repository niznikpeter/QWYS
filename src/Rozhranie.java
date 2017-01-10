/**
 * Created by Šimon on 10.01.2017.
 */
public interface Rozhranie
{
    public void nastavBody(int Body);
    public void nastavPocetSpravnych();
    public void nastavPocetNespravnych();
    public void pripocitajBodyZaSpravne(int spravne);
    public void pripocitajBodyZaNespravne(int nespravne);
    public void info();
    public void vypisNazovTimu();

}
