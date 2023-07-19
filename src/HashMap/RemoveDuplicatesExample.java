package HashMap;

import java.util.*;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);

        // Brute-Force Approach
        List<Integer> uniqueList1 = removeDuplicatesBruteForce(numbers);
        System.out.println("Brute-Force Approach: " + uniqueList1);

        // Using a Set
        List<Integer> uniqueList2 = removeDuplicatesUsingSet(numbers);
        System.out.println("Using a Set: " + uniqueList2);

        // Using Java Stream API
        List<Integer> uniqueList3 = removeDuplicatesUsingStream(numbers);
        System.out.println("Using Java Stream API: " + uniqueList3);

        // Using a Map
        List<Integer> uniqueList4 = removeDuplicatesUsingMap(numbers);
        System.out.println("Using a Map: " + uniqueList4);

        // Sorting and Removing Adjacent Duplicates
        List<Integer> uniqueList5 = removeDuplicatesBySorting(numbers);
        System.out.println("Sorting and Removing Adjacent Duplicates: " + uniqueList5);
    }

    private static List<Integer> removeDuplicatesBruteForce(List<Integer> numbers) {
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        return uniqueList;
    }

    private static List<Integer> removeDuplicatesUsingSet(List<Integer> numbers) {
        Set<Integer> uniqueSet = new HashSet<>(numbers);
        return new ArrayList<>(uniqueSet);
    }

    private static List<Integer> removeDuplicatesUsingStream(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .toList();
    }

    private static List<Integer> removeDuplicatesUsingMap(List<Integer> numbers) {
        Map<Integer, Integer> uniqueMap = new LinkedHashMap<>();
        for (Integer number : numbers) {
            uniqueMap.put(number, number);
        }
        return new ArrayList<>(uniqueMap.values());
    }

    private static List<Integer> removeDuplicatesBySorting(List<Integer> numbers) {
        Collections.sort(numbers);
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0 || !numbers.get(i).equals(numbers.get(i - 1))) {
                uniqueList.add(numbers.get(i));
            }
        }
        return uniqueList;
    }
}
