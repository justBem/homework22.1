import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList<>();
        ArrayList<Integer>  arrayEven=new ArrayList<>();
        ArrayList<Integer>  arrayOdd=new ArrayList<>();
        Random random=new Random();

        for (int i = 0; i < 50; i++) {
            arraylist.add(random.nextInt(0,100));
        }
        for (int i = 0; i < arraylist.size(); i++) {
            if(arraylist.get(i)%2==0){
                arrayEven.add(arraylist.get(i));
            }
            else{
                arrayOdd.add(arraylist.get(i));
            }
        }
        System.out.println(arraylist);
        System.out.println(arrayEven);
        System.out.println(arrayOdd);
    }
}