import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Soma calcularSoma = new Soma();
        Subtracao calcularSubtracao = new Subtracao();
        Multiplicacao calcularMultiplicacao = new Multiplicacao();
        Divisao calcuDivisao = new Divisao();

        
        System.err.println("""
            -- BEM-VINDO -- 
            CALCULADORA SIMPLES
            Escolha uma operação:
            1-Soma
            2-Substração
            3-Multiplicação
            4-Divisão
            5-Sair
        """);
        
        System.out.print("Insira sua escolha: ");
        int escolha = input.nextInt();


        System.out.print("Valor A: ");
        double a = input.nextDouble();

        System.out.print("Valor B: ");
        double b = input.nextDouble();
        if (escolha == 1){
            calcularSoma.calcular(a, b);
        }
        else if (escolha == 2){
            calcularSubtracao.calcular(a, b);
        }
        else if(escolha == 3){
            calcularMultiplicacao.calcular(a, b);
        }
        else if (escolha == 4) {
            try{
                calcuDivisao.calcular(a, b);
            }
            catch (Exception DivisaoPorZeroException) {
                System.err.println("ERRO: " + DivisaoPorZeroException.getMessage());
            }
            
        }
        else{
            System.out.print("Encerrando sistema!");
        }

        
        input.close();
    }
}