package org.dextris.BuilderDesign;

public class BuilderPattern {
    public static void main(String[] args) {

//        User user=new User
//                .Builder("Sourav","Ganguly")
//                .build();
         User user=new User
                   .Builder("Sourav","Ganguly")
                 .age(48)
                 .profession(" Indian Cricket player ")
                 .build();
        System.out.println(user);
    }
}
