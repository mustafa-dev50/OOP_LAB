import java.lang.*;

class StopWatch {
    private long startTime;
    private long endTime;

    // CONSTRUCTORS

    StopWatch() {
        startTime = System.currentTimeMillis();
    }


    // getters

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // Methods

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stop watch started!");
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("Stop watch stopped!");
    }

    public long elapsedTime() {
        return System.currentTimeMillis() - startTime;
    }
}

public class Task3 {
    public static void main(String[] a) {
        
        StopWatch watch1 = new StopWatch();

        int[] numbers = new java.util.Random().ints(100000, 0, 1000000).toArray();



        // starting the stop watch
        watch1.start();
        for(int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int minIndex = i;

            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                numbers[minIndex] = numbers[i];
                numbers[i] = min;
            }
        }
        watch1.stop();
        System.out.println("Time taken to sort: " + watch1.elapsedTime() + " milli-seconds");
        
    }

    }

