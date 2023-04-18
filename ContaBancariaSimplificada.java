public class ContaBancariaSimplificada {


    String nomeDoCorrentista;
    double saldo;
    boolean contaEspecial;

    /*
    void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 0.00;
        contaEspecial = false;
    }
    */
    boolean abreContaSimples(String nome, double saldoInicial) {
        if(saldoInicial>=100){
            nomeDoCorrentista = nome;
            saldo = saldoInicial;
            contaEspecial = false;
            return true;
        }
        else {
            return false;
        }
    }
    void deposita(double valor) {
        saldo += valor;
    }

    boolean retira(double valor) {
        if (contaEspecial == false) {
            if (valor <= saldo) {
                saldo -= valor;
                return true;
            } else {
                return false;
            }
        } else {
            saldo -= valor;
            return true;
        }
    }

    /*
    void mostraDados() {
        System.out.print("O nome do correntista é: ");
        System.out.print(nomeDoCorrentista);
        System.out.print("O saldo é: ");
        System.out.print(saldo);
        if (contaÉEspecial) {
            System.out.print("A conta é especial.");
        } else {
            System.out.print("A conta é comum.");
        }
    }
     */
    void mostraDados() {
        System.out.print("O nome do correntista é: ");
        System.out.print(nomeDoCorrentista);
        System.out.println("O saldo é: ");
        System.out.print(saldo);
        if (contaEspecial == true && saldo < 0) {
            System.out.println("Atenção saldo negativo!");
        }
        if (contaEspecial) {
            System.out.println("A conta é especial.");
        } else {
            System.out.println("A conta é comum.");
        }
    }
}