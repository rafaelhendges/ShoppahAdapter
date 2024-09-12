import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private List<Produto> favoritos;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        setEmail(email); //Validar
        this.favoritos = new ArrayList<>();
    }

    public void adicionarFavorito(Produto produto) {
        if (!favoritos.contains(produto)) {
            favoritos.add(produto);
        } else {
            System.out.println("Produto já está na lista de favoritos.");
        }
    }

    public void removerFavorito(Produto produto) {
        if (favoritos.contains(produto)) {
            favoritos.remove(produto);
        } else {
            System.out.println("Produto não encontrado na lista de favoritos.");
        }
    }

    public void listarFavoritos() {
        System.out.println();
        System.out.println("Lista de Produtos Favoritos do Usuario: " + this.nome);
        System.out.println();

        if (favoritos.isEmpty()) {
            System.out.println("Nenhum produto favorito adicionado.");
        } else {
            for (Produto produto : favoritos) {
                System.out.println(produto);
            }
        }
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\n" +
               "Nome: " + this.nome + "\n" +
               "Email: " + this.email + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            this.email = email;
        } else {
            System.out.println("Erro: Email inválido.");
        }
    }

    public List<Produto> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Produto> favoritos) {
        this.favoritos = favoritos;
    }
}
