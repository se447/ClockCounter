
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes); //current time
            
            //now advance minutes
            //if minutes becomes zero, advance hours by 1
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();
            }
            
            i++;
        }
        
    }
}
