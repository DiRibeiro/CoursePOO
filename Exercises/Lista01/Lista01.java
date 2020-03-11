import java.util.ArrayList;
import java.util.Scanner;

public class Lista01{
    //Exer 1
    public static void impar(){
        int a;
        int b;
        int aux;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe dois valores para saber seu intervalo de números ímpares: ");
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("Números ímpares: ");
        for (aux = a; aux < b; aux++) {
            if((aux % 2) == 1){
                System.out.printf(" "+ aux);
            }
        }
        System.out.println();
    }
    //Exer 2
    public static void bancoEmp(){
        double P; //emprestado
        double A; //valor mensal
        int quantidadeParcelas; //parcela
        double valorFinal;
        double i = 0.18; //juros com taxa de 18%
        
        Scanner in = new Scanner(System.in);

        System.out.println("Valor do emprestimo: ");
        P = in.nextFloat();
        
        System.out.println("Quantidade de parcelas: ");
        quantidadeParcelas = in.nextInt();

        valorFinal = P += P * i;
        A = valorFinal / quantidadeParcelas;

        System.out.println("Total emprestimo: "+ valorFinal + "\nValor Parcela: "+ A);
       
        //a) valor em dinheiro dos juros pagos
        double jurosPagos;
        int parcelasPagas;
        char res = ' ';
        double valorDinheiro = 0;

        System.out.println("Ja foi realizado algum pagamento? [S] / [N] ");
        res = in.next().charAt(0);

        if(res == ('S') || res == ('s')){

            System.out.println("Informe quantas parcelas foram pagas: ");
            parcelasPagas = in.nextInt();
            
            valorDinheiro = (A * parcelasPagas);
            jurosPagos = i* A;
            System.out.println("Juros pagos por parcela: R$"+ jurosPagos);

            //b) valor em dinheiro aplicada no pagamento da dívida
            System.out.println("Foram pagos: R$"+ valorDinheiro);
            //c) valor acumulado de juros já pagos
            jurosPagos = i* (A * parcelasPagas);
            System.out.println("Juros total ja pago: R$"+ jurosPagos);
            //d) valor ainda por pagar do empréstimo no fim de cada mês
            double valorRestante = valorFinal - (A * parcelasPagas);
            System.out.println("Ainda restam R$ "+ valorRestante +" para seu emprestimo ser quitado.");
            //e) número de meses necessários para pagar o empréstimo
            int mesesRestantes = quantidadeParcelas - parcelasPagas;
            System.out.println("Restam "+ mesesRestantes + ".");
            //f) quantidade da última prestação
            double ultimaParcela = A;
            System.out.println("Valor da ultima parcela: R$"+ ultimaParcela +".");
        }else{
            //d) valor ainda por pagar do empréstimo no fim de cada mês
            System.out.println("Ainda restam R$ "+ valorFinal +"para seu emprestimo ser quitado.");
            //e) número de meses necessários para pagar o empréstimo
            System.out.println("Ainda restam "+ quantidadeParcelas +".");
            //f) quantidade da última prestação
            System.out.println("Valor da ultima parcela: R$"+ A +".");
        }
    }
    //Exer 3
    public static void salario(){
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        float salarioAtual = 0;
        ArrayList<Float> salarioAtualizado = new ArrayList<Float>();
        Scanner in = new Scanner(System.in);
        String nome;

        while(true){
            
            System.out.println("Informe o nome do funcionario: ");
            nome = in.nextLine(); 
            if(nome.equals("FIM") || nome.equals("fim") || nome.equals("Fim")) break;
            
            System.out.println("Informe o salario atual: ");
            salarioAtual = in.nextFloat();
            lista.add(new Funcionario((String)nome,(float)salarioAtual));
            in.nextLine();

            if(nome != "FIM" || nome != "fim" || nome != "Fim"){
                if(salarioAtual < 150){
                    salarioAtual += (salarioAtual * 0.25);
                    salarioAtualizado.add(salarioAtual);
                }
                else if(salarioAtual > 150 && salarioAtual < 300){
                    salarioAtual += (salarioAtual * 0.20);
                    salarioAtualizado.add(salarioAtual);
                }
                else if(salarioAtual > 300 && salarioAtual < 600){
                    salarioAtual += (salarioAtual * 0.15);
                    salarioAtualizado.add(salarioAtual);
                }
                else if(salarioAtual > 600){
                    salarioAtual += (salarioAtual * 0.10);
                    salarioAtualizado.add(salarioAtual);
                }
            }
    }
    for(int i = 0; i < lista.size() && i < salarioAtualizado.size(); i++){
        System.out.println("Nome: "+ lista.toString() + "\t Salario Atualizado: R$" + salarioAtualizado.toString());
    }      
}

