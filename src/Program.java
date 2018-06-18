import hjelpeklasser.Tabell;

public class Program {

    public static void main(String[] args){
//        int[] a = Tabell.randPerm(20);
//        for (int i: a
//             ) {
//            System.out.println(i);
//        }

        int[] a = Tabell.randPerm(20); // tilfeldig permutasjon av 1 . . 20
        int[] c = {1,20,10};
        int[] b = Tabell.nestMaks(c);  // metoden returnerer en tabell

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks

        Tabell.skrivln(c);        // se Oppgave 5 i Avsnitt 1.2.2
        System.out.print("Størst(" + c[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + c[nm] + ") har posisjon " + nm);

    }
}
