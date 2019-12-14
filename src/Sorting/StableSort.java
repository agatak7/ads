package Sorting;

public class StableSort {

    public static void stableSort(String[][] table, int column) {
        //insertion sort because XD
        if(table.length<=1) {return;}
        for(int i = 1; i<table.length; i++) {

            for(int j = i; j>0; j--) {
                if(table[j][column].compareTo(table[j - 1][column])<0) {
                    String[] temp = table[j];
                    table[j] = table[j - 1];
                    table[j - 1] = temp;
                }else { break; }
            }
        }
    }

}



