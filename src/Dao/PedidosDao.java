package Dao;

import entites.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidosDao {

    //pegando pedidos pendentes
    public static ArrayList<Pedido> pegardadosPedidosPendente() {
        ArrayList<Pedido> pedidoPendentes = new ArrayList<>();
        try {
            Connection conn = ConnectDao.getConnection();
            Statement statement = conn.createStatement();
            String queryPrinci = "SELECT u.id,u.nome,eu.rua,eu.bairro,"
                    + "eu.numero,u.telefone,pr.descricao,"
                    + "pr.preco,pr.id , pe.status,pe.id,em.nome from pedido pe\n"
                    + "join usuario u\n"
                    + "on u.id = pe.id_usuario\n"
                    + "join endereco_user eu\n"
                    + "on eu.id_user = u.id\n"
                    + "join produto pr\n"
                    + "on pr.id = pe.id_produto\n"
                    + "join empresa em\n"
                    + "on em.id = pr.empresa_id\n"
                    + "where em.id = "+UserDao.getEmpresaUserID()
                    + " and pe.status = 'Pendente'\n"
                    + "order by pe.created_at;";

            ResultSet res = statement.executeQuery(queryPrinci);
            //////////////////////////////// 
            while (res.next()) {
                String endereco = "rua : " + res.getString("eu.rua") + "\n bairro : " + res.getString("bairro")
                        + "\n numero:" + res.getString("numero");

                pedidoPendentes.add(new Pedido(res.getString("u.nome"),
                        res.getString("pe.status"), endereco, res.getString("u.telefone"),
                        res.getString("pr.descricao"),res.getString("em.nome"), res.getDouble("pr.preco"), 
                        res.getInt("pe.id")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedidoPendentes;

    }
    
    public static ArrayList<Pedido> pegardadosPedidosEviandos() {
        ArrayList<Pedido> pedidoPendentes = new ArrayList<>();
        try {
            Connection conn = ConnectDao.getConnection();
            Statement statement = conn.createStatement();
            String queryPrinci = "SELECT u.id,u.nome,eu.rua,eu.bairro,"
                    + "eu.numero,u.telefone,pr.descricao,"
                    + "pr.preco,pr.id , pe.status,pe.id,em.nome from pedido pe\n"
                    + "join usuario u\n"
                    + "on u.id = pe.id_usuario\n"
                    + "join endereco_user eu\n"
                    + "on eu.id_user = u.id\n"
                    + "join produto pr\n"
                    + "on pr.id = pe.id_produto\n"
                    + "join empresa em\n"
                    + "on em.id = pr.empresa_id\n"
                    + "where em.id = "+UserDao.getEmpresaUserID()
                    + " and pe.status = 'Enviado'\n"
                    + "order by pe.created_at;";

            ResultSet res = statement.executeQuery(queryPrinci);
            //////////////////////////////// 
            while (res.next()) {
                String endereco = "rua : " + res.getString("eu.rua") + "\n bairro : " + res.getString("bairro")
                        + "\n numero:" + res.getString("numero");

                pedidoPendentes.add(new Pedido(res.getString("u.nome"),
                        res.getString("pe.status"), endereco, res.getString("u.telefone"),
                        res.getString("pr.descricao"),res.getString("em.nome"), res.getDouble("pr.preco"), 
                        res.getInt("pe.id")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedidoPendentes;

    }
    //atualizar estado de pedido para enviado
    public static void atualizarstatusPedidoPendente(int id){
        Connection conn = ConnectDao.getConnection();
        String sql = "UPDATE pedido SET  status = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "Enviado");
            preparedStatement.setInt(2, id);
            preparedStatement.execute();

            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionPrepare(preparedStatement);
        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        ArrayList<Pedido> pedidoPendentes = pegardadosPedidosPendente();

        pedidoPendentes.forEach((p) -> {
            System.out.println(p);
        });
    }
    
    
}
