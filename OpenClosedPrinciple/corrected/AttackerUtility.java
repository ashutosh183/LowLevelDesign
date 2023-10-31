package corrected;


import java.util.ArrayList;
import java.util.List;

public class AttackerUtility {
    public static void main(String[] args) {
        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(new Goku());
        superHeroes.add(new Luffy());
        superHeroes.add(new Naruto());
        superHeroes.add(new Goku());
        superHeroes.add(new Naruto());

        Attacker attacker = new Attacker();
        attacker.attackWithSuperHeroes(superHeroes);
    }
}
