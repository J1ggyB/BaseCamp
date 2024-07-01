package main.webapp;




public class Authentication {
    public boolean checkCredentials(String firstName, String lastName, String password) {
        return firstName != null && !firstName.isEmpty() &&
               lastName != null && !lastName.isEmpty() &&
               password != null && !password.isEmpty();
    }
}


