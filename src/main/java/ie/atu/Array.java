package ie.atu;

public class Array {
    public void Array1() {
        int[] anArray;
        int val = 100;

        anArray = new int[10];

        for(int i = 0; i<10; i++){
            anArray[i] = val;
            System.out.println("Element at index" + i + " :" + anArray[i]);
            val+=100;
        }
    }
}
