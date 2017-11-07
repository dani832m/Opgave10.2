//Denne klasse indkapsler vores primitive datatyper, opretter metoder og constructors

public class Opgave10_2 {

    //Deklarerer variabler
    private String name;
    private int age;
    private double weight; //Angives i kilogram!
    private double height; //Angives i meter!

    public Opgave10_2(String name, int age, double weight, double height) { //Constructor der opfylder kravene i opg. 10.2
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //Anden constructor der tager tre parametre ind
    public Opgave10_2(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    //Metode til at udregne BMI
    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    //Metode der fortæller, om du er undervægtig, normalvægtig eller overvægtig
    public String getStatus() {
        double bmi = getBMI(); //Initialiserer variablen "bmi" med den reelle BMI
        //If-statement der inddeler BMI i kategorier
        if (bmi < 18.5)
            return "- Undervægtig";
        else if (bmi < 25)
            return "- Normalvægtig";
        else if (bmi < 30)
            return "- Overvægtig";
        else
            return "- Fed";
    }

    //Metoder der returnerer henholdsvis String, int og doubles
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
