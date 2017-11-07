//Denne klasse opretter nye objekter baseret på de indkapslede data i klassen "Opgave10_2"

public class RunOpgave10_2 {

    public static void main(String[] args) { //Main-metoden eksekveres

        Opgave10_2 bmi1 = new Opgave10_2("Oluf Sand", 63, 92, 1.80); //Nyt objekt
        System.out.println("BMI'en for " + bmi1.getName() + " er "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        Opgave10_2 bmi2 = new Opgave10_2("Ulla Hansen", 70, 1.70); //Nyt objekt
        System.out.println("BMI'en for " + bmi2.getName() + " er "
                + bmi2.getBMI() + " " + bmi2.getStatus());

    }

}
