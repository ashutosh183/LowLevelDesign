package src;

import common.data.SuperHero;
import violation.Attacker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(SuperHero.GOKU);
        superHeroes.add(SuperHero.NARUTO);
        superHeroes.add(SuperHero.LUFFY);
        superHeroes.add(SuperHero.LUFFY);
        superHeroes.add(SuperHero.NARUTO);
        superHeroes.add(SuperHero.NARUTO);
        superHeroes.add(SuperHero.GOKU);

        Attacker attacker = new Attacker();
        attacker.attackWithSuperHeroes(superHeroes);

    }
}
