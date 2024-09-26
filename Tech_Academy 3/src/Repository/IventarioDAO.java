package Repository;
import Model.Item;
import Model.Save;

import java.sql.*;

public class IventarioDAO {


    
    public void adicionarAoInventario(Save save, Item item) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "insert into inventario (id_item,id_save) values (?,?);";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, item.getIdItem());
            stmt.setInt(2, save.getIdSave());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("a vocé não pegou");
        }
    }
    public void VerInventario(Save save, Item item) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "SELECT i.nome, i.descricao FROM inventario_jogador ij ";
            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, save.getIdSave());
                ResultSet rs = stmt.executeQuery();
                System.out.println("Itens no inventário:");
                while (rs.next()) {
                    System.out.println("- " + rs.getString("nome") + ": " + rs.getString("descricao"));
                }
            } catch (SQLException e) {
                System.out.println("Erro ao listar inventário: " + e.getMessage());
            }
        }
    }

