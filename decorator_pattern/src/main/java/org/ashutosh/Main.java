package org.ashutosh;

public class Main {
    public static void main(String[] args) {
//        MargheritaPizza + ExtraCheese
        BasePizza pizza = new ExtraCheese(new MargheritaPizza());
        System.out.println(pizza.cost());
        BasePizza pizza1 = new FarmHousePizza();
        pizza1 = new ExtraCheese(pizza1);
        pizza1 = new ExtraMushroom(pizza1);
        System.out.println(pizza1.cost());
    }
}