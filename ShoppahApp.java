public class ShoppahApp {

    public static void main(String[] args) {

        Produto produto1 = new ProdutoAdapter(1, "Produto 1", "Descrição do produto 1", 156.88, 156);
        Produto produto2 = new ProdutoAdapter(2, "Produto 2", "Descrição do produto 2", 495.78, 495);

    
     
        Usuario user1 = new Usuario(1, "User 1", "user1@email.com");

        Compra compra1 = new Compra(1, user1);
        compra1.adicionarProdutoCompra(produto1);
        compra1.adicionarProdutoCompra(produto2);

        System.out.println(compra1.toString());
    }
}
