package ss18_string_regex.exercise.validata_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassessExample {
    private static final String CLASSESS_REGEX="[ACP][0-9]{4}[G-M]";
    public ClassessExample() {
    }
    public boolean validata(String reger) {
        Pattern pattern=Pattern.compile(CLASSESS_REGEX);
        Matcher matcher=pattern.matcher(reger);
        return matcher.matches();
    }
}
