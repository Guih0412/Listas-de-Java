package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vendas",
                "root",
                "guih0412"
            );
        } catch (SQLException excecao) {
            throw new RuntimeException("Erro ao conectar ao banco: ", excecao);
        }
    }
}
