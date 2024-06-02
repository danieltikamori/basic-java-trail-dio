package jobapplication;

import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {

    public static void main(String[] args) {

        candidateSelection();
    }

    static void candidateSelection() {
    // Array com a lista de candidatos

    String [] candidates = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

    int selectdCandidates = 0;
    int currentCandidate = 0;
    double baseSalary = 2000.00;
    while(selectdCandidates < 5 && currentCandidate < candidates.length) {
        String candidateName = candidates[currentCandidate];
        double desiredSalary = desiredValue();

        System.out.println("The candidate " + candidateName + " asked for a salary of " + desiredSalary + "." );
        if (baseSalary > desiredSalary) {
            selectdCandidates++;
        }
        currentCandidate++;
        salaryAnalysis(baseSalary, desiredSalary);

    }
    }

    static void salaryAnalysis(double baseSalary, double desiredSalary) {

        if(baseSalary > desiredSalary) {
            System.out.println("Call the candidate directly.");
        }
        else if(baseSalary == desiredSalary) {
            System.out.println("Call the candidate with a counter offer.");
        }
        else {
            System.out.println("Wait for other candidates results.");
        }
    }

    // Método que simula o valor pretendido

    static double desiredValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
