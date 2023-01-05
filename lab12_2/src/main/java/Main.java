import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document = new SmartDocument("gs://oop-course/Geico-2021.png");
//        document = TimedDocument(document);
//        document = CashedDocument(document);
        System.out.println(document.parse());
    }
}
