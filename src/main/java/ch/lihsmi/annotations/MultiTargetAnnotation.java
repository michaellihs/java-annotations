package ch.lihsmi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class MultiTargetAnnotation {

    /* Annotation definition */

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
    @interface MyMultiTargetAnnotation {}



    /* Annotation usage */

    @MyMultiTargetAnnotation
    class AnnotatedClass {

        @MyMultiTargetAnnotation
        String annotatedField;

        @MyMultiTargetAnnotation
        void annotatedMethod() {}

    }

}
