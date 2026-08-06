public class P3746 {
    public int minLengthAfterRemovals(String s) {
        int ca = 0, cb = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                ca++;
            } else {
                cb++;
            }
        }
        return Math.abs(cb - ca);
    }
}
