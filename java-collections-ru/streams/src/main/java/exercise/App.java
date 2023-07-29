package exercise;

import java.util.List;
//import java.util.Arrays;

// BEGIN
class App {
    public static boolean domain(String user) {
        List<String> freeEmails = List.of("@gmail.com", "@yandex.ru", "hotmail.com");
        String onlyEmail = user.substring(user.indexOf('@'));
        for (String email: freeEmails ) {
            if (onlyEmail.contains(email)) {
                return true;
            }
        }
        return false;
    }
    public static long getCountOfFreeEmails(List<String> emailsList) {
        return emailsList.stream()
                .filter(email -> !email.equalsIgnoreCase(""))
                .filter(email -> domain(email))
                .count();
    }
}
// END
