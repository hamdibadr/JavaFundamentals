//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void afficherMessageBienvenue(String nomUtilisateur){
        System.out.println("Bienvenue, "+nomUtilisateur +" dans votre application COOKNEST !");
    }
    public static double calculerMoyenne(double note1, double note2, double note3){
        return ((note1+note2+note3)/3);
    }

    public static String obtenirStatus(int age){
        if(age>=18)
           return ("Majeur");
        else
            return("Mineur");
    }
    public static int multiplier(int a, int b){
        return a*b;
    }
    public static double multiplier(double a, double b){
        return a*b;
    }
    public static int multiplier(int a, int b,int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        int ageUtilisateur = 20;
        boolean aPermis = true;
        int points = 70;
        String mois = "Juillet";

        Calculateur monCalculateur = new Calculateur();
        OpérateursEtConditionsDemo demo = new OpérateursEtConditionsDemo();

        //System.out.printf("Bonjour, le monde Java !");

        //System.out.println("je m'appele Badr ");
        //System.out.println("Nombre de jours dans une semaine " +monCalculateur.joursSemaine);
        //System.out.println("le temperature aujourd huit tres eleve "+monCalculateur.temperature);
        //System.out.println("Ma ville est "+ monCalculateur.maVille);
        //System.out.println("l'etat de pramme de jour "+monCalculateur.programmeTermine);

        /*System.out.println("le prix Total est : " + demo.prixTotal);
        int nvNbArticles = demo.nbArticles += 2;
        System.out.println("le nombre d'article apres augmentasion : " + nvNbArticles);
        double nbSoldeCompte = demo.soldeCompte -= 20.75;
        System.out.println("le solde de compte : " + nbSoldeCompte);

        if (ageUtilisateur >= 18 && aPermis) {
            System.out.println("Vous pouvez conduire");
        } else {
            System.out.println("Vous ne pouvez PAS conduire.");

        }
        if (points >= 90 && points <= 100) {
            System.out.println("Excellent");
        } else if (points >= 70 && points <= 89) {
            System.out.println("Bien");

        } else if (points >= 50 && points <= 69) {
            System.out.println("Moyen");
        } else {
            System.out.println("Insuffisant");
        }

        switch (mois.toLowerCase()) { // Utilisation de toLowerCase() pour la robustesse
            case "décembre":
            case "janvier":
            case "février":
                System.out.println("Hiver");
                break;
            case "mars":
            case "avril":
            case "mai":
                System.out.println("Printemps");
                break;
            case "juin":
            case "juillet":
            case "août":
                System.out.println("Été");
                break;
            case "septembre":
            case "octobre":
            case "novembre":
                System.out.println("Automne");
                break;
            default:
                System.out.println("Mois non reconnu.");
                break;

        }*/
        /*List<String> nomingredient = new ArrayList<>();
        nomingredient.add("Tomate");
        nomingredient.add("Farine");
        nomingredient.add("Oeuf");
        nomingredient.add("Lait");
        nomingredient.add("Sucre");

        System.out.println("--- Boucle for ---");
        for (int i =0;i<=10;i++){
            if(i%2==0)
                System.out.println(" le nbr pair : "+i);
        }
        System.out.println("--- Boucle for-each ---");
        for (String ingredient : nomingredient){
            System.out.println("nom de l'ingrédient : " +ingredient);
        }

        System.out.println("--- Boucle while ---");
        int compteur = 0;
        while (compteur < 5){
            System.out.println("valeur de compteur : "+compteur);
            compteur++;
        }

        System.out.println("--- Boucle do-while ---");
        System.out.println("Ecrire un mots de passe : ");
        Scanner scanner = new Scanner(System.in);
        String motDePasseEntre;
        String motDePasseCorrect = "secret123";
        do {
            System.out.println("Entrez un mots de passe :");
            motDePasseEntre=scanner.nextLine();
            if (!motDePasseEntre.equals(motDePasseCorrect)) {
                System.out.println("Mot de passe incorrect. Réessayez.");
            }
        }while (!motDePasseEntre.equals(motDePasseCorrect));
        System.out.println("Mot de passe correct ! Accès autorisé.");
        scanner.close();

        System.out.println("break et continue");
        for (int i =0 ; i<=10 ; i++){
            if(i==7){
                System.out.println("le nombre est 7");
                break;
            }
            System.out.println("nombre : "+i);
        }
        for (int i =0 ; i<=10 ; i++){
            if(i==4){
                System.out.println("On saute le 4");
                continue;
            }
            System.out.println("nombre : "+i);
        }
    }*/
        String [] villesMarocaines = {"Casablanca", "Rabat", "Marrakech", "Fès", "Agadir"};
        System.out.println("la troisième ville du tableau "+villesMarocaines[2]);
        villesMarocaines[0]="Tanger";
        for (int i =0 ;i<villesMarocaines.length;i++){
            System.out.println("ville :"+villesMarocaines[i]);
        }

        for(String ville:villesMarocaines){
            System.out.println(" - "+ville);
        }

        System.out.println(" Création et Appel de Méthodes void");
        afficherMessageBienvenue("badr");
        afficherMessageBienvenue("chef");

        System.out.println("Création et Appel de Méthodes avec Retour");
        double moyenne =calculerMoyenne(17,18,20);
        System.out.println("le moyenne est :"+moyenne);
        System.out.println("status "+obtenirStatus(67));
        System.out.println("status "+obtenirStatus(11));
        System.out.println("status " +obtenirStatus(18));

        System.out.println("Exercice 4 (Avancé - Optionnel) : Surcharge de Méthodes");
        System.out.println("int "+ multiplier(4,4));
        System.out.println("double "+ multiplier(5.6,5.6));
        System.out.println("int  " + multiplier(5,5,5));



    }







}