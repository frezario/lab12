import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document1 = new SmartDocument("gs://oop-course/Geico-2021.png");
        Document document2 = new TimedDocument("gs://oop-course/Geico-2021.png");
        Document document3 = new CachedDocument("gs://oop-course/Geico-2021.png");
        System.out.println(document1.parse());
    }
}
