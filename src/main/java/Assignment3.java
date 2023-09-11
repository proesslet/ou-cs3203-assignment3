
import java.util.List;

public class Assignment3 {
    public static Integer listSum(List<Integer> nums) {
        Integer sum = 0;

        for (Integer num : nums) {
            sum += num;
        }

        return sum;
    }

    public static Integer listProduct(List<Integer> nums) {
        Integer product = 1;

        for (Integer num : nums) {
            product *= num;
        }

        return product;
    }
}
