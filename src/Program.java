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

        int[] b = Tabell.nestMaksBakerst(c);  // metoden returnerer en tabell

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks


        int maks = Tabell.maks(c,0,c.length-1);
        System.out.println(c[maks]);
        System.out.println("SORTING");
        Tabell.sortering(c);

        int[] l = Tabell.nestMin(c);
        Tabell.skrivln(l);

    }
}
