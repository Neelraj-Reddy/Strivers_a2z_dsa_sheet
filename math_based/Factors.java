import java.util.*;
import java.util.Collections;
public class Factors {
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for(int i =1;i<= (int) Math.sqrt((double) n); i++){
            if (n%i==0){
                factors.add(i);
                if (n/i != i){
                    factors.add(n/i);
                }
                
            }
        }
        Collections.sort(factors,Collections.reverseOrder());
        System.out.println(factors);
    }
}
