package bongf.week12.study;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class ChildClass extends ParentClass{
    public static void main(String[] args) {
        Annotation[] annotations = ChildClass.class.getAnnotations();
        System.out.println(Arrays.toString(annotations));

    }
}
