public class Main {

    public static void main(String[] args) {

        Creature creature = new Creature("Unknown Beast", 5);

        System.out.println("Creature Name: " + creature.getName());
        System.out.println("Threat Level: " + creature.getThreatLevel());

        creature.react();
    }
}