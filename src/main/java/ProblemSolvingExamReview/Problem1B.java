/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolvingExamReview;

/**
 *
 * @author soblab
 */
public class Problem1B {
    
    public static void multiplesOfFive(int n){
        n = n-n%5;
        if(n>0) multiplesOfFive(n-5);
        System.out.println(n);
    }
    
    public static void main(String args[]){
        multiplesOfFive(60);
    }
}
