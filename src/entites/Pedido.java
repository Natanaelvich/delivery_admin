package entites;

public class Pedido {
    
    private String nome,status,endereco,telefone,pedido;
    private double preco;
    private int id;

    public Pedido(String nome, String status, String endereco, String telefone, String pedido, double preco, int id) {
        this.nome = nome;
        this.status = status;
        this.endereco = endereco;
        this.telefone = telefone;
        this.pedido = pedido;
        this.preco = preco;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PedidoPendente{" + "nome=" + nome + ", status=" + status + ", endereco=" + endereco + ", telefone=" + telefone + ", pedido=" + pedido + ", preco=" + preco + ", id=" + id + '}';
    }

    
    
    
}
