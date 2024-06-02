package jobapplication;

import java.util.Random;

public class CandidateContact {
    public static void main(String[] args) {
        String [] selectedCandidates = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        // First a "for" to select candidates
        for(String candidate: selectedCandidates) {
            contactCandidate(candidate);
        }

    }
    static void contactCandidate(String candidate) {

        int numberOfTries = 1;
        boolean keepTrying = true;
        boolean answered = false;
        do {
            answered= answer();
            keepTrying = !answered;
            if(keepTrying)
                numberOfTries++;
            else
                System.out.println("CONTACT MADE SUCCESSFULLY!");

        }while(keepTrying && numberOfTries<3);

        if(answered)
            System.out.println("WE HAVE CONTACTED " + candidate +" AFTER " + numberOfTries + " ATTEMPT(S).");
        else
            System.out.println("WE CANNOT CONTACT " + candidate +", MAXIMUM NUMBER OF " + numberOfTries + " ATTEMPTS CARRIED OUT.");


    }

    //método auxiliar
    static boolean answer() {
        return new Random().nextInt(3)==1;
    }
}
