package craveAssignments.Date;

// Measuring Elapsed Time
// Sometimes, you may need to measure point in time in milliseconds.
// So let's re-write the above example once again −


import java.util.*;
public class ElapsedTime {

    public static void main(String args[]) {
        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");

            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");

            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
