package bongf.week7.study;

import bongf.week7.study.toimport.ClassForImport;

public class ImportAll {
    public static void main(String[] args) {
        ClassForImport.ImportTest1 x = new ClassForImport.ImportTest1(); //에러
        ClassForImport y = new ClassForImport(); //통과
    }
}
