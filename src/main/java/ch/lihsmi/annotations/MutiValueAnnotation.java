package ch.lihsmi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class MutiValueAnnotation {

    /* Annotation Definitions with no default values */

    @Target({ElementType.TYPE})
    @interface MyMultiValueAnnotation {
        String param1();
        String param2();
        String param3();
    }

    /* Usage */

    @MyMultiValueAnnotation(param1 = "first value", param2 = "second value", param3 = "third value")
    class AnnotatedClass {}



    /* Annotation Definiton with default values */

    @Target({ElementType.TYPE})
    @interface MyMultiValueAnnotationWithDefault {
        String param1() default "DEFAULT VALUE";
        String param2();
        String param3();
    }

    /* Usage */

    @MyMultiValueAnnotationWithDefault(param2 = "second value", param3 = "third value")
    class AnnotatedClassWithDefaultValue {}

}
