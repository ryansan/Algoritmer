package hjelpeklasser;

import java.util.Arrays;
import java.util.NoSuchElementException;
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
        fratilKontroll(a.length,fra,til);

        for(int i = fra; i < til; i++){
            if(i == a.length-1){
                System.out.print(a[i]);
                continue;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void skriv(int[] a){
        skriv(a, 0, a.length);
    }

    public static void skrivln(int[] a, int fra, int til){
        skriv(a,fra,til);
        System.out.println();

    }

    public static void skrivln(int[] a){
        skriv(a);
        System.out.println();
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

    //OPPG 1.2.3

    public static void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    public static void vhKontroll(int tablengde, int v, int h)
    {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    public static int maks(int[] a, int fra, int til)
    {
        if(a == null)
            throw new NullPointerException("Tabellen er satt til null, eller ikke instansiert");

        fratilKontroll(a.length, fra,til);

        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }

    public static void snu(int[] a, int v, int h){

        int[] temp = new int[h-v];

        System.out.println("tmp");
        for(int i = 0; i < h-v; i++){
            temp[i] = a[i];
            System.out.println(temp[i]);
        }

        //0 1 2
        //0 1 2
        System.out.println("snu");
        for(int i = temp.length-1; i >= 0; i--){
            a[i] = temp[temp.length-1-i];
        }

        System.out.println("UT :");
        for (int b: a
             ) {
            System.out.println(b);
        }
    }

    public static void snu(int[] a){

        int[] temp = new int[a.length];

        System.out.println("tmp");
        for(int i = 0; i < a.length; i++){
            temp[i] = a[i];
            System.out.println(temp[i]);
        }

        //0 1 2
        //0 1 2
        System.out.println("snu");
        for(int i = temp.length-1; i >= 0; i--){
            a[i] = temp[temp.length-1-i];
        }

        System.out.println("UT :");
        for (int b: a
                ) {
            System.out.println(b);
        }
    }

    public static void snuFASIT(int[] a, int v, int h)
    {
        vhKontroll(a.length,v,h);
        while (v < h) bytt(a,v++,h--);
    }

    public static void snuFASIT(int[] a)
    {
        int v = 0, h = a.length-1;
        while (v < h) bytt(a,v++,h--);
    }

    //Oppgaver 1.2.4

    public static int[] nestMaks(int[] a)
    {
        int n = a.length;  // tabellens lengde

        // må ha minst to verdier i tabellen
        if (a.length < 2) throw new
                IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int sist = a.length - 1; // siste posisjon i tabellen

        // starter med å se på første og siste verdi i tabellen
        int m = 0; // første posisjon
        int nm = sist; // siste posisjon

        // m skal være sist hvis a[sist] er større enn a[0]
        if (a[sist] > a[0]) { m = sist; nm = 0; }

        int maksverdi = a[m];  // største verdi
        int nestmaksverdi = a[nm];  // nest største verdi

        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 1; ; i++)
        {
            if (a[i] >= nestmaksverdi)
            {
                if (i == sist)
                {
                    a[sist] = temp; int[] b = {m,nm}; return b;
                }
                else if (a[i] > maksverdi)
                {
                    nm = m; nestmaksverdi = maksverdi;
                    m = i; maksverdi = a[m];
                }
                else
                {
                    nm = i;
                    nestmaksverdi = a[nm]; // ny nest størst
                }
            }
        } // for
    } // nestMaks

    public static int[] nestMaksForrest(int[] a) {
        int n = a.length;

        if (n < 2)
            throw new NoSuchElementException("Lengde må være > 2");

        int m = maks(a);

        bytt(a, 0, m);

        for (int b : a
                ) {
            System.out.println(b);
        }

        //funnet maks og satt den som første element
        int nm = 0; //holder på nest maks


        nm = maks(a, 1, m);

        if(nm == m){
            nm = 0;
        }

        bytt(a,m,0);

        return new int[]{m, nm};
    }

    public static int[] nestMaksBakerst(int[] a) {
        int n = a.length;

        if(n < 2)
            throw new NoSuchElementException("Legnde må veære >2");

        int m = maks(a);

        bytt(a,m,n-1);


        int nm = maks(a,0, n-1);

        bytt(a,n-1,m);

        if(nm == m){
            nm = a.length-1;
        }


        return new int[] {m,nm};
    }

    //fasit
    public static void sortering(int[] a)
    {
        for (int i = a.length; i > 1; i--)
        {
            int m = Tabell.maks(a,0,i);
            Tabell.bytt(a,i-1,m);
        }
    }

    public static int[] nestMin(int[] a)
    {
        int n = a.length;  // tabellens lengde

        // må ha minst to verdier i tabellen
        if (a.length < 2) throw new
                IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int sist = a.length - 1; // siste posisjon i tabellen

        // starter med å se på første og siste verdi i tabellen
        int m = 0; // første posisjon
        int nm = sist; // siste posisjon

        // m skal være sist hvis a[sist] er større enn a[0]
        if (a[sist] < a[0]) { m = sist; nm = 0; }

        int minverdi = a[m];  // største verdi
        int nestminverdi = a[nm];  // nest største verdi

        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 1; ; i++)
        {
            if (a[i] <= nestminverdi)
            {
                if (i == sist)
                {
                    a[sist] = temp; int[] b = {m,nm}; return b;
                }
                else if (a[i] < minverdi)
                {
                    nm = m; nestminverdi = minverdi;
                    m = i; minverdi = a[m];
                }
                else
                {
                    nm = i;
                    nestminverdi = a[nm]; // ny nest størst
                }
            }
        } // for
    } // nestMaks



}
