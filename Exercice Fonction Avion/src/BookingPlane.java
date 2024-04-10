
import java.util.Scanner;
import java.util.Arrays;
public class BookingPlane {
//La capacité de l'avion est de 10 sièges

    //coût d'un billet d'avion est de 500 $.
    //L'utilisateur peut choisir son numéro de siège (de 1 à 10)
    //Chaque kg supplémentaire est
    //facturé 5$. Toutefois, le poids du sac ne doit jamais dépasser 20 kg
    //message de confirmation contenant le numéro de siège du client, les frais de poids supplémentaire et le total des frais.
    //récapitulatif du nombre de places réservées
    //avec le revenu total.

    static void initialiseSeats(int SEAT_CAPACITY,boolean[] seatAvailability) {
        /*for (int i = 0; i < SEAT_CAPACITY; i++) {
            seatAvailability[i] = false;
        }*/
        boolean[] seatAvailibility = new boolean[SEAT_CAPACITY];
        System.out.println(Arrays.toString(seatAvailability));
    }

  static double reserveSeat(Scanner scanner, boolean[]seatAvailability){
        //gère la résa pour un siege donné
      int seat_number;
      double luggage_weight = 0;
      double total = 0;
      do {
          System.out.println("N° siege souhaite (1-10) ?");
           seat_number = scanner.nextInt();

          if (seat_number < 1 ||seat_number > 10) {
              System.out.println("N° de siege invalide. Entrer un nombre entre 1 et 10");

        continue;
          }

          if (seatAvailability[seat_number - 1]) {
              System.out.println("Désolé le siège est déjà réservé.Veuillez choisir un nouveau siège");
              return -1;
          }

          System.out.println("Poids du bagage ?");
          luggage_weight = scanner.nextDouble();
          if(!seatAvailability[seat_number-1] && luggage_weight > 20){
              System.out.println("Désolé, poids bagage au dessus limite autorisee. Reservation rejetée");
              return -1;
          }

      }while(seat_number < 1 ||seat_number > 10 || seatAvailability[seat_number - 1] ||!seatAvailability[seat_number-1] && luggage_weight > 20 );

        if(!seatAvailability[seat_number-1] && luggage_weight <= 20 ){

            System.out.println("Félicitation votre siege est réservé !");
            seatAvailability[seat_number-1] = true;
            //double extra_weight = (luggage_weight-20 ) * 5;
            total += 500 + 50;
            System.out.println("N° siege" + seat_number + "\n"+ "Total : " + total);


        }


        return total;
   }

   static void displaySummary(int seatsReserved, double totalRevenue){
       System.out.println("Récapitulatif:");
       System.out.println("Nombre de places réservées :"+ seatsReserved);
       System.out.println("Revenu total:"+totalRevenue);

   }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre de sièges de votre avion");
        int SEAT_CAPACITY = scanner.nextInt();
        boolean[] seats = new boolean[SEAT_CAPACITY]; //initialiser la taille
        initialiseSeats(SEAT_CAPACITY,seats); //pourquoi remettre la valeur de Seat_capacity alors que taille du tableau deja initi
        //boolean[] seats = new boolean[0]; //initialiseSeats(10,seats); ne marche pas car je pensais initialiser un tableau "vide" et ensuite le remplir en appelant la fonction
        // boolean[] seats = new boolean[10]; // marche avec initialiseSeats(10,seats); mais aussi initialiseSeats(8,seats);
        //Pourquoi il n'est pas possible d'enlever SEAT_CAPACITY dans la fonction ?
        int nbSiegeReserves = 0;
        double totalCompany = 0;
        int choice;
        do{
            System.out.println("1.Reserver un siege \n 2.Terminer la réservation");
            choice = scanner.nextInt();
            System.out.println(choice == 1? "Choix 1": "Choix 2");

            if(choice == 1){
                double res = reserveSeat(scanner,seats);//est ce que le seats ici correspond bien au tableau avec 12 valeurs initialisées à false  même si la fonction est void et qu'on ne récupère pas le résultat de l'appel de boolean[]  initialiseSeats(SEAT_CAPACITY,seats); ?
                if(res != -1){
                    nbSiegeReserves+= 1;
                    totalCompany += res;
                }
            }
        }while(choice != 2);

        if(choice == 2){
            displaySummary(nbSiegeReserves,totalCompany);
        }

    }
}
