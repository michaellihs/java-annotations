Java Annotations Tutorial
=========================

This repository contains some basic tutorials and source code snippets for annotations in Java.



Table of Contents
-----------------

### Defining and Using Annotations

* [Built-in Java Annotations](src/main/java/ch/lihsmi/annotations/BuiltInAnnotations.java) describes built-in Java annotations
* [Basic Annotations](src/main/java/ch/lihsmi/annotations/BasicAnnotations.java) describes how to write basic annotations
* [Annotations with multiple targets](src/main/java/ch/lihsmi/annotations/MultiTargetAnnotation.java) describes how to write annotations for multiple targets
* [Annotations with a single value](src/main/java/ch/lihsmi/annotations/SingleValueAnnotation.java) describes how to write annotations with a single value
* [Annotations with multiple values](src/main/java/ch/lihsmi/annotations/MultiValueAnnotation.java)


### Reflection and Reading Annotations

* [Read Annotation Values via Reflection](src/main/java/ch/lihsmi/annotations/Reflection.java)
  * see also [associated Unit Test](src/test/java/ch/lishmi/annotations/ReflectionTest.java)
* [Annotations from abstract classes](src/test/java/ch/lihsmi/annotations/AnnotationsFromAbstractClassTest.java)


Pifalls
-------

* If you want to read the value of an annotation during runtime, make sure to add the `@Retention(RetentionPolicy.RUNTIME)` annotation to the annotation definition, e.g.
  
    ```
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyFieldAnnotation {
        String parameter();
    }
    ```


Resources
=========

* [Java Annotations by jenkov.com](http://tutorials.jenkov.com/java/annotations.html)
