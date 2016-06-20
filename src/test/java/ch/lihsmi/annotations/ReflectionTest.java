package ch.lihsmi.annotations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReflectionTest {

    @Test
    public void reflectedAnnotationValueReturnsExpectedValueForPublicField() throws Exception {
        Reflection.ReflectionClass reflectionClass = new Reflection(). new ReflectionClass();
        assertEquals("My public Parameter", reflectionClass.reflectedAnnotationValueFromPublicField());
    }

    @Test
    public void reflectedAnnotationValueReturnsExpectedValueForPrivateField() throws Exception {
        Reflection.ReflectionClass reflectionClass = new Reflection(). new ReflectionClass();
        assertEquals("My Parameter", reflectionClass.reflectedAnnotationValueFromPrivateField());
    }

}