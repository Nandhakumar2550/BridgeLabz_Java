package exceptionhandling;

// custom exceptions
class UserAlreadyExistsException extends Exception {
    UserAlreadyExistsException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {
    UserNotFoundException(String msg) {
        super(msg);
    }
}

// user service class
public class UserService {

    // register user
    void registerUser(String username) throws UserAlreadyExistsException {

        // simulating existing user
        if(username.equals("admin")) {
            throw new UserAlreadyExistsException("User already exists");
        }

        System.out.println("User registered successfully");
    }

    // check user existence
    void checkUserExistence(String username) throws UserNotFoundException {

        if(!username.equals("admin")) {
            throw new UserNotFoundException("User not found");
        }

        System.out.println("User found");
    }

    public static void main(String[] args) {

        UserService us = new UserService();

        try {
            us.registerUser("admin");
            us.checkUserExistence("user");

        } catch(UserAlreadyExistsException e) {
            System.out.println(e.getMessage());

        } catch(UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
