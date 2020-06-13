package main.java;

import java.util.List;

public class SILab2 {

        public boolean function (User user, List<String> allUsers) {
            if (user!=null) {
                if (user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername())) {
                    boolean atChar = false, dotChar = false;
                    for (int i=0;i<user.getEmail().length();i++) {
                        if (user.getEmail().charAt(i)=='@')
                            atChar = true;
                        if (atChar && user.getEmail().charAt(i)=='.') {
                            dotChar = true;
                        }
                    }
                    if (atChar && dotChar) {
                        return true;
                    }
                }
            }
            return false;
        }

    public static class User {
        String username;
        String password;
        String email;

        public User(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }
    }
}

