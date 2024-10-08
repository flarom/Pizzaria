package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Sabor {

    public int _id;
    private String _nome;
    private Double _multiplicador;

    public Sabor(String nome, Double multiplicador) {
        this._nome = nome;
        this._multiplicador = multiplicador;
    }

    public Sabor() {

    }

    public void Create() {
        String sql = "INSERT INTO sabores (nome, multiplicador) VALUES (?, ?)";

        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, this._nome);
            pstmt.setDouble(2, this._multiplicador);

            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String[][] Read() {
        String sql = "SELECT * FROM sabores";
        List<String[]> rows = new ArrayList<>();

        try (Connection conn = Database.getConnection(); PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

            int columnCount = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                String[] row = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getString(i);
                }
                rows.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String[][] result = new String[rows.size()][];
        result = rows.toArray(result);

        return result;
    }

    public String[] ReadFrom(int id) {
        String sql = "SELECT * FROM sabores WHERE id_sabor = ?";
        String[] result = null;

        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {

                if (rs.next()) {
                    int columnCount = rs.getMetaData().getColumnCount();
                    result = new String[columnCount];

                    for (int i = 1; i <= columnCount; i++) {
                        result[i - 1] = rs.getString(i);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void Update(int id) {
        String sql = "UPDATE sabores SET `nome` = ?, `multiplicador` = ? WHERE `id_sabor` = ?";

        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, this._nome);
            pstmt.setDouble(2, this._multiplicador);
            pstmt.setInt(3, id);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Remove(int id) {
        String sql = "DELETE FROM `sabores` WHERE `id_sabor` = ?";

        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void RemoveRange(int[] ids) {
        for (int id : ids) {
            String sql = "DELETE FROM `sabores` WHERE `id_sabor` = ?";

            try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, id);

                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public double getMultiplicador() {
        return this._multiplicador;
    }
}
