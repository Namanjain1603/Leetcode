import java.util.Stack;

public class P71 {
    public String simplifyPath(String path) {
        String list[] = path.split("/");
        Stack<String> stsk = new Stack<>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(".") || list[i].equals("")) {
                continue;
            } else if (list[i].equals("..")) {
                if (stsk.isEmpty()) {
                    continue;
                } else {
                    stsk.pop();
                }
            } else {
                stsk.push(list[i]);
            }
        }
        String newPath = "";
        if (stsk.empty()) {
            newPath = "/";
        } else {
            while (!stsk.isEmpty()) {
                newPath = "/" + stsk.pop() + newPath;
            }
        }
        return newPath;
    }
}
