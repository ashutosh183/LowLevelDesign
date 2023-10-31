package violation;

import common.data.SuperHero;

import java.util.List;

public class Attacker {
    public void attackWithSuperHeroes(List<SuperHero> superHeroes){
        for(int i=0; i<superHeroes.size(); i++){
            SuperHero superHero = superHeroes.get(i);
            switch(superHero){
                case GOKU: superHero.attackWithGoku();
                break;
                case LUFFY: superHero.attackWithLuffy();
                break;
                case NARUTO: superHero.attackWithNaruto();
                break;
            }
        }
    }
}
