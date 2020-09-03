package exercise;

public class wheels {

    private String material;
    private int count;

    public wheels(){
        this.material = "shit";
        this.count = 0;
    }

    public wheels(String material, int count) {
        this.material = material;
        this.count = count;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
