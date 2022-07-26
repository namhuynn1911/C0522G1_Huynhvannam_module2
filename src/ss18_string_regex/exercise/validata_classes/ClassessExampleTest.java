package ss18_string_regex.exercise.validata_classes;

public class ClassessExampleTest {
    private static ClassessExample classessExample;
        public static final String[] validClassess=new String[] {"P1234M","C1324L"};
        public static final String[] invaliClassess=new String[] {"V6789@","&hadh78"};

    public static void main(String[] args) {
        classessExample=new ClassessExample();
        for(String classess:validClassess) {
            boolean isValid= classessExample.validata(classess);
            System.out.println("Classess is "+classess +"is valid "+isValid);
        }
        for (String classess:invaliClassess) {
            boolean isInVaild= classessExample.validata(classess);
            System.out.println("Classess is "+classess +"is invalid "+isInVaild);

        }
    }
}
