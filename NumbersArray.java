
import java.util.*;

public class NumbersArray {

    public static int findMax(Integer[] input) {
        int max = input[0];
        int size = input.length;
        for (int i = 1; i < size; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

    public static Map<Integer, Integer> getHashMap(Integer[] input) {
        Map<Integer, Integer> countsMap = new HashMap<>();
        for (int i : input) {
            Integer count = countsMap.get(i);
            if (count == null) {
                count = 0;
            }
            countsMap.put(i, ++count);
        }

        return countsMap;

    }

    public static Integer[] findDuplicates(Integer[] input) {

        List<Integer> out = new ArrayList<>();
        Map<Integer, Integer> countsMap = getHashMap(input);

        for (Map.Entry<Integer, Integer> entry : countsMap.entrySet()) {
            if (entry.getValue() >= 2) {
                out.add(entry.getKey());
            }
        }

        return out.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] input) {
        List<Integer> out = new ArrayList<>();
        Map<Integer, Integer> countsMap = getHashMap(input);

        for (Map.Entry<Integer, Integer> entry : countsMap.entrySet()) {
            if (entry.getValue() == 1) {
                out.add(entry.getKey());
            }
        }

        return out.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 1, 5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));

        System.out.println();

        input = new Integer[]{1, 2, 3, 4, 1, 2, 5, 3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));
    }

    // Write your methods here
}
