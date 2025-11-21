/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoo;

import connection.ConnectionFactory;
import user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl extends UserDAO {

    public void createUser(User user) {
        String sql = "INSERT INTO usuarios (nome, email, telefone, cpf, nascimento, pais, estado, cidade, cep, rua, bairro, numero, complemento) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getTelefone());
            stmt.setString(4, user.getCpf());
            stmt.setString(5, user.getNascimento());
            stmt.setString(6, user.getPais());
            stmt.setString(7, user.getEstado());
            stmt.setString(8, user.getCidade());
            stmt.setString(9, user.getCep());
            stmt.setString(10, user.getRua());
            stmt.setString(11, user.getBairro());
            stmt.setString(12, user.getNumero());
            stmt.setString(13, user.getComplemento());

            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao criar usuário: " + e.getMessage());
        }
    }

    public List<User> getAllUsers() {
        List<User> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                User user = new User(
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
                user.setId(rs.getInt("id"));

                lista.add(user);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar usuários: " + e.getMessage());
        }

        return lista;
    }

    public User getUser(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                User user = new User(
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
                user.setId(rs.getInt("id"));
                return user;
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar usuário: " + e.getMessage());
        }

        return null;
    }

    public void updateUser(User user) {
        String sql = "UPDATE usuarios SET nome=?, email=?, telefone=?, cpf=?, nascimento=?, pais=?, estado=?, cidade=?, cep=?, rua=?, bairro=?, numero=?, complemento=? "
                   + "WHERE id=?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getTelefone());
            stmt.setString(4, user.getCpf());
            stmt.setString(5, user.getNascimento());
            stmt.setString(6, user.getPais());
            stmt.setString(7, user.getEstado());
            stmt.setString(8, user.getCidade());
            stmt.setString(9, user.getCep());
            stmt.setString(10, user.getRua());
            stmt.setString(11, user.getBairro());
            stmt.setString(12, user.getNumero());
            stmt.setString(13, user.getComplemento());
            stmt.setInt(14, user.getId());

            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM usuarios WHERE id=?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Erro ao deletar usuário: " + e.getMessage());
        }
    }
}

