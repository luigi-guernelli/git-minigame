package com.guernelli.luigi;

import java.util.Random;
import java.util.Scanner;

/** Titolo: mini-game livello-base: Guess the Number
 * -------------------------------------------------------
 * L'utente deve indovinare un numero generato casualmente dal programma.
 * 
 * Obiettivi didattici:
 * - Utilizzare Scanner per leggere input
 * - Applicare cicili while e condizioni if/else
 * - Comprendere il flusso logico di un programma
 */
public class GuessTheNumber {

    public static void main(String[] args) {

        // --- Sezione 1: Inizializzazione strumenti di gioco ---
        Scanner inputUtente = new Scanner(System.in);      // Lettura da tastiera
        Random generatoreCasuale = new Random();           // Genera numeri casuali

        int numeroSegreto = generatoreCasuale.nextInt(100) + 1;  // Numero casuale tra 1 e 100
        int tentativoUtente = 0;                                 // Numero scelto dall’utente
        int tentativi = 0;                                       // Conta i tentativi

        System.out.println("🎯 Benvenuto in Guess The Number!");
        System.out.println("Ho pensato a un numero tra 1 e 100... prova a indovinarlo!");

        // --- Sezione 2: Ciclo principale di gioco ---
        while (tentativoUtente != numeroSegreto) {
            System.out.print("Inserisci il tuo tentativo: ");
            tentativoUtente = inputUtente.nextInt();  // Legge il numero scelto dall’utente
            tentativi++;                              // Incrementa il numero di tentativi

            // --- Sezione 3: Controllo del risultato ---
            if (tentativoUtente < numeroSegreto) {
                System.out.println("Troppo basso! 🔽");
            } else if (tentativoUtente > numeroSegreto) {
                System.out.println("Troppo alto! 🔼");
            } else {
                System.out.println("✅ Complimenti! Hai indovinato il numero in " + tentativi + " tentativi!");
            }
        }

        // --- Sezione 4: Chiusura risorse ---
        inputUtente.close();
    }
}

