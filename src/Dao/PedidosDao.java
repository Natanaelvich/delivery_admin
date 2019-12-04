package Dao;

import entites.PedidoPendente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidosDao {

    //add dados da table de pedidos
    public static ArrayList<PedidoPendente> pegardadosPedidosPendente() {
        ArrayList<PedidoPendente> pedidoPendentes = new ArrayList<>();
        try {
            Connection conn = ConnectDao.getConnection();
            //int idUSER = UserDao.getUserID(TelaDeLogin.jTextField1User.getText(), TelaDeLogin.jTextField2Senha.getText());
            Statement statement = conn.createStatement();
            String queryPrinci = "SELECT u.id,u.nome,eu.rua,eu.bairro,"
                    + "eu.numero,u.telefone,pr.descricao,"
                    + "pr.preco,pr.id , pe.status,pe.id from pedido pe\n"
                    + "join usuario u\n"
                    + "on u.id = pe.id_usuario\n"
                    + "join endereco_user eu\n"
                    + "on eu.id_user = u.id\n"
                    + "join produto pr\n"
                    + "on pr.id = pe.id_produto\n"
                    + "join empresa em\n"
                    + "on em.id = pr.empresa_id\n"
                    + "where em.id = 1\n"
                    + "and pe.status = 'Pendente'\n"
                    + "order by pe.created_at;";

            String querySecundaria = "select u.nome,u.email,u.telefone,"
                    + "pe.id,pr.descricao,pe.created_at,em.nome,pe.status "
                    + " from pedido pe\n"
                    + "join produto pr\n"
                    + "on pr.id = pe.id_produto\n"
                    + "join empresa em\n"
                    + "on em.id = pr.empresa_id\n"
                    + "join usuario u\n"
                    + "on pe.id_usuario = u.id\n"
                    + "where pr.empresa_id = 1;";

            ResultSet res = statement.executeQuery(queryPrinci);
            //////////////////////////////// 
            while (res.next()) {
                String endereco = "rua : " + res.getString("eu.rua") + "\n bairro : " + res.getString("bairro")
                        + "\n numero:" + res.getString("numero");

                pedidoPendentes.add(new PedidoPendente(res.getString("u.nome"),
                        res.getString("pe.status"), endereco, res.getString("u.telefone"),
                        res.getString("pr.descricao"), res.getDouble("pr.preco"), res.getInt("pe.id")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedidoPendentes;

    }
    
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
        ArrayList<PedidoPendente> pedidoPendentes = pegardadosPedidosPendente();

        pedidoPendentes.forEach((p) -> {
            System.out.println(p);
        });
    }
}
