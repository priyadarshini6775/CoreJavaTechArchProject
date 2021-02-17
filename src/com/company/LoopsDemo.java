package com.company;

public class LoopsDemo {
    public static void main(String[] args) {
        boolean isTested = true;
        // Ternary Operator
        String flag = isTested ? "tested.." : " Not tested" ;
        //System.out.println("Flag is " + (isTested ?  + "tested.." : " Not tested");
        MultiplesOfFiveUsingFor();
        MultiplesOfFiveUsingWhile();
        MultiplesOfFiveUsingDoWhile();
        MultiplesOfEight();

    }

    private static void MultiplesOfFiveUsingFor() {
        for (int i=0; i<=100; i++){
            if(i%5 == 0 )
                System.out.println(i);
        }
    }
    private static void MultiplesOfFiveUsingWhile(){
        int i = 0;
            while(i <= 100 ){
                if(i%5 == 0 )
                    System.out.println(i);
                i++;
        }
    }

    private static void MultiplesOfFiveUsingDoWhile(){
        int i = 0;
        do {
            if(i%5 == 0 )
                System.out.println(i);
            i++;
        }while( i <= 100 );
    }

    private static void MultiplesOfEight(){
        for(int i=200; i>=100 ; i--){
            if(i%5 == 0 )
                System.out.println(i);

        }
    }
}
