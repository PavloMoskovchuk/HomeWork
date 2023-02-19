package lesson11.HomeWork;

public class Lorry extends Car{
    private int loadCapacity;
    private int volumeCapacity;

    public Lorry(String type, String make, String model, int year, int loadCapacity, int volumeCapacity) {
        super(type, make, model, year);
        this.loadCapacity = loadCapacity;
        this.volumeCapacity = volumeCapacity;
    }

    @Override
    public void information() {
        super.information();
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getVolumeCapacity() {
        return volumeCapacity;
    }

    public void setVolumeCapacity(int volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
