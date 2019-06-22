package robots;

public class Form {

    private double height;
    private int weight;
    private String color;
    private String material;
    private String formName;

    public Form(double height, int weight, String color, String material, String formName) {
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.material = material;
        this.formName = formName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }
}
