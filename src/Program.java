import hjelpeklasser.Tabell;

public class Program {

    public static void main(String[] args){
//        int[] a = Tabell.randPerm(20);
//        for (int i: a
//             ) {
//            System.out.println(i);
//        }

        //Tabell.skriv(a);

        int[] b = Tabell.naturligeTall(10);

        for (int s: b
             ) {
            System.out.print(s+ " ");
        }
    }
}
