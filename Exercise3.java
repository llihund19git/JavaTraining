import java.util.ArrayList;

/**
 * Created by Xyxon on 5/24/2017.
 */
public class Exercise3 {

    public static void main(String[] args) {
        int x;
        Integer[] prime = {1, 3, 5, 7, 11};
        System.out.print("The primary numbers are: ");
        for(x=0;x<prime.length;x++){
            if(x==prime.length-1){
                System.out.print(" and");
            }
            System.out.print(" "+prime[x]);
        }
    }
}
