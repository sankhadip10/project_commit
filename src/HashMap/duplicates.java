package HashMap;

import java.util.*;

public class duplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 55, 6, 7, 8, 6, 5, 3, 5);

        List<Integer> number1 = removeDuplicate(list);
        System.out.println(number1);

        List<Integer> number2 = removeDuplicateHashSet(list);
        System.out.println(number2);
    }

    private static List<Integer> removeDuplicate(List<Integer> list) {
        List<Integer> uniquelist = new ArrayList<>();
        for (Integer number : list) {
            if (!uniquelist.contains(number)) {
                uniquelist.add(number);
            }
        }
        return uniquelist;
    }

    private static List<Integer> removeDuplicateHashSet(List<Integer> list){
        Set<Integer> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }
}



