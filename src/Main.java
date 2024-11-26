import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "sheym_321";
        String password = "psswd_12345";
        String confirmPassword = "psswd_1234";
        System.out.println(logIn(login, password, confirmPassword));
    }

    public static boolean logIn(String login, String passwd, String confirmPasswd) {
        try {
            if (isCorrect(login) && isCorrect(passwd) && confirmPasswd.equals(passwd)) {
                System.out.println("Добро пожаловать!");
                return true;
            }
            if (!isCorrect(login)) {
                throw new WrongLoginException("Неверный формат данных для логина");
            }
            if (!isCorrect(passwd)) {
                throw new WrongPasswordException("Неверный формат данных для пароля");
            }
            if (!confirmPasswd.equals(passwd)) {
                throw new WrongPasswordException("Пароль не подтверждён");
            }
        }
        catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static boolean isCorrect(String str) {
        Pattern pattern = Pattern.compile("[\\w_]{1,20}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
