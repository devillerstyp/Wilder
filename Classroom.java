package Wilder;

import Wilder.Wilder;

public class Classroom {

    public static void main(String[] args) {

        Wilder Jean = new Wilder("Jean", true);
        System.out.println(Jean.whoAmI());
        Wilder Patrick = new Wilder("Patrick", false);
        System.out.println(Patrick.whoAmI());


    }
}
