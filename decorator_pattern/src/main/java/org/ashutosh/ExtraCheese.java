package org.ashutosh;

public class ExtraCheese implements ToppingDecorator{
    BasePizza basePizza;
    ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 20;
    }

}
