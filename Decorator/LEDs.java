package HW2;

public class LEDs extends TreeDecorator {
    Tree tree;

    public LEDs(Tree tree){
        this.tree = tree;
        this.hasStar = tree.hasStar;
    }

    public String getDescription(){
        return tree.getDescription() + ", L.E.D.'s";
    }

    public int cost(){
        return tree.cost() + 10;
    }
}
