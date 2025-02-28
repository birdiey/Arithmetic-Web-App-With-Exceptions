package za.ac.tut.business;

public class Addition implements AddingOperations {

    @Override
    public int add(int num1, int num2) throws NumberException {
        
        if (isValid(num1, num2)) {

           return ( num1 + num2);

        }else{
            throw new NumberException("The number must be positive ["+num1+"] ,["+num2+"]");
        }
       
    
    }

    public boolean isValid(int num1, int num2) {
        boolean valid = false;

        if (num1 > 0 && num2 > 0) {
            valid = true;
        }
        return valid;
    }

}
