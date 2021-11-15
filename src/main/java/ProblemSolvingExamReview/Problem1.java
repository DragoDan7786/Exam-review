
package ProblemSolvingExamReview;

/**
 *
 * @author Suleman Ali
 */
public class Problem1 {
    
    public static int getGCD(int num1 , int num2){
 
        if(num1 == num2)
            return num1;
        
        else if(num1 > num2){
            num1 = num1 - num2;
            return getGCD(num1 , num2);
        }
        else{
            num2 = num2 - num1;
            return getGCD(num1 , num2);
        }
    }
    
    
    public static void main(String args[]){
        System.out.println("The GCD is: " + getGCD(45 , 25));
    }
    
    
    
    
}