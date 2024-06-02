package cc.tkmr;

public class TestFlowControl {
    public static void main(String[] args) {
        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }


        int numero = 1;

        for (int x=1; x<2; x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);


        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
        System.out.print(nomes.length);

        // Infinite loop
//        int num = 5, count = 1;
//        do {
//            num += count;
//            System.out.println(num);
//        } while (count <= 3);


        boolean condicao = false;

        while(condicao){
            System.out.println("executou ... ");
        }
    }
}
