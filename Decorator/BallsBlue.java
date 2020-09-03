package decorator;

public class BallsBlue extends TreeDecorator {
    Tree tree;

    public BallsBlue(Tree tree){
        this.tree = tree;
        this.hasStar = tree.hasStar;
    }

    public String getDescription(){
        return tree.getDescription() + ", Balls - Blue";
    }

    public int cost(){
        return tree.cost() + 2;
    }
}
