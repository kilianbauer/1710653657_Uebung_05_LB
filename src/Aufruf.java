public class Aufruf {
    public static void main(String[] args) {

        Mensch a = new Mensch ("Kilian", "Bauer", 23);
        a.Status();

        Student b = new Student("Kilian", "Bauer", 23, 1710653657, "WEB");
        b.Status();
    }
}