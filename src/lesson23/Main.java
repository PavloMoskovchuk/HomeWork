package lesson23;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listRandomNumbers = new ArrayList<Integer>(20);
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            listRandomNumbers.add(random.nextInt(10));
        }
        System.out.println(listRandomNumbers);
        int sum = (Integer) listRandomNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println("-----------------------------------------------------");
        List<String> sourseListOfNames = List.of("Cohen", "Levy", "Mizrahi", "Peretz", "Bitton", "Dahan", "Katz", "Azulay", "Schwartz", "Azulay");

        List<String> listOfNames = new ArrayList<String>(20);
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            listOfNames.add(sourseListOfNames.get(random.nextInt(sourseListOfNames.size())));
        }
        System.out.println(listOfNames);

        Map<String, Long> resultList = listOfNames.stream()
                .collect(Collectors
                        .groupingBy(String::valueOf, Collectors.counting()));
        System.out.println(resultList);

    }
}