    // Exer 4
    public static void conversao(){
        int number;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        number = in.nextInt();
        
        System.out.println("Binario: "+ Integer.toBinaryString(number));
        System.out.println("Hexadecimal: "+ Integer.toHexString(number));
    }
    //Exer 5
    public static int inFibonacci(int n) {
        return (n < 2) ? n : inFibonacci(n - 1) + inFibonacci(n - 2);
    }
    public static int imprimirFibo(int n){
        int i;
        
        for (i = 1; i > 0;) {
            
            if(i != inFibonacci(n)){
                System.out.println("Nao faz parte da sequencia fibonacci.");
                break;
            }else{
                System.out.println("Faz parte da sequencia.");
                for(i = 1; i < 10; i++)
                    System.out.println(+ inFibonacci(i) + "\t");
                break;
            }
        }
        return n;
    }
    public static void getFibonacci(int n){

    }
    //Exer 6
    public static boolean isPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;   
        }
        return true;
    }
    //Exer 7
    public static void mes(int mes) {
        
        switch(mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Marco");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Este mes nao e valido");
                break;
        }
    }
    public static void vetorMes(int mes){
        String[] vetor = {"Janeiro","Fevereiro","Marco","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        for(int i = mes; i < vetor.length+1; ++i) {
            System.out.println(vetor[i-1]);
            break;
        }
    }
    //Exer 9
    public static int fatorial(int n){
        if(n == 1){
            return 1;
        }
        
        return n * fatorial(n - 1);
    }
    //Exer 10
    public static int somatorio(int n){
        if(n == 1)
            return 1;

        return n += somatorio(n-1);
    }
    //Exer 11
    public static int multRec(int n1, int n2) {
        int result = 0;
        if(n1 > 0){
            n1--;
            result = n2;
        }else if(n1 < 0){
            n1++;
            result = -n2;
        }if(n1 == 0){
            return result;
        }else{
            return result + multRec(n1,n2);
        }
    }
    //Exer 12
    public static int naturaisCrescente(int n){
        int i;
        for(i = 0; i <= n; i++)
            System.out.print("\t"+i);
        return i;
    }
    //Exer 13
    public static int naturaisDecrescente(int n){
        int i;
        for(i = n; i >= 0; i--)
            System.out.print("\t"+i);
        return i;
    }
    //Exer 14
    public static int somaArray(int n) {
        
        return n;
    }
    //Exer 15
    public static int fatorialDuplo(int n){
        if(n % 2 != 0)
            n *= fatorial(n);
        return n;
    }
    public static void main(String args[]) {
        //Exer 1
        //impar();

        //Exer 2
        //bancoEmp();
        
        //Exer 3
        //salario();

        //Exer 4
        //conversao(); 

        //Exer 5
        imprimirFibo(2);

        //Exer 6
        //isPrimo(5);

        //Exer 7
        /*System.out.println("Informe um mes entre 1 e 12: ");
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();

        System.out.print("\nSem vetor: ");
        mes(valor);
        System.out.print("\nVetor: ");
        vetorMes(valor);*/

        //Exer 9
        /*System.out.println("Informe um valor para saber seu fatorial: ");
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        System.out.println("Fatorial de "+valor+" = "+fatorial(valor));*/

        //Exer 10
        /*System.out.println("Informe um valor para calcular o somatorio: ");
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        System.out.println("Somatorio: "+somatorio(valor));*/

        //Exer 11
        /*System.out.println("Informe dois valores para saber sua multiplicacao: ");
        Scanner in = new Scanner(System.in);
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        System.out.println("Multiplicacao entre "+v1+" e "+v2+" = "+multRec(v1,v2));*/
   
        //Exer 12
        /*System.out.println("Naturais ordem crescente: ");
        naturaisCrescente(5);*/

        //Exer 13
        /*System.out.println("Naturais ordem decrescente: ");
        naturaisDecrescente(5);*/

        //Exer 14

        //Exer 15
        /*System.out.println("Informe um valor para saber seu fatorial: ");
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        System.out.println("Fatorial duplo de "+ valor +" = "+ fatorialDuplo(valor));*/
    }
}