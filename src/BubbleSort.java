public class BubbleSort {
    public int[] tall = {2, 4, 0, 1, 8, 9, 20, 3, 5};


    public void printTall(){

        for(int i =0; i < tall.length; i++){
        System.out.println(tall[i]);

        }
        System.out.println("Printed numbers\n");

    }

    public void sort(int[] tall){
        int index = 0;
        int[] sorted = new int[tall.length];

        for(int i =0; i < tall.length; i++){
            if(tall[i] <= index){
                tall[i] = tall[index];
                index = tall[i];
            }

            System.out.println("index er " + index);
            System.out.println(tall[i]);

        }
        System.out.println("Sorted");

    }



}
