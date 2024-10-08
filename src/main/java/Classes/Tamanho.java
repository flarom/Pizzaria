package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tamanho {
    public int _id;
    private String _nome;
    private double _preco;
    
    public Tamanho(String nome, double preco){
        this._nome = nome;
        this._preco = preco;
    }
    public Tamanho(){
        
    }
    
    public void Create(){
        String sql = "INSERT INTO tamanhos (nome, preco) VALUES (?, ?)";
        
        try (Connection conn = Database.getConnection(); 
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, this._nome);
            pstmt.setDouble(2, this._preco);
            
            pstmt.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String[][] Read() {
        String sql = "SELECT * FROM tamanhos";
        List<String[]> rows = new ArrayList<>();
        
        try (Connection conn = Database.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery()) {
            
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
        String sql = "SELECT * FROM tamanhos WHERE id_tamanho = ?";
        String[] result = null;
        
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
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
    
    public void Update(int id){
        String sql = "UPDATE tamanhos SET `nome` = ?, `preco` = ? WHERE `id_tamanho` = ?";
        
        try (Connection conn = Database.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            
            pstmt.setString(1, this._nome);
            pstmt.setDouble(2, this._preco);
            pstmt.setInt(3, id);
            
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public double getPreco(){
        return this._preco;
    }
    
        public void Remove(int id) {
        String sql = "DELETE FROM `tamanhos` WHERE `id_tamanho` = ?";

        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void RemoveRange(int[] ids) {
        for (int id : ids) {
            String sql = "DELETE FROM `tamanhos` WHERE `id_tamanho` = ?";

            try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, id);

                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
