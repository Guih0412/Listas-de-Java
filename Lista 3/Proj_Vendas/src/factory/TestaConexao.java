package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Conexão aberta com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
