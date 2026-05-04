    import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Soma calcularSoma = new Soma();
        Subtracao calcularSubtracao = new Subtracao();
        Multiplicacao calcularMultiplicacao = new Multiplicacao();
        Divisao calcuDivisao = new Divisao();

        String message = """
            -- BEM-VINDO -- 
            CALCULADORA SIMPLES
            Escolha uma operação:
            1-Soma
            2-Substração
            3-Multiplicação
            4-Divisão
            5-Sair
        """;
        String messageChoice = "Insira sua escolha: ";

        System.out.println(message);
        System.out.print(messageChoice);

        int choice = input.nextInt();

        System.out.print("A: ");
        double a = input.nextDouble();

        System.out.print("B: ");
        double b = input.nextDouble();

        switch(choice){
            case 1:
                calcularSoma.calcular(a, b);
                break;
            case 2:
                calcularSubtracao.calcular(a, b);
                break;
            case 3:
                calcularMultiplicacao.calcular(a, b);
                break;
            case 4:
                try{
                    calcuDivisao.calcular(a, b);
                    break;
                }
                catch(Exception DivisaoPorZeroException){
                    System.err.println("ERRO: " + DivisaoPorZeroException.getMessage());
                }
            case 5:
                System.out.println("Encerrando sistema!");
                break;
        }
        input.close();
    }
}