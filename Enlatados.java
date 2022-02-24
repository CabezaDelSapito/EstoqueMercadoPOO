public class Enlatados {
    public String nome;
    public int quant;
    public double preco;

    public void adEnlatado(String nomeEnlatado, int quantEnlatado, double precoEnlatado){
        this.nome = nomeEnlatado;
        this.quant = quantEnlatado;
        this.preco = precoEnlatado;
    }
    public void infoEnlatado(){
        System.out.println("----------Info Enlatado----------");
        System.out.println("Nome da fruta: "+this.nome);
        System.out.println("Quantidade: "+this.quant);
        System.out.println("Preço: R$ "+this.preco);
    }
}
