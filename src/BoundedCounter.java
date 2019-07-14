public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        if (this.value >= upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public String toString() {
        //if value is < 10, add a 0 to the front of the number when printing
        if (this.value < 10) {
            return "0" +this.value;
        }
        
        return "" + this.value;
    }
    
    public int getValue() {
        return this.value;
    }
}