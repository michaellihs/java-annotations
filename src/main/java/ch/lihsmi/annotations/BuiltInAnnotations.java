package ch.lihsmi.annotations;

public class BuiltInAnnotations {

    /*
     * @Deprecated Annotation
     */

    @Deprecated
    class DeprecatedClass {}

    @Deprecated
    /**
     * @Deprecated this comment will show up as a deprecation message
     */
    class DeprecatedClassWithDeprecationComment{}



    /*
     * @Override Annotation
     */

    class Superclass {
        void aMethod() {}
    }

    class ExtensionClass extends Superclass {

        @Override
        void aMethod() {
            /**
             * If someone changes the method name in the superclass, this will give a compiler error.
             */
        }

    }


    /*
     * @SuppressWarning Annotation
     */

    @SuppressWarnings("COMPILER_WARNING")
    void methodWithWarnings() {
        /**
         * will tell the compiler to suppress the given warning during compilation
         */
    }

}
