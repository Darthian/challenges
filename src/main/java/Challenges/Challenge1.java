/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenges;

import java.io.*;

import java.math.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Challenge1 {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int userId = Integer.parseInt(bufferedReader.readLine().trim());
        int locationId = Integer.parseInt(bufferedReader.readLine().trim());
        int netStart = Integer.parseInt(bufferedReader.readLine().trim());
        int netEnd = Integer.parseInt(bufferedReader.readLine().trim());
        */

        int result = Result.getExpenditure(2, 8, 5, 50);
/*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        */

    }

    static class Result {

        /*
         * Complete the 'getExpenditure' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER userId
         *  2. INTEGER locationId
         *  3. INTEGER netStart
         *  4. INTEGER netEnd
         *
         *  https://jsonmock.hackerrank.com/api/transactions/search?userId=
         */

        public static int getExpenditure(int userId, int locationId, int netStart, int netEnd) throws IOException, InterruptedException {
           /* HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonmock.hackerrank.com/api/transactions/search?userId="+userId))
                    .build();

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());*/
            return 0;
        }

    }
}
