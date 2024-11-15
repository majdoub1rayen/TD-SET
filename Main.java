public class Main {
    public static void main(String[] args) {
        GestionEnseignant gestion = new EspritHashSet(); // Or new EspritTreeSet();

        Enseignant e1 = new Enseignant(1, "John", "Doe");
        Enseignant e2 = new Enseignant(2, "Jane", "Smith");
        Enseignant e3 = new Enseignant(3, "Albert", "Einstein");

        gestion.ajouterEnseignant(e1);
        gestion.ajouterEnseignant(e2);
        gestion.ajouterEnseignant(e3);

        System.out.println("All enseignants:");
        gestion.displayEnseignants();

        System.out.println("Search for id 2: " + gestion.rechercherEnseignant(2));
        System.out.println("Search for e3: " + gestion.rechercherEnseignant(e3));

        gestion.supprimerEnseignant(e2);
        System.out.println("After removing Jane Smith:");
        gestion.displayEnseignants();
    }
}