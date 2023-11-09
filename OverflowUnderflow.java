public class OverflowUnderflow {
    public static void main(String args[]){
        
        //Overflow
        int Overflow = 2147483647;
        System.out.println("Overflow: " + (Overflow+1));

//Underflow
int underflow = -2147483648;
System.out.println("underflow: "+(underflow-1));

    }
    
}
