package decorator;

public class BallsRed extends TreeDecorator {
    Tree tree;

    public BallsRed(Tree tree){
        this.tree = tree;
        this.hasStar = tree.hasStar;
    }

    public String getDescription(){
        return tree.getDescription() + ", Balls - Red";
    }

    public int cost(){
        return tree.cost() + 1;
    }
}
