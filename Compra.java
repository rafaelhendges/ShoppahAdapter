import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class Compra {

    private int id;
    private Usuario comprador;
    private List<Produto> produtosComprados;
    private Date dataCompra;

    public Compra(int id, Usuario comprador) {
        this.id = id;
        this.comprador = comprador;
        this.produtosComprados = new ArrayList<>();
        this.dataCompra = new Date();
    }

    public void adicionarProdutoCompra(Produto produto) {
        produtosComprados.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtosComprados) {
            total += produto.getPreco() * produto.getQtde(); 
        }
        return total;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String retorno = "ID Compra: " + this.id + 
                "Data: " + sdf.format(this.dataCompra) + 
                "Comprador: " + this.comprador.getNome() ;

        
        retorno += "Lista de Produtos Comprados pelo Usuario: " + this.comprador.getNome() ;

        for (Produto produto : produtosComprados) {
            retorno += produto.toString() + "\n"; 
        }

        retorno += "Valor Total da Compra: R$ " + String.format("%.2f", this.calcularTotal()) + "\n";

        return retorno;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(List<Produto> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
}
