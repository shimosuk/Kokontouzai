package theme;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaLangTest{

    @Test
    public void testJavaLangSizeIs95() {
        JavaLang langs = JavaLang.getInstance();
        assertEquals(95,(int)langs.size());
    }

}
