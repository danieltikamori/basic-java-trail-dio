package jobapplication;

public class SelectedCandidates {
    public static void main(String[] args) {
        printSelectedCandidates();

    }
    static void printSelectedCandidates() {
        String [] selectedCandidates = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        // Indexed way
        // When I need the index to complement the logic
        System.out.println("Printing with selection order by index.");
        for(int x=0; x<selectedCandidates.length; x++) {
            System.out.println((x+1)+ "° candidate is " + selectedCandidates [x] );
        }

        // Abbreviated way
        // Full interaction without needing position or index
        System.out.println("Printing them all without the need to display the index.");

        for(String candidato: selectedCandidates) {
            System.out.println(candidato);
        }

    }
}
