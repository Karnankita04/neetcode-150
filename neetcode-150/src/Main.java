
import arrays.containsduplicate.Solution;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean answer = solution.hasDuplicate(new int[]{1, 2, 3, 4, 2});

        System.out.println("Does the array contain duplicates? " + answer);
    }
}