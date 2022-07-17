package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User usr : users) {
            if (usr.getUserName().equals(login)) {
                rsl = usr;
            }
        }
        if (rsl.equals(null)) {
            throw new UserNotFoundException("User not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.getUserName().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("User is invalid");
        } else {
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException eu) {
            eu.printStackTrace();
        }
    }
}
