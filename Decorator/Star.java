package decorator;

public class Star extends TreeDecorator {
    Tree tree;

    public Star(Tree tree){
        this.tree = tree;
        this.setStar();

        if(tree.hasStar){
            System.out.println("This tree already has a star!");
        }

    }

    public String getDescription(){
        if(this.tree.hasStar){
            return tree.getDescription();
        }

        return tree.getDescription() + ", Star";
    }

    public int cost(){
        if(this.tree.hasStar){
            return tree.cost();
        }
        return tree.cost() + 4;
    }
}
