import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        for (int j = 2; j <= 100; j++) {
            nums.add(j);
        }

        for (int o :new LinkedList<Integer>(nums)) {
            ListIterator<Integer> It = nums.listIterator();
            while (It.hasNext()) {
                int num = It.next();
                if (num % o == 0 && num!=o) {
                    It.remove();
                }
            }
        }
        //Print
        for (int number : nums) {
            System.out.print(number+ " ");
        }
    }
}