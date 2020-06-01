import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos{

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        Comparator<Hero> heroNameComparator = new Comparator<Hero>(){
            @Override
            public int compare(Hero h1, Hero h2){
                return h1.getName().compareTo(h2.getName());
            }
        };

        Collections.sort(heroes, heroNameComparator);

        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)

        Collections.sort(heroes, Hero::compareTo);

        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}
/*
1.Modifie la classe Hero afin d'implémenter Comparable. L'ordre de tri par défaut sera sur l'attribut name, par ordre croissant.
2.Dans la classe Thanos, fait en sorte que la liste de héros soit bien triée comme voulu.
3.Dans la classe Thanos, ajoute un Comparator permettant de trier la liste de héros sur l'attribut age décroissant.
 */