import java.util.ArrayList;

public class ArrayProcessing implements DivisionArray {
    int [] arr;

    public ArrayProcessing(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int[] division_into_three() {

        int [] arrnew = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3==0){
                arrnew[k] = arr[i];
                k++;
            }



        }

        return new int[0];
    }

    @Override
    public int[] division_into_seven() {
        return new int[0];
    }

    @Override
    public int[] division_into_twenty_one() {
        return new int[0];
    }
}
