public class Main {
    public static void main(String[] args) {
        // klasa ExceptionGenerator
        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            //NullPointerException
            generator.generateNullPointerException();
        } catch (NullPointerException e) {

            System.out.println("Uwaga: Wystąpił problem techniczny. Prosimy spróbować ponownie później. "
                    + "Jeśli problem będzie się powtarzał, prosimy o kontakt z obsługą techniczną.");
            // printStackTrace() i toString() na wyjątku
            e.printStackTrace(); // szczegóły
            System.out.println("Opis wyjątku: " + e.toString());
        }
    }
}
