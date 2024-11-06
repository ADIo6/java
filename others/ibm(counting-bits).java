//counting bits

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'getOneBits' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER n as parameter.
     */

    public static List<Integer> getOneBits(int n) {
        List<Integer> result = new ArrayList<>();
        List<Integer> positions = new ArrayList<>();
        
        // Start tracking position from 1 (1-based index)
        int position = 1;  
        int count = 0;  // Count of 1-bits

        // Loop until all bits are checked
        while (n > 0) {
            // Check if the least significant bit is 1
            if ((n & 1) == 1) {
                count++;
                positions.add(position);  // Store the position
            }
            n = n >> 1;  // Right shift the number to check the next bit
            position++;  // Move to the next bit position
        }
        
        // Add the count of 1-bits as the first element
        result.add(count);
        // Add the positions of the 1-bits
        result.addAll(positions);
        
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.getOneBits(n);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "))  // Join elements with space
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
