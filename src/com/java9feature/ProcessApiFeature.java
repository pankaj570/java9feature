package com.java9feature;
/*
* To controlling and managing of OS processes java 9 introduces the new two interfaces.
* 1. java.lang.ProcessHandle
* 2. java.lang.ProcessHandle.Info
*
* */
public class ProcessApiFeature {
    public static void main(String[] args) {
        ProcessHandle processHandle = ProcessHandle.current();
        System.out.println("info :"+processHandle.info());
        System.out.println("children :"+processHandle.children());
        System.out.println("descendants :"+processHandle.descendants());
        System.out.println("parent :"+processHandle.parent());
        System.out.println("pid :"+processHandle.pid());
        ProcessHandle.allProcesses().forEach(process->{
            System.out.println("info :"+process.info());
            System.out.println("children :"+process.children());
            System.out.println("descendants :"+process.descendants());
            System.out.println("parent :"+process.parent());
            System.out.println("pid :"+process.pid());
        });

    }
}
