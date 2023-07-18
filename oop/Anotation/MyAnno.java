package com.soumik.oop.Anotation;

/*
    If No method inside this is known as marker interface
    if one method inside this is known as single valued annotation
    if more than one method is passed its known as multivalued annotation
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) // declare where to use
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{

    int getValue() default 0;

    String name() default "Soumik";

    String city() default "Rishra";
}