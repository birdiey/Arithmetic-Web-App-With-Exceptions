
package za.ac.tut.business;


public class Multiplication implements MultiplicationOperations{

    @Override
    public int multiply(int num1, int num2) {

        int mult=num1 * num2;
        return mult;
    }
    
}
