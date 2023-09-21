import clavier.In;

public class LesSignes {
    public static void main(String[] args) {
        int laDate;
        String leMois;

        System.out.println("Entrer votre date de naissance: ");
        laDate = In.readInteger();
        System.out.println("Entre votre mois de naissance: ");
        leMois = In.readString();
        leMois = leMois.toLowerCase();


        if (laDate <= 20 && leMois == new String("mars")) {
            System.out.println("Hello");
        }
    }
}
