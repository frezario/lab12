import org.testng.annotations.Test;

import java.io.IOException;

public class TestVision {
    @Test
    void test_vision() throws IOException {
        Document document = new SmartDocument("gs://oop-course/Geico-2021.png");
        assert document.parse().contains("12123 South Cleveland Avenue | Ft. Myers, FL 33907");
    }
}
