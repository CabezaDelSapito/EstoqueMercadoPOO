public class Carnes {
    public String nome;
    public int quant;
    public double preco;

    public void adCarne(String nomeCarnes, int quantCarnes, double precoCarnes){
        this.nome = nomeCarnes;
        this.quant = quantCarnes;
        this.preco = precoCarnes;
    }
    public void infoCarne(){
        System.out.println("----------Info Carne----------");
        System.out.println("Nome da Carne: "+this.nome);
        System.out.println("Quantidade: "+this.quant);
        System.out.println("Preço: R$ "+this.preco);
    }
}
