package bongf.week9.study;

import java.io.IOException;

//public class ChainedException {
//    public static void main(String[] args) {
//        try {
//            method();
//        } catch (InstallException ie) {
//            ie.getCause();
//        }
//    }
//
//    public static void method() throws InstallException {
//        try {
//            startInstall(); // SpaceException 발생
//            copyFiles(): // MemoryException 발생
//        } catch (SpaceException e) {
//            InstallException ie = new InstallException("설치중예외발생");
//            ie.initCause(e);
//            throw ie;
//        } catch (MemoryException me) {
//
//        }
//
//    }
//}
