

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistics {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        
        double mean = calculateMean(array);
        double median = calculateMedian(array);
        int mode = calculateMode(array);
        
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }
    
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[middle - 1] + array[middle]) / 2.0;
        } else {
            return array[middle];
        }
    }
    
    public static int calculateMode(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}

