package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User invalid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("name must be 3 char or more");
        }
        return false;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr", true)
        };
        try {
            findUser(users, "Pet");
            validate(users[0]);
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}
