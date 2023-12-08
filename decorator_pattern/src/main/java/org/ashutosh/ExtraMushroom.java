package org.ashutosh;

public class ExtraMushroom implements ToppingDecorator{
    BasePizza basePizza;

    ExtraMushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return this.basePizza.cost()+50;
    }
}
