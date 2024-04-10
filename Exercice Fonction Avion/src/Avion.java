/*
import java.util.Scanner;


public class Avion {

    public static void initializeSeats(int SEAT_CAPACITY, boolean[] seatAvailability) {
        for (int i = 0; i < SEAT_CAPACITY; i++) {
            seatAvailability[i] = false;
        }
    }
    public static double reservedSeat(Scanner scan, boolean[] seatAvailability){
        final int SEAT_CAPACITY = seatAvailability.length;
        System.out.println("1.Réservez un siège \n 2.Terminez la réservation");
        int choice = scan.nextInt();
        if(choice == 1){
            System.out.println("Choix 1");

            System.out.println("Entrer le numéro de siège souhaité de 1 à"+seatAvailability.length);
            int seat_choice = scan.nextInt();
            if(seat_choice < 1 || seat_choice > SEAT_CAPACITY){
                System.out.println("N° de siege invalide");
            }
        }
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Scanner;
    public class Main {

 */


//Numero de siege invalide
//afficher à nouveau la possibilité de réserver en cas de résa successfull

        //choix siege 1 à 10
        //rejeter la résa si poids bagage > 20 ou place non disponible
        //Si ok numéro de siège et affichage excédent poids et prix à payer excédent
        //Donner la possibilité de mettre fin au processus derésa
        //Return nombre total de places réservées et revenu total de la compagnie
        //static int seat_capacity = 0;
   /*     static void initializeSeats(int SEAT_CAPACITY,boolean[] seatAvailability){
            //initialise tous les sièges disponibles

            //  Arrays.fill(seatAvailability, false);
            boolean[] seatAvailibility = new boolean[SEAT_CAPACITY]; //initialise deja  valeurs à false
        }

        static int seatsReserved = 0;
        static double total_frais = 0;
        static double reservedSeat(Scanner scan, boolean[] seatAvailability){
            //gère la résa
            //N° de siège et poids bagae souhaité
            //retourne -1 si résa non complétée
            //sinon retourne cout total
            System.out.println("1.Reserver un siege \n 2.Terminer la réservation ");
            int choice =  scan.nextInt();
            if(choice == 1){

                System.out.println("Choix 1");
                do{System.out.println("Entrer le numéro de siege souhaité (1-10)");
                    int seat_number = scan.nextInt();
                    if(seat_number < 1 || seat_number > 10){
                        System.out.println("N° de siege invalide. Entrer un nombre entre 1 et 10");
                    }
                    System.out.println("Entrer poids de votre bagage (kg)");
                    double luggage_weight = scan.nextDouble();

                    if(seatAvailability[seat_number-1] && luggage_weight <= 20){
                        System.out.println("Désolé le siège est déjà réservé.Veuillez choisir un nouveau siège");
                        return -1;
                    }
                }while(seat_number < 1 || seat_number > 10 ||seatAvailability[seat_number-1]);


                if(!seatAvailability[seat_number-1] && luggage_weight > 20){
                    System.out.println("Désolé, poids bagage au dessus limite autorisee. Reservation rejetée");
                    return -1;
                }


                if(!seatAvailability[seat_number-1] && luggage_weight <= 20 ){
                    System.out.println("Félicitation votre siege est réservé !");
                    seatAvailability[seat_number-1] = true;
                    System.out.println("Entrer un excédent bagage (kg)");
                    double extra_weight = scan.nextDouble();
                    double total_frais = 500 + extra_weight;
                    seatsReserved +=1;
                    System.out.println("N° de siege :" + seat_number +"\n" + "Frais de poids supplémentaire : " + extra_weight+ "\n" + "Total des frais" + total_frais);
                    //afficher à nouveau la possibilité de réserver
                    return total_frais;
                }
            } else{
                System.out.println("Choix 2");
              /* int total_seats_reserved =  ;
               double total_frais = ;
               System.out.println("Recap des reservations:" + );*/
    //            return -1;
       //     }
   //         return total_frais;

    //    }

      /*  static void displaySummary(int totalSeatsReserved, double totalRevenue){
            //nb total de sieges reservés . Peut aussi etre géré avec la valeur de retour de la fonction reservedSeats
            totalRevenue = total_frais;
            totalSeatsReserved = seatsReserved;
            System.out.println("Nombre de place(s) réservée(s) :" + seatsReserved + "Revenu total:"+totalRevenue);
            //revenu total
        }

        public static void main(String[] args) {
            double res;
            boolean[] seatAvailability = new boolean[10];
            Scanner scan = new Scanner(System.in);
            //Ici le while pour l'affichage à nouveau du formulaire
            initializeSeats(10,seatAvailability);
            do{
                res = reservedSeat(scan,seatAvailability);
            }while(res == -1);


        }
    }








    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    }
}


import java.util.Scanner;

public class Avion {

    public static void initializeSeats(int SEAT_CAPACITY, boolean[] seatAvailability) {
        for (int i = 0; i < SEAT_CAPACITY; i++) {
            seatAvailability[i] = false;
        }
    }
    public static double reservedSeat(Scanner scan, boolean[] seatAvailability){
        final int SEAT_CAPACITY = seatAvailability.length;
        System.out.println("1.Réservez un siège \n 2.Terminez la réservation");
        int choice = scan.nextInt();
        if(choice == 1){
            System.out.println("Choix 1");

            System.out.println("Entrer le numéro de siège souhaité de 1 à"+seatAvailability.length);
            int seat_choice = scan.nextInt();
            if(seat_choice < 1 || seat_choice > SEAT_CAPACITY){
                System.out.println("N° de siege invalide");
            }
        }
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Scanner;
    public class Main {


//Numero de siege invalide
//afficher à nouveau la possibilité de réserver en cas de résa successfull

        //choix siege 1 à 10
        //rejeter la résa si poids bagage > 20 ou place non disponible
        //Si ok numéro de siège et affichage excédent poids et prix à payer excédent
        //Donner la possibilité de mettre fin au processus derésa
        //Return nombre total de places réservées et revenu total de la compagnie
        //static int seat_capacity = 0;
        static void initializeSeats(int SEAT_CAPACITY,boolean[] seatAvailability){
            //initialise tous les sièges disponibles

            //  Arrays.fill(seatAvailability, false);
            boolean[] seatAvailibility = new boolean[SEAT_CAPACITY]; //initialise deja  valeurs à false
        }

        static int seatsReserved = 0;
        static double total_frais = 0;
        static double reservedSeat(Scanner scan, boolean[] seatAvailability){
            //gère la résa
            //N° de siège et poids bagae souhaité
            //retourne -1 si résa non complétée
            //sinon retourne cout total
            System.out.println("1.Reserver un siege \n 2.Terminer la réservation ");
            int choice =  scan.nextInt();
            if(choice == 1){

                System.out.println("Choix 1");
                do{System.out.println("Entrer le numéro de siege souhaité (1-10)");
                    int seat_number = scan.nextInt();
                    if(seat_number < 1 || seat_number > 10){
                        System.out.println("N° de siege invalide. Entrer un nombre entre 1 et 10");
                    }
                    System.out.println("Entrer poids de votre bagage (kg)");
                    double luggage_weight = scan.nextDouble();

                    if(seatAvailability[seat_number-1] && luggage_weight <= 20){
                        System.out.println("Désolé le siège est déjà réservé.Veuillez choisir un nouveau siège");
                        return -1;
                    }
                }while(seat_number < 1 || seat_number > 10 ||seatAvailability[seat_number-1]);


                if(!seatAvailability[seat_number-1] && luggage_weight > 20){
                    System.out.println("Désolé, poids bagage au dessus limite autorisee. Reservation rejetée");
                    return -1;
                }


                if(!seatAvailability[seat_number-1] && luggage_weight <= 20 ){
                    System.out.println("Félicitation votre siege est réservé !");
                    seatAvailability[seat_number-1] = true;
                    System.out.println("Entrer un excédent bagage (kg)");
                    double extra_weight = scan.nextDouble();
                    double total_frais = 500 + extra_weight;
                    seatsReserved +=1;
                    System.out.println("N° de siege :" + seat_number +"\n" + "Frais de poids supplémentaire : " + extra_weight+ "\n" + "Total des frais" + total_frais);
                    //afficher à nouveau la possibilité de réserver
                    return total_frais;
                }
            } else{
                System.out.println("Choix 2");
              /* int total_seats_reserved =  ;
               double total_frais = ;
               System.out.println("Recap des reservations:" + );*/
   //             return -1;
       //     }
     //       return total_frais;

     //   }

     /*   static void displaySummary(int totalSeatsReserved, double totalRevenue){
            //nb total de sieges reservés . Peut aussi etre géré avec la valeur de retour de la fonction reservedSeats
            totalRevenue = total_frais;
            totalSeatsReserved = seatsReserved;
            System.out.println("Nombre de place(s) réservée(s) :" + seatsReserved + "Revenu total:"+totalRevenue);
            //revenu total
        }

        public static void main(String[] args) {
            double res;
            boolean[] seatAvailability = new boolean[10];
            Scanner scan = new Scanner(System.in);
            //Ici le while pour l'affichage à nouveau du formulaire
            initializeSeats(10,seatAvailability);
            do{
                res = reservedSeat(scan,seatAvailability);
            }while(res == -1);


        }
    }








    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    }
}

*/
