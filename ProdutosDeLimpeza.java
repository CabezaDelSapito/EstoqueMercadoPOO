public class ProdutosDeLimpeza {
    public String nome;
    public int quant;
    public double preco;

    public void adLimpeza(String nomeLimpeza, int quantLimpeza, double precoLimpeza){
        this.nome = nomeLimpeza;
        this.quant = quantLimpeza;
        this.preco = precoLimpeza;
    }
    public void infoLimpeza(){
        System.out.println("----------Info Produto de Limpeza----------");
        System.out.println("Nome da Produto: "+this.nome);
        System.out.println("Quantidade: "+this.quant);
        System.out.println("Preço: R$ "+this.preco);
    }
}
