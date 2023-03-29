package sorce.view;
import sorce.data.PCShop;
import sorce.data.Components;
import sorce.data.GPU;
import sorce.data.CPU;
import sorce.data.SystemUnit;
import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
    private PCShop data;
    public MyTableModel (PCShop components) {
        this.data = components;
    }
    @Override
    public int getRowCount() {
        return data.getCount();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "Тип товара";
            case 1 : return "Наименование";
            case 2 : return "Код товара";
            case 3 : return "Цена/₽";
            case 4 : return "Кол-во/шт";
            case 5 : return "Частота CPU/Ггц";
            case 6 : return "Размер памяти/GB";
            case 7 : return "Мощность/Wat";
        }
        return "";
    }
    @Override
    public  int getColumnCount(){
        return 8;
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 : data.getType(rowIndex).setType((String)aValue);
            case 1 : data.getName(rowIndex).setName((String)aValue);
            case 2 : data.getId(rowIndex).setId((String)aValue);
            case 3 : data.getPrice(rowIndex).setPrice((Double)aValue);
            case 4 : data.getCount(rowIndex).setCount((Integer)aValue);
//            case 5 : data.getFrequency(rowIndex).setFrequency
        }
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 1: return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: return data.getType(rowIndex).getType();
            //наименование
            case 1: return data.getName(rowIndex).getName();
            //код товара
            case 2: return data.getId(rowIndex).getId();
            //цена
            case 3: return data.getPrice(rowIndex).getPrice();

            case 4: {
                return data.getCount(rowIndex).getCount();
            }
            //частота процессора
            case 5: {
                Components p = data.getName(rowIndex);
                if (p instanceof CPU) {
                    return ((CPU) p).getFrequency();

                } else {
                    return "-";
                }
            }
            case 6: {
                Components p = data.getName(rowIndex);
                if (p instanceof GPU) {
                    return ((GPU) p).getSizeGB();

                } else {
                    return "-";
                }
            }
            case 7: {
                Components p = data.getName(rowIndex);
                if (p instanceof SystemUnit) {
                    return ((SystemUnit) p).getPower();

                } else {
                    return "-";
                }
            }
        }
        return "default";
    }
    public void delete(int ind){
        this.data.remove(ind);
        fireTableDataChanged();
    }
//    public void adding(Components components){
//        this.data.add(components);
//        fireTableDataChanged();
//    }

}
