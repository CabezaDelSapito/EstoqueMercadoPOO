public class App {
    public static void main(String[] args) throws Exception {
        ProdutosDeLimpeza limpeza1 = new ProdutosDeLimpeza();
        ProdutosDeLimpeza limpeza2 = new ProdutosDeLimpeza();
        ProdutosDeLimpeza limpeza3 = new ProdutosDeLimpeza();
        ProdutosDeLimpeza limpeza4 = new ProdutosDeLimpeza();
        ProdutosDeLimpeza limpeza5 = new ProdutosDeLimpeza();
        Carnes carne1 = new Carnes();
        Carnes carne2 = new Carnes();
        Carnes carne3 = new Carnes();
        Carnes carne4 = new Carnes();
        Carnes carne5 = new Carnes();
        Frutas fruta1 = new Frutas();
        Frutas fruta2 = new Frutas();
        Frutas fruta3 = new Frutas();
        Frutas fruta4 = new Frutas();
        Frutas fruta5 = new Frutas();
        Biscoitos biscoito1 = new Biscoitos();
        Biscoitos biscoito2 = new Biscoitos();
        Biscoitos biscoito3 = new Biscoitos();
        Biscoitos biscoito4 = new Biscoitos();
        Biscoitos biscoito5 = new Biscoitos();
        Enlatados enlatado1 = new Enlatados();
        Enlatados enlatado2 = new Enlatados();
        Enlatados enlatado3 = new Enlatados();
        Enlatados enlatado4 = new Enlatados();
        Enlatados enlatado5 = new Enlatados();
        
        //adicionando um produto com nome, quantidade e preço.
        limpeza1.adLimpeza("Detergente", 8, 13.00);
        limpeza2.adLimpeza("Desengordurante", 5, 15.00);
        limpeza3.adLimpeza("Sabão em Barra", 15, 7.00);
        limpeza4.adLimpeza("Sabão em Pó", 10, 18.00);
        limpeza5.adLimpeza("Amaciante", 5, 20.00);

        carne1.adCarne("Maminha", 5, 30.00);
        carne2.adCarne("Picanha", 7, 60.00);
        carne3.adCarne("Contrafilé", 6, 40.00);
        carne4.adCarne("Lagarto", 8, 20.00);
        carne5.adCarne("Filé mignon", 4, 80.00);

        fruta1.adFruta("Banana", 15, 3.00);
        fruta2.adFruta("Manga", 10, 9.00);
        fruta3.adFruta("Laranja", 20, 4.00);
        fruta4.adFruta("Maçã", 20, 5.00);
        fruta5.adFruta("Goiaba", 13, 7.00);

        biscoito1.adBiscoito("Recheado", 8, 2.00);
        biscoito2.adBiscoito("Cream Cracker", 6, 4.00);
        biscoito3.adBiscoito("Goiabinha", 5, 3.00);
        biscoito4.adBiscoito("Waffle", 5, 3.00);
        biscoito5.adBiscoito("Cookie", 8, 4.00);

        enlatado1.adEnlatado("Sardinha", 6, 6.00);
        enlatado2.adEnlatado("Carne em Conserva", 6, 8.00);
        enlatado3.adEnlatado("Feijão enlatado", 4, 10.00);
        enlatado4.adEnlatado("Salsicha", 8, 5.00);
        enlatado5.adEnlatado("Milho", 10, 4.00);

        limpeza1.infoLimpeza();
        carne1.infoCarne();
        fruta1.infoFruta();
        biscoito1.infoBiscoito();
        enlatado1.infoEnlatado();
    }
}
