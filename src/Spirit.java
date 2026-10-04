public class Spirit extends Creature {

    public Spirit(String name, int threatLevel) {
        super(name, threatLevel);
    }

    @Override
    public void react() {
        System.out.println(getName() + " fades into mist and creates an illusion!");
    }
}