package ie.atu;


public class Main {

    public static void main(String[] args) {

       int[] Array;
       int val = 100;

       Array = new int[10];

       for(int i = 0; i<10; i++){
           Array[i] = val;
           System.out.println("Element at index" + i + " :" + Array[i]);
           val+=100;
       }


    }
}