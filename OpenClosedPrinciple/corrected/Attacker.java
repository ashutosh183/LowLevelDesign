package corrected;

import java.util.List;
public class Attacker {
    public void attackWithSuperHeroes(List<SuperHero> superHeroes){
        for(SuperHero superHero: superHeroes){
            superHero.attack();
        }
    }
}
