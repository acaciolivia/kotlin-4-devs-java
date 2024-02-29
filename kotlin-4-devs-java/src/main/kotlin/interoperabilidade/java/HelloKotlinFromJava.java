package interoperabilidade.java;

import orientacaoObjetos.generics.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {
        Person1 rob = new Person1("Robert", "Martin");

        System.out.println("His name is " + rob.getFirstName());

        rob.setFirstName("Uncle Bob");
        System.out.println("His name is now " + rob.getFirstName());


        //Chamando função genérica
        Integer maxInt = MaxKt.max(12, 15);
        System.out.println("The max value is " + maxInt);
    }
}
