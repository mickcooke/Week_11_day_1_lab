public class Runner {

    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle(100);
        int volume = bottle.getVolume();
        System.out.println(volume);
        bottle.drink();
        int newVolume = bottle.getVolume();
        System.out.println(newVolume);

    }
}
