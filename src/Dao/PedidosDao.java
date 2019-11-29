package Dao;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidosDao {

    //add dados da table de pedidos
    public static void pegardadosPedidosPendente() {
        try {
            Connection conn = ConnectDao.getConnection();
            //int idUSER = UserDao.getUserID(TelaDeLogin.jTextField1User.getText(), TelaDeLogin.jTextField2Senha.getText());
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("select u.nome,u.email,u.telefone,"
                    + "pe.id,pr.descricao,pe.created_at,em.nome,pe.status "
                    + " from pedido pe\n"
                    + "join produto pr\n"
                    + "on pr.id = pe.id_produto\n"
                    + "join empresa em\n"
                    + "on em.id = pr.empresa_id\n"
                    + "join usuario u\n"
                    + "on pe.id_usuario = u.id\n"
                    + "where pr.empresa_id = 1;");
            ////////////////////////////////
            while (res.next()) {
                System.out.println(res.getString("u.nome")+" "+res.getString("em.nome"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void main(String[] args) {
        pegardadosPedidosPendente();
    }
}
