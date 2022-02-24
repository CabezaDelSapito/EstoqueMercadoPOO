public class Biscoitos {
    public String nome;
    public int quant;
    public double preco;

    public void adBiscoito(String nomeBiscoito, int quantBiscoito, double precoBiscoito){
        this.nome = nomeBiscoito;
        this.quant = quantBiscoito;
        this.preco = precoBiscoito;
    }
    public void infoBiscoito(){
        System.out.println("----------Info Biscoito----------");
        System.out.println("Nome da Biscoito: "+this.nome);
        System.out.println("Quantidade: "+this.quant);
        System.out.println("Preço: R$ "+this.preco);
    }
}
