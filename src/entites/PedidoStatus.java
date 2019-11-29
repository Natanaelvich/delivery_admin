
package entites;


public class PedidoStatus {
    
    private int id;
    private int usuario_id;
    private int produto_id;
    private String date;
    private int status;

    public PedidoStatus(int id, int usuario_id, int produto_id, String date, int status) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.produto_id = produto_id;
        this.date = date;
        this.status = status;
    }

    public PedidoStatus(int usuario_id, int produto_id, String date, int status) {
        this.usuario_id = usuario_id;
        this.produto_id = produto_id;
        this.date = date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PedidoStatus{" + "id=" + id + ", usuario_id=" + usuario_id + ", produto_id=" + produto_id + ", date=" + date + ", status=" + status + '}';
    }
    
    
    
    
    
}
