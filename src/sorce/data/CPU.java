package sorce.data;

public class CPU extends Components {
    //частота процессора
    private double frequency;
    public CPU(String type, String name, String id, double price, int count, double frequency) {
        super(type, name, id, price, count);
        this.frequency = frequency;
    }


    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
