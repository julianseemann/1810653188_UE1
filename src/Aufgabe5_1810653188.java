public class Aufgabe5_1810653188
{
    public static void main (String[] args)
    {
        Integer zahl1= 12;
        Integer zahl2= 26;

        System.out.println(zahl1++);
        System.out.println(zahl2++);

        System.out.println(zahl1);
        System.out.println(zahl2);

        System.out.println(++zahl1);
        System.out.println(++zahl2);

        System.out.println(zahl1);
        System.out.println(zahl2);

        /* zahl1++ und ++zahl1 dienen jeweils zur Erhöhung einer
        beliebigen Variable um den Wert 1. Bei ++zahl1 wird zuerst hochgezählt
        und im Anschluss der Wert ausgegeben. Bei zahl1++ wird erst hochgezählt,
        wenn die Anweisung ausgeführt wurde. D.h. bei ++zahl1 wird direkt
        hochgezählt und bei zahl1++ nachträglich hochgezählt. */

    }
}
