package decorator;

public class BallsSilver extends TreeDecorator {
    Tree tree;

    public BallsSilver(Tree tree){
        this.tree = tree;
        this.hasStar = tree.hasStar;
    }

    public String getDescription(){
        return tree.getDescription() + ", Balls - Silver";
    }

    public int cost(){
        return tree.cost() + 3;
    }
}
