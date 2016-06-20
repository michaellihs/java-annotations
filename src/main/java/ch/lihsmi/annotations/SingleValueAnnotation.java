package ch.lihsmi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class SingleValueAnnotation {

    /* Annotation Definition */

    @Target({ElementType.TYPE})
    @interface MySingleValueAnnotation{
        String value() default "DEFAULT VALUE";
    }



    /* Annotation Usage */

    @MySingleValueAnnotation("THE SINGLE VALUE")
    class AnnotatedClass {}


    @MySingleValueAnnotation
    class AnnotatedClassWithAnnotationDefaultValue {}

}
