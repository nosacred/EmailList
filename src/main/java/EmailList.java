import java.util.*;
import java.util.regex.Pattern;

public class EmailList {
    private final List<String> emailBase = new ArrayList<>() ;

    public void add(String email) {
        if(email.matches("\\w+[@]\\w+[.]\\w+") && !emailBase.contains(email.toLowerCase())){
            emailBase.add(email.toLowerCase());
        }
        else System.out.println("Не корректный формат Е-мейл");
    }

    public List<String> getSortedEmails() {
        Collections.sort(emailBase);
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return emailBase;
    }

}
