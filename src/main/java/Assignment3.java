
import java.util.List;

public class Assignment3 {
    public static Integer listSum(List<Integer> nums) {
        Integer sum = 0;

        for (Integer num : nums) {
            sum += num;
        }

        return sum;
    }
}
