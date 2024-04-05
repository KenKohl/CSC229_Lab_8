package org.example;

/**
 * The driver class Main checks to see first if the numbers between 0 and n (inclusively) are prime numbers. If so
 * they are added to a singly linked list. Then the singly linked list of prime numbers is checked to see if any of
 * those numbers have a 3 in it. If they do they are added from the singly linked list to a new singly linked list.
 * Finally, the numbers stored in the second singly linked list are added together and printed for the user.
 *
 * Author: Ken Kohlhof
 * Assignment: Lab 8
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Determines if the number between 0 and n is prime.
    public static boolean isPrime(int n){
        if(n <= 1){//A prime number is not negative, 0, or 1
            return false;
        }
        for(int i = 2; i <= n/2; i++){//If the remainder of n divided by i is 0 than number is not prime.
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //Determines if the numbers from primeNumberList has a 3 in any digit
    public static boolean has3Digit(int n){
        while(n > 0){
            if(n % 10 == 3){//If the remainder is 3 than the number has a 3 in it.
                return true;
            }
            n= n/10;//Check the next place in the number.
        }
        return false;
    }

    public static void main(String[] args) {
        MyLists primeNumberList = new MyLists();//Singly Linked List that stores prime numbers
        MyLists primeNumber3Digit = new MyLists();//Singly Linked List that stores prime numbers with 3 in it.

        int n = 100;//Upper bound of the numbers to check between.


        for(int i = 0; i <= n; i++){//For loop that if isPrime comes back true adds number to the primeNumberList.
            if(isPrime(i)){
                primeNumberList.addNode(i);
            }
        }

        //System.out.println(primeNumberList.getList());
        //System.out.println(primeNumberList.size());

        //For loop that if has3Digit comes back true adds the node from the primeNumberList to primeNumber3Digit List
        for(int i = 0; i <= primeNumberList.getLast(); i++){
            if(has3Digit(primeNumberList.getNode(i))){
                primeNumber3Digit.addNode(primeNumberList.getNode(i));
            }
        }

        //System.out.println(primeNumber3Digit.getList());

        //Prints message out to user informing them of the sum of the prime numbers with the digit 3 in it.
        System.out.println("The sum of the prime numbers between 0 and " + n + " with the digit 3 in it is "
                + primeNumber3Digit.addTogether() + ".");
    }
}