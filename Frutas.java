public class Frutas {
    public String nome;
    public int quant;
    public double preco;

    public void adFruta(String nomeFruta, int quantFruta, double precoFruta){
        this.nome = nomeFruta;
        this.quant = quantFruta;
        this.preco = precoFruta;
    }
    public void infoFruta(){
        System.out.println("----------Info Fruta----------");
        System.out.println("Nome da fruta: "+this.nome);
        System.out.println("Quantidade: "+this.quant);
        System.out.println("Preço: R$ "+this.preco);
    }
}
