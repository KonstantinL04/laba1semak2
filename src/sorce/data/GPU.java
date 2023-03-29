package sorce.data;
public class GPU extends Components{
    private int sizeGB;
    //частота ОЗУ
    public GPU(String type, String name, String id, float price, int count, int sizeGB) {
        super(type, name, id, price, count);
        this.sizeGB = sizeGB;
    }
    public int getSizeGB(){
        return sizeGB;
    }
    public void setSizeGB(int sizeGB) {
        this.sizeGB = sizeGB;
    }
}
