
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.println("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        
        System.out.println("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        
        System.out.println("hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        
       
        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds); //current time
            Thread.sleep(1000);
            
            //now advance minutes
            //if minutes becomes zero, advance hours by 1
            seconds.next();
            
            if (seconds.getValue() == 0) {
                minutes.next();

            }
            
            if (minutes.getValue() == 0 && seconds.getValue() == 0) {
                    hours.next();
                }
            
            
        }
        
    }
}
