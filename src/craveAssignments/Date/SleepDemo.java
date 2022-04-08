package craveAssignments.Date;


// Sleeping for a While
// You can sleep for any period of time from one millisecond up to the lifetime of your computer.
// For example, the following program would sleep for 3 seconds −

import java.util.*;
public class SleepDemo {

    public static void main(String args[]) {
        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
