package problems;

import java.util.ArrayList;
import java.util.List;

public class P1260 {

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> lli = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            List<Integer> slli = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                slli.add(grid[i][j]);
            }
            lli.add(slli);
        }
        k = k % (m * n);
        while (k > 0) {
            List<Integer> slli = lli.get(m - 1);
            int place = slli.get(n - 1);
            int replace = 0;
            for (int i = 0; i < m; i++) {
                slli = lli.get(i);
                for (int j = 0; j < n; j++) {
                    replace = slli.get(j);
                    slli.set(j, place);
                    place = replace;
                }
            }
            k--;
        }
        return lli;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int k = 3;
        List<List<Integer>> lli = shiftGrid(grid, k);
        for (int i = 0; i < lli.size(); i++) {
            for (int j = 0; j < lli.get(i).size(); j++) {
                System.out.print(lli.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
