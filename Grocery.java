import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Xyxon on 5/25/2017.
 */
public class Grocery {
    private String name = "Dunlyn Store";
    private String[] items = {"eggs", "coconut", "cat food", "eco bag"};
    private Integer[] price = {5, 15, 150, 10};
    private List<String> order;
    private List<Integer> pieces;
    private int total;
    private int cash;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public Grocery(){
        order = new ArrayList<String>();
        pieces = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public Integer[] getPrice() {
        return price;
    }

    public void setPrice(Integer[] price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public List<String> getOrder() {
        return order;
    }

    public void setOrder(List<String> order) {
        this.order = order;
    }

    public List<Integer> getPieces() {
        return pieces;
    }

    public void setPieces(List<Integer> pieces) {
        this.pieces = pieces;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void addOrder(String order){
        this.order.add(order);
    }

    public void addPieces(int pieces){
        this.pieces.add(pieces);
    }

    public void addTotal(int price){
        this.total += price;
    }

    public int getChange(){
        return this.cash - this.total;
    }

}
