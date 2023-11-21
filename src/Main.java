import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> list = new LinkedList<>();

        list.add(new Fruit ("Mela"));
        list.add(new Fruit ("Pera"));
        list.add(new Fruit ("Kiwi"));

        System.out.println("Lista frutta: " + list);

        list.addFirst(new Fruit("Ciliegia"));
        list.addLast(new Fruit("Melone"));

        System.out.println("Lista frutta aggiornata: " + list);


    }
}