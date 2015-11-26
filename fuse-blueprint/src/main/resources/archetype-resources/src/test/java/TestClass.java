package $package;

import org.junit.Test;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import static org.junit.Assert.*;

public class TestClass extends CamelBlueprintTestSupport {

    private static final Logger log = LoggerFactory.getLogger(TestClass.class);

    @Override
    protected String getBlueprintDescriptor() {
        return "blueprint.xml";
    }

    @Test
    @Ignore
    public void test() {

    }

}
