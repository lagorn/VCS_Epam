import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int [] arrai = {2,3,77,5,8,9,6,12,21,58,64,73,81,92,112,120,137};
        ArrayProcessing array_new = new ArrayProcessing(arrai);
        array_new.division_into_three(arrai);
        array_new.division_into_seven(arrai);
        array_new.division_into_twenty_one(arrai);
    }
}
