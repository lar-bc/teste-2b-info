package daoo;

import connection.ConnectionFactory;
import user.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    public User buscarPorEmail(String email) {
        String sql = "SELECT * FROM usuarios WHERE email = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("telefone"),
                    rs.getString("cpf"),
                    rs.getString("nascimento"),
                    rs.getString("pais"),
                    rs.getString("estado"),
                    rs.getString("cidade"),
                    rs.getString("cep"),
                    rs.getString("rua"),
                    rs.getString("bairro"),
                    rs.getString("numero"),
                    rs.getString("complemento")
                );
            }
        } catch (Exception e) {
            System.out.println("Erro SELECT: " + e.getMessage());
        }

        return null;
    }
}
