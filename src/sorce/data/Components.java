package sorce.data;

public abstract class Components {

    public  Components(){}
    public Components (String type, String name, String id, double price, int count) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.price = price;
        this.count = count;
    }
    protected String type;
    //индидуальный номер
    protected String id;
    //наименование
    protected String name;
    //цена
    protected double price;
    protected int count;

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getName(){

        return name;
    }
    public void setName(String str) {

        this.name = str;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}