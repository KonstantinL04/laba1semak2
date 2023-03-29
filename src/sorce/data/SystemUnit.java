package sorce.data;

public class SystemUnit extends Components {
    private int power;
    public SystemUnit(String type, String name, String id, float price, int count, int power) {
        super(type, name, id, price, count);
        this.power = power;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
}
