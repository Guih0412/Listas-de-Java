package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cliente;

public class ClienteDAO {

    private final Connection connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente) {
        String sql = "INSERT INTO cliente (cli_nome) VALUES(?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.execute();
        } catch (SQLException u) {
            throw new RuntimeException("Erro ao adicionar cliente", u);
        }
    }
}
