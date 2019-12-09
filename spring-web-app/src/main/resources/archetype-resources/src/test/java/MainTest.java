package $package;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MainTest {

    @Autowired
    private ConfigurableApplicationContext context;

    @Test
    public void test() {
        assertTrue(true);
        assertNotNull(context);
    }

}
