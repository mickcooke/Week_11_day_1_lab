public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        return (volume= volume-10);
    }

    public int empty() {
        return (volume = 0);
    }

    public int fill() {
        return (volume = 100);
    }
}
