public class BMExercicio04 {

    //Modelo Lâmpada à Venda
    boolean estado;
    String modelo;
    String marca;
    int tensao;
    double preco;

    boolean liga() {
        if (estado != true) {
            estado = true;
            return true;
        }
        else {
            return false;
        }
    }
    boolean desliga() {
        if (estado!=false){
            estado = false;
            return true;
        }
        else {
            return false;
        }
    }
    void mostraPreco () {
        System.out.println("R$"+ preco);
    }
    void mostraInformacoes (){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Tensão: "+tensao);
        System.out.println("Preço: R$"+preco);
    }
}
