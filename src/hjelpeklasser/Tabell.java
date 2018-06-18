package hjelpeklasser;

import java.util.Arrays;
import java.util.Random;

public class Tabell {

    public static int min(int[] a){
        int min = a[0];

        int loc = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] <= min){
                min = a[i];
                loc = i;
            }
        }

        System.out.println(loc);
        return min;
    }

    public static int[] minmaks(int[] a){
        int[] b = new int[2];

        int min = a[0];
        int max = min;

        for(int i = 0; i < a.length; i++){
            if(min >= a[i]){
                min = a[i];
                b[0] = min;
            }
            if(max <= a[i]){
                max = a[i];
                b[1] = max;
            }
        }

        for(int i = 0; i < b.length; i++){
            System.out.println("B " + b[i]);
        }

        return b;
    }

    public static long fak(int n){
        int holder = 1;
        while(n > 0){
            holder = holder * n;
            n--;
        }
        return holder;
    }

    public static int min(int[] a, int fra, int til){
        if(fra < 0 || til > a.length || fra >= til){
            throw new IllegalArgumentException("Feil format");
        }

        int m = fra;
        int min = a[fra];

        for(int i = fra + 1; i < til; i++){
            if(min > a[i]){
                m = i;
                min = a[i];
            }
        }

        return m;
    }

    public static int min2(int[] a, int v, int h){
        if(v < 0 || h > a.length || v >= h){
            throw new IllegalArgumentException("Feil tall");
        }

        int m = v;
        int min = a[m];

        for(int i = v; i < h+1; i++){

            if(min > a[i]){
                m = i;
                min = a[i];
            }
        }

        return m;
    }

    public static int[] randPerm(int n){

        Random random = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);

        for (int k = n - 1; k > 0; k--){
            int rand = random.nextInt(k+1);
            bytt(a,k,rand);
        }

        return a;
    }

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void bytt(char[] c, int i, int j){
        char[] temp = c;
        c[i] = temp[j];
        temp[j] = c[i];
    }

    public static void skriv(int[] a, int fra, int til){
        if(fra < 0 || fra > a.length || fra >= til){
            throw new IllegalArgumentException();
        }

        for(int i = fra; i < til; i++){
            if(i == a.length-1){
                System.out.print(a[i]);
                continue;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void skriv(int[] a){
        for(int i = 0; i < a.length; i++){
            if(i == a.length-1){
                System.out.print(a[i]);
                continue;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void skrivln(int[] a, int fra, int til){
        if(fra < 0 || fra > a.length || fra >= til){
            throw new IllegalArgumentException();
        }

        for(int i = fra; i < til; i++){
            if(i == a.length-1){
                System.out.print(a[i]);
                System.out.println();
                continue;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void skrivln(int[] a){
        for(int i = 0; i < a.length; i++){
            if(i == a.length-1){
                System.out.print(a[i]);
                System.out.println();
                continue;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static int[] naturligeTall(int n){
        if(n < 1)
            throw new IllegalArgumentException("mindre enn 0!");

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = i+1;
        }

        return a;
    }

    public static int[] heleTall(int fra, int til){
        if(fra < 0 || fra >= til){
            throw new IllegalArgumentException("Feil tall");
        }

        int[] a = new int[til-fra];

        for(int i = fra; i < til; i++){
            a[i-fra] = i;
        }

        return a;
    }

}
