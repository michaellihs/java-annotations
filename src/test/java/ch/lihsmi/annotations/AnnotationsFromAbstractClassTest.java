package ch.lihsmi.annotations;

import org.junit.Test;
import java.lang.reflect.Field;

import static junit.framework.TestCase.assertTrue;

public class AnnotationsFromAbstractClassTest {

    @Test
    public void readAnnotationsFromAbstractClass() throws Exception {
        Field outerField = AbstractClassAnnotations.OuterClass.class.getDeclaredField("outerField");
        Field innerField = AbstractClassAnnotations.OuterClass.class.getSuperclass().getDeclaredField("innerField");

        AbstractClassAnnotations.MyAnnotation annotationFromOuterClass = outerField.getAnnotation(AbstractClassAnnotations.MyAnnotation.class);
        AbstractClassAnnotations.MyAnnotation annotationFromInnerClass = innerField.getAnnotation(AbstractClassAnnotations.MyAnnotation.class);

        assertTrue(annotationFromOuterClass != null);
        assertTrue(annotationFromInnerClass != null);
    }

}
