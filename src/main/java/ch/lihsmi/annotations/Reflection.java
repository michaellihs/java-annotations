package ch.lihsmi.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Reflection {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyFieldAnnotation {
        String parameter();
    }

    class AnnotatedClass {

        @MyFieldAnnotation(parameter = "My public Parameter")
        public String annotatedPublicField;

        @MyFieldAnnotation(parameter = "My Parameter")
        private String annotatedPrivateField;

    }


    public class ReflectionClass {

        public String reflectedAnnotationValueFromPrivateField() throws Exception {
            Field field = AnnotatedClass.class.getDeclaredField("annotatedPrivateField");
            MyFieldAnnotation annotation = field.getAnnotation(MyFieldAnnotation.class);
            return annotation.parameter();
        }

        public String reflectedAnnotationValueFromPublicField() throws Exception {
            Field field = AnnotatedClass.class.getField("annotatedPublicField");
            MyFieldAnnotation annotation = field.getAnnotation(MyFieldAnnotation.class);
            return annotation.parameter();
        }

    }

}
