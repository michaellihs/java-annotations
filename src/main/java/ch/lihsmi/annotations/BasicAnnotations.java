package ch.lihsmi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;



public class BasicAnnotations {

    @Target({ElementType.TYPE})
    @interface MyClassAnnotation {}

    @Target({ElementType.CONSTRUCTOR})
    @interface MyConstructorAnnotation {}

    @Target({ElementType.FIELD})
    @interface MyFieldAnnotation {}

    @Target({ElementType.METHOD})
    @interface MyMethodAnnotation {}

    @Target({ElementType.ANNOTATION_TYPE})
    @interface MyAnnotationAnnotation {}

    @Target({ElementType.PARAMETER})
    @interface MyParameterAnnotation {}

    @Target({ElementType.LOCAL_VARIABLE})
    @interface MyLocalParameterAnnotation {}



    @MyAnnotationAnnotation
    @interface InnerAnnotation {}



    @MyClassAnnotation
    class AnnotatedClass {

        @MyFieldAnnotation
        private String field;

        @MyConstructorAnnotation
        AnnotatedClass() {}

        @MyMethodAnnotation
        void aMethod() {}

        void anotherMethodWithAnnotatedParameter(@MyParameterAnnotation String parameter) {}

        void aMethodWithAnnotatedLocalVariable() {
            @MyLocalParameterAnnotation
            String localParameter;
        }

    }

}
