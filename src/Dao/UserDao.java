package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.TelaDeLogin;

public class UserDao {
    
    
    public static boolean getUserAndSenha(String user,String senha){
        Connection conn = ConnectDao.getConnection();
        String sql = "SELECT * FROM admin WHERE  nome = '" + user + "' AND senha = '" + senha + "'";
        ResultSet res;
        boolean resultado = false;
        try {
            Statement statement = conn.createStatement();
            res = statement.executeQuery(sql);
            resultado = res.next();
            //fechando conexoes
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement);
            ConnectDao.closeConnectionPrepare(res);

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
        //buscando id do usuario
    public static int getEmpresaUserID() {
       Connection conn = ConnectDao.getConnection();

        String sql = "SELECT * FROM admin WHERE  nome = '" + TelaDeLogin.jTextField1User.getText() + 
                "' AND senha = '" + TelaDeLogin.jTextField2Senha.getText() + "'";
        ResultSet res;
        Statement statement;
        int id = 0;
        try {
            statement = conn.createStatement();
            res = statement.executeQuery(sql);
            if (res.next()) {
                id = res.getInt("empresa_id");
            }
            //fechando conexoes
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement);
            ConnectDao.closeConnectionPrepare(res);

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
