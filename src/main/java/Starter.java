import com.sun.tools.javac.util.List;
import org.task.Solution;

import java.util.Collections;

public class Starter {
    public static void main(String... args){
        Solution sol = new Solution();
        System.out.println(sol.topN(List.of(1, 3, 9, 4).stream()));
    }
}
