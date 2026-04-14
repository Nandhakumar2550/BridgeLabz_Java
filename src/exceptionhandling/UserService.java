package exceptionhandling;

// custom exceptions
class UserAlreadyExistsException extends Exception {
    UserAlreadyExistsException(String msg) { // constructor to accept message
        super(msg); // passing message to parent Exception class
    }
}

class UserNotFoundException extends Exception {
    UserNotFoundException(String msg) { // constructor to accept message
        super(msg); // passing message to parent Exception class
    }
}

// user service class
public class UserService {

    // register user
    void registerUser(String username) throws UserAlreadyExistsException { // method may throw exception

        // simulating existing user
        if(username.equals("admin")) { // checking if username already exists
            throw new UserAlreadyExistsException("User already exists"); // throwing custom exception
        }

        System.out.println("User registered successfully"); // success message
    }

    // check user existence
    void checkUserExistence(String username) throws UserNotFoundException { // method may throw exception

        if(!username.equals("admin")) { // checking if user does not exist
            throw new UserNotFoundException("User not found"); // throwing custom exception
        }

        System.out.println("User found"); // success message
    }

    public static void main(String[] args) {

        UserService us = new UserService(); // creating UserService object

        try {
            us.registerUser("admin"); // trying to register an existing user
            us.checkUserExistence("user"); // checking a non-existing user

        } catch(UserAlreadyExistsException e) {
            System.out.println(e.getMessage()); // handling user already exists exception

        } catch(UserNotFoundException e) {
            System.out.println(e.getMessage()); // handling user not found exception
        }
    }
}