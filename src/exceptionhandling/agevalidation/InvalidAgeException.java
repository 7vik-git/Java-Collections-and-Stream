package exceptionhandling.agevalidation;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
