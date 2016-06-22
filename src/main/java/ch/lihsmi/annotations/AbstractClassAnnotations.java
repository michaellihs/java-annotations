package ch.lihsmi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AbstractClassAnnotations {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation{}

    public class OuterClass extends AbstractClass {

        @MyAnnotation
        private String outerField;

    }


    private abstract class AbstractClass {

        @MyAnnotation
        private String innerField;

    }

}
