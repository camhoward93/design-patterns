package HW2;

public class Main {
    public static void printTree(Tree tree){
        System.out.println(tree.getDescription() + " costs $" + tree.cost() + ".");
    }

    public static void main(String args[]){
        Tree myTree = new BlueSpruce();
        myTree = new Star(myTree);
        myTree = new Ruffles(myTree);
        myTree = new Star(myTree);
        myTree = new Ruffles(myTree);
        printTree(myTree);

        Tree newTree = new DouglasFir();
        newTree = new Star(newTree);
        newTree = new Ribbons(newTree);
        newTree = new BallsSilver(newTree);
        newTree = new BallsRed(newTree);
        newTree = new Star(newTree);
        newTree = new LEDs(newTree);
        newTree = new BallsBlue(newTree);
        newTree = new Ribbons(newTree);
        newTree = new Star(newTree);
        newTree = new Ruffles(newTree);
        printTree(newTree);
    }
}
