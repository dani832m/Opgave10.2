// Denne klasse indkapsler vores primitive datatyper + opretter metoder og constructors

public class Opgave10_2 {

    private String name;
    private int age;
    private double weight; // i kilogram!
    private double height; // i meter!

    public Opgave10_2(String name, int age, double weight, double height) { // Constructor der opfylder kravene i opg. 10,2
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Opgave10_2(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "- Undervægtig";
        else if (bmi < 25)
            return "- Normalvægtig";
        else if (bmi < 30)
            return "- Overvægtig";
        else
            return "- Fed";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

}