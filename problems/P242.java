package problems;

public class P242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int arr[] = new int[26];
        for(int i = 0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            arr[idx]++;
            idx = t.charAt(i) - 'a';
            arr[idx]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
}
