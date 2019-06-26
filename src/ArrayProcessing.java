import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProcessing implements DivisionArray {
    int [] arr;

    public ArrayProcessing(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int[] division_into_three(int[] arr) {

        System.out.println("Массив чисел которые делятся на 3 без остатка");

        int [] arrnew = new int[arr.length];
        int k = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3==0){
                arrnew[k] = arr[i];
                k++;
            }
        }
        int [] array_modified = Arrays.copyOfRange(arrnew,0,k);

        System.out.println(Arrays.toString(array_modified));

        System.out.println("---------------------------------------------------------");

        return array_modified;
    }

    @Override
    public int[] division_into_seven(int[] arr) {

        System.out.println("Массив чисел которые делятся на 7 без остатка");

        int [] arrnew = new int[arr.length];
        int k = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%7==0){
                arrnew[k] = arr[i];
                k++;
            }
        }
        int [] array_modified = Arrays.copyOfRange(arrnew,0,k);

        System.out.println(Arrays.toString(array_modified));

        System.out.println("---------------------------------------------------------");

        return array_modified;
    }

    @Override
    public int[] division_into_twenty_one(int[] arr) {

        System.out.println("Массив чисел которые делятся на 21 без остатка");

        int [] arrnew = new int[arr.length];
        int k = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%21==0){
                arrnew[k] = arr[i];
                k++;
            }
        }
        int [] array_modified = Arrays.copyOfRange(arrnew,0,k);

        System.out.println(Arrays.toString(array_modified));

        System.out.println("---------------------------------------------------------");

        return array_modified;
    }
}
