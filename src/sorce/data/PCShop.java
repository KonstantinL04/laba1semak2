package sorce.data;

import java.util.ArrayList;

public class PCShop {

    protected ArrayList<Components> components = new ArrayList<>() ;
    public PCShop() {
        components.add(new CPU("Процессор","Intel Core i3-12100F","4893259", 8499, 3, 3.3));
        components.add(new CPU("Процессор","Intel Core i5-12400F","4893246", 14399, 10,2.5));
        components.add(new CPU("Процессор","Intel Core i7-12700F","4893210",26499, 0,2.1));
        components.add(new CPU("Процессор","AMD Ryzen 3 1200 OEM","1648930", 6490, 15,3.1));
        components.add(new GPU("Видеокарта","MSI GeForce RTX 4090 GAMING TRIO","5083169", 137499, 1,24));
        components.add(new SystemUnit("Блок питания"," be quiet! SYSTEM POWER 10", "5079722", 6499, 3, 750));
        components.add(new Motherboard("Материнская плата","Asus Gaming X", "4324352", 8449, 4));
        components.add(new Motherboard("Материнская плата","Asus Gaming", "4324353", 6990, 8));
    }
    public int getCount(){
        return this.components.size();
    }
    public Components getType(int index){
        return components.get(index);
    }
    public Components getName(int index) {
        return components.get(index);
    }

    public Components getPrice(int index) { return components.get(index); }
    public Components getId(int index) { return components.get(index); }
    public Components getCount(int index) { return components.get(index); }
    public Components getFrequency(int index) { return components.get(index); }
    public void addComponents(Components component) { components.add(component); }


    public void remove(int ind) {
        this.components.remove(ind);
    }
//    public void add(Components components) {
//    }
}

