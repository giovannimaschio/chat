import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class SimulazioneChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        System.out.print("Scegli il nome per l'interlocutore: ");
        String nomeInterlocutore = scanner.nextLine();

        System.out.println("Inizia la chat con " + nomeInterlocutore + ":");

        // Lista di risposte accettate
        List<String> risposteAccettate = new ArrayList<>();
        risposteAccettate.add("bene");
        risposteAccettate.add("male");
        risposteAccettate.add("una merda");
        risposteAccettate.add("uno schifo");
        risposteAccettate.add("una favola");
        risposteAccettate.add("tutto bene");
        risposteAccettate.add("normale");
        risposteAccettate.add("il solito");
        risposteAccettate.add("tutto tranquillo");
        risposteAccettate.add("potrebbe andare peggio");
        risposteAccettate.add("potrebbe andare meglio");

        while (true) {
            System.out.print("Tu: ");
            String messaggio = scanner.nextLine();

            // Ottieni l'orario corrente
            String orario = dateFormat.format(new Date());

            if (messaggio.equalsIgnoreCase("ciao")) {
                System.out.println(orario + " " + nomeInterlocutore + ": ciao");
            } else if (messaggio.equalsIgnoreCase("come va")) {
                String[] risposte = {
                    "Bene, grazie! E tu?",
                    "Non c'è male, e tu?",
                    "Sto bene, grazie per chiedere. E tu?",
                    "Bene, mi sento abbastanza bene. E tu?",
                    "Tutto tranquillo da questo lato. E tu?",
                    "Non posso lamentarmi. E tu?",
                    "Sta andando tutto bene. E tu?"
                };

                int index = random.nextInt(risposte.length);
                System.out.println(orario + " " + nomeInterlocutore + ": " + risposte[index]);

                // Attendiamo una risposta da parte tua
                System.out.print("Tu: ");
                String tuaRisposta = scanner.nextLine();

                // Verifica se la tua risposta è tra quelle accettate
                if (risposteAccettate.contains(tuaRisposta.toLowerCase())) {
                    System.out.println(orario + " Tu: " + tuaRisposta);

                    // Gestisci risposte specifiche
                    if (tuaRisposta.equalsIgnoreCase("bene")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Cosa fai domani?");
                    } else if (tuaRisposta.equalsIgnoreCase("male")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Che succede??");
                    } else if (tuaRisposta.equalsIgnoreCase("una merda")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Come mai?");
                    } else if (tuaRisposta.equalsIgnoreCase("uno schifo")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Cos'hai?");
                    } else if (tuaRisposta.equalsIgnoreCase("una favola")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Bello, domani che impegni hai??");
                    } else if (tuaRisposta.equalsIgnoreCase("tutto bene")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Ok, che fai domani?");
                    } else if (tuaRisposta.equalsIgnoreCase("normale")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Ok, hai impegni domani?");
                    } else if (tuaRisposta.equalsIgnoreCase("il solito")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Ok, cosa ti servirebbe per stare meglio?");
                    } else if (tuaRisposta.equalsIgnoreCase("tutto tranquillo")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Ci sta, che fai?");
                    } else if (tuaRisposta.equalsIgnoreCase("potrebbe andare peggio")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Okok, che hai mangiato oggi?");
                    } else if (tuaRisposta.equalsIgnoreCase("potrebbe andare meglio")) {
                        System.out.println(orario + " " + nomeInterlocutore + ": Vuoi parlarne?");
                    }
                } else {
                    System.out.println(orario + " Tu: Mi dispiace, non capisco.");
                }
            } else {
                System.out.println(orario + " Tu: " + messaggio);
            }
        }
    }
}

