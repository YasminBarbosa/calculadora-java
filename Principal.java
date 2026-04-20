import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Soma calcularSoma = new Soma();
        
        System.err.println("""
            -- BEM-VINDO -- 
            CALCULADORA SIMPLES
            Escolha uma operação:
            1-Soma
            2-Substração
            3-Multiplicação
            4-Divisão
        """);
        
        System.out.print("Insira sua escolha: ");
        int escolha = input.nextInt();


        if (escolha == 1){
            System.out.print("Valor A: ");
            double a = input.nextDouble();

            System.out.print("Valor B: ");
            double b = input.nextDouble();

            calcularSoma.calcular(a, b);

        }
        else if (escolha == 2){
            //substracao
        }
        else if(escolha == 3){
            //multiplicacao
        }
        else{
            //divisao
        }

        input.close();
    }
}