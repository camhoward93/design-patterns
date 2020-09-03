package HW2;

public class Ruffles extends TreeDecorator {
    Tree tree;

    public Ruffles(Tree tree){
        this.tree = tree;
        this.hasStar = tree.hasStar;
    }

    public String getDescription(){
        return tree.getDescription() + ", Ruffles";
    }

    public int cost(){
        return tree.cost() + 1;
    }
}
