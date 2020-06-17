import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // the given example
        int[] A = {4, 5, 10, 11, 6};
        int M = -1;

        // key = an element
        // value = list of appearances of the element in array (indices)
        HashMap<Integer, ArrayList<Integer>> values = new HashMap<>();

        // fill the hashmap with values
        for (int i = 0; i < A.length; ++i) {
            ArrayList<Integer> crt;
            if (values.containsKey(A[i]))
                crt = values.get(A[i]);
            else
                crt = new ArrayList<>();

            crt.add(i);
            values.put(A[i], crt);
        }

        for (int i = 0; i < A.length; ++i) {
            // the other element that makes a pair with the current one
            int wantedKey = M + A[i];
            if (values.containsKey(wantedKey)) {
                // all the appearances of wantedKey
                ArrayList<Integer> first = values.get(wantedKey);
                // all the appearances of wantedKey + M
                ArrayList<Integer> second = values.get(A[i]);
                // print all combinations
                for (int el1 : first)
                    for (int el2 : second)
                        System.out.println(el1 + "-" + el2);
            }
        }
    }
}
