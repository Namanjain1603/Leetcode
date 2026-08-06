package problems;

import java.util.ArrayList;
import java.util.List;

public class P118 {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            list.add(l);
        }
        if (numRows == 2) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            l.add(1);
            list.add(l);
        }
    }
}
