import jdk.security.jarsigner.JarSignerException;

public class UserServices implements UserInterface {

    @Override
    public String user(String email, String password, Users users) {



        if (email.equalsIgnoreCase(users.getEmail())) {
            System.out.println(email + "Регистрациядан ийгиликтуу отунуз");
        }
        if (password.equalsIgnoreCase(users.getPassword())) {
        } else {

        }

        return email;
    }
}



