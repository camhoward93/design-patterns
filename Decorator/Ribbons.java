package HW2;

public class Ribbons extends TreeDecorator {
    Tree tree;

    public Ribbons(Tree tree){
        this.tree = tree;
        this.hasStar = tree.hasStar;
    }

    public String getDescription(){
        return tree.getDescription() + ", Ribbons";
    }

    public int cost(){
        return tree.cost() + 2;
    }
}
