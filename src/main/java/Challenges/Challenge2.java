package Challenges;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge2 {

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrivalCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arrival = IntStream.range(0, arrivalCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int departureCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> departure = IntStream.range(0, departureCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());


     */
        List<Integer> arrival = Arrays.asList(1, 1, 2);
        List<Integer> departure = Arrays.asList(1, 2, 2);
        int result = Result.countMeetings(arrival, departure);
        System.out.println(result);
/*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

 */
    }

    static class Result {

        /*
         * Complete the 'countMeetings' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY arrival
         *  2. INTEGER_ARRAY departure
         */

        public static int countMeetings(List<Integer> arrival, List<Integer> departure) {
            //arrival.stream().forEach(System.out::println);
            //System.out.println("------------------------");
            //departure.stream().forEach(System.out::println);
            System.out.println("arrival size: " + arrival.size());
            System.out.println("departure size: " + departure.size());
            Map<String, Integer> pairs = new HashMap<>();
            Map<Integer, Integer> days = new HashMap<>();
            Integer n = arrival.size();
            Integer value = 0;
            //IntStream.iterate(0, i -> i + 1).limit(n).forEach(i -> {});
            for (int i = 0; i < n; i++) {
                if (arrival.get(i) <= departure.get(i)) {
                    days.put(arrival.get(i), arrival.get(i));
                    if (!pairs.containsKey(arrival.get(i) + ":" + departure.get(i))) {
                        pairs.put(arrival.get(i) + ":" + departure.get(i), arrival.get(i));
                        value = insertDays(days, arrival.get(i), departure.get(i));
                    }
                }
            }
            System.out.println("value: " + value);
            return days.size();
        }

        private static Integer insertDays(Map<Integer, Integer> map, Integer arrivalDay, Integer departureDay) {
            Integer value = 0;
            if (!map.containsKey(arrivalDay)) {
                map.put(arrivalDay, arrivalDay);
                value = arrivalDay;
            } else {
                if (!map.containsKey(departureDay)) {
                    map.put(departureDay, departureDay);
                    value = departureDay;
                }
            }
            return value;
        }

    }

}
