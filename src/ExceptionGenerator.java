public class ExceptionGenerator {
    public void generateNullPointerException() {
        String nullString = null; // deklaracja zmiennej String
        // Próba wywołania metody na obiekcie null - spowoduje NullPointerException
        System.out.println(nullString.length());
    }
}
