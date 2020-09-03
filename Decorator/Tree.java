package HW2;

public abstract class Tree {
    String description = "Unknown Tree";
    Boolean hasStar = false;

    public String getDescription(){
        return description;
    }

    public abstract int cost();

    public void setStar(){ hasStar = true; }

}
