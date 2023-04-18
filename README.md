# 6.03 Atividade colaborativa

#### (Questão 1 - BM) Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo?
<div align="center">

|Lâmpada à Venda|
|-----------------|
| - estado: boolean <br> - modelo: string <br> - marca: string <br> - tensão: int <br> - preço: double |
| - liga() <br> - desliga() <br> - mostraPreço() <br> - mostraInformações() |
</div>

#### (Questão 2 - BM) Crie um modelo para representar um time de um esporte qualquer em um campeonato desse esporte. Que dados e operações esse modelo deve ter?
<div align="center">

|Time de Esporte|
|---------------|
| - nomeTime: string  <br> - nomeTécnico: string <br> - pontuação: int |
| - defineTime() <br> - defineTécnico() <br> - mostrarPontuação() <br> - adicionaPontuação() <br> - removePontuação() <br> - mostraStatus() |
</div>

#### (Questão 3 - BM) Modifique a operação mostraDados do modelo ContaBancariaSimplificada ( ) para que, caso o saldo esteja negativo, uma mensagem de alerta seja impressa. Dica: O saldo só poderá ser negativo se a conta for especial.

```ruby
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
    } 
    else {
        System.out.println("A conta é comum.");
    }
}
```

#### (Questão 6 - BM) Modifique o método “abreContaSimples” da classe “ContaBancariaSimplificada” de forma que o cliente só possa abrir uma conta com um valor mínimo de R$ 100,00.

```ruby
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
```

#### (Questão 7 - BM) Identifique e explique o(s) erro(s) na classe abaixo:

```ruby
class Registro De Eleitor
{
/**
* Declaração dos campos desta classe
*/
int tituloDeEleitor; // número do título do eleitor
String nome; // nome do eleitor
short zonaEleitoral; // número da zona eleitoral
} // fim da classe
```

O erro está presente no titulo da classe, pois nele foram usados espaços e isso não pode ocorrer.

#### (Questão 8 -  BM) Identifique e explique o(s) erro(s) na classe abaixo:

```ruby
class Teste2
{
/**
* Declaração dos campos desta classe
*/
int num1,num2;
/**
* Declaração dos métodos desta classe
*/
int maior()
{
if (num1 > num2)
return true;
else return false;
}
void menor()
{
if (num1 < num2)
return num1;
else return num2;
}
} // fim da classe
```

O método maior() está retornando um booleano, porém é do tipo inteiro e o método menor() que é do tipo void e mesmo assim possui um retorno.

#### (Questão 9 - BM) Identifique e explique o(s) erro(s) na classe abaixo.

``` ruby
class TesteImpressao
{
main(String[] args)
{
System.out.println(“7+2=”+(7+2));
System.out.println(“7-2=”+(7-2));
System.out.println(“7*2=”+(7*2));
System.out.println(“7/2=”+(7/2));
return true;
}
} // fim da classe
```

A declaração do método main está incorreta, a maneira correta deveria ser "public static void main (String[] args)", além de retornar um booleano, mesmo sendo um void.