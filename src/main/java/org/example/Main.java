package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>();
        arrayToSort.add(7);
        arrayToSort.add(2);
        arrayToSort.add(76);
        arrayToSort.add(4);
        arrayToSort.add(99);
        bubbleSort(arrayToSort);
        for (int i = 0; i < arrayToSort.size(); i++){
            System.out.println(arrayToSort.get(i));
        }
    }

    static void bubbleSort(ArrayList<Integer> arrayToSort){
        for(int i = 0; i < arrayToSort.size(); i++){
            for(int j = 0; j < arrayToSort.size() - i - 1; j++){
                if(arrayToSort.get(j) > arrayToSort.get(j+1)){
                    Integer temp = arrayToSort.get(j);
                    arrayToSort.set(j, arrayToSort.get(j+1));
                    arrayToSort.set(j+1, temp);
                }
            }
        }
    }
}