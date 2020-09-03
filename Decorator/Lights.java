package HW2;

public class Lights extends TreeDecorator {
    Tree tree;

    public Lights(Tree tree){
        this.tree = tree;
        this.hasStar = tree.hasStar;
    }

    public String getDescription(){
        return tree.getDescription() + ", Lights";
    }

    public int cost(){
        return tree.cost() + 5;
    }
}
