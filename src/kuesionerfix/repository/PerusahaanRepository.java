package kuesionerfix.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import kuesionerfix.entity.Perusahaan;

public class PerusahaanRepository {
  private Connection connection;

  public PerusahaanRepository(Connection connection) {
    this.connection = connection;
  }

  public void save(Perusahaan perusahaan) {
    String sql = "INSERT INTO perusahaan (kode_prov, kode_kab, kode_kec, kode_kju, no_urut, nama_perusahaan, alamat_perusahaan, no_phone, no_faksimili, bentuk_badan_hukum, visited, status, tanaman_pangan, hortikultura, perkebunan, peternakan, kehutanan, perikanan, jenis_usaha_utama) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try {
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1, perusahaan.getKodeProvinsi());
      statement.setString(2, perusahaan.getKodeKabupaten());
      statement.setString(3, perusahaan.getKodeKecamatan());
      statement.setString(4, perusahaan.getKodeKJU());
      statement.setInt(5, perusahaan.getKodeUrut());
      statement.setString(6, perusahaan.getNamaPerusahaan());
      statement.setString(7, perusahaan.getAlamatPerusahaan());
      statement.setString(8, perusahaan.getNoTelp());
      statement.setString(9, perusahaan.getNoFax());
      statement.setString(10, perusahaan.getBentukBadanHukum());
      statement.setString(11, perusahaan.getVisited());
      statement.setString(12, perusahaan.getStatus());
      statement.setString(13, perusahaan.getTanamanPangan());
      statement.setString(14, perusahaan.getHortikultura());
      statement.setString(15, perusahaan.getPerkebunan());
      statement.setString(16, perusahaan.getPeternakan());
      statement.setString(17, perusahaan.getKehutanan());
      statement.setString(18, perusahaan.getPerikanan());
      statement.setString(19, perusahaan.getJenisUsahaUtama());
      statement.executeUpdate();
      JOptionPane.showMessageDialog(null, "Data Perusahaan Berhasil Ditambahkan!");
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
  }

  public void update(Perusahaan perusahaan) {
    String sql = "UPDATE perusahaan SET kode_prov = ?, kode_kab = ?, kode_kec = ?, kode_kju = ?, no_urut = ?, nama_perusahaan = ?, alamat_perusahaan = ?, no_phone = ?, no_faksimili = ?, bentuk_badan_hukum = ?, visited = ?, status = ?, tanaman_pangan = ?, hortikultura = ?, perkebunan = ?, peternakan = ?, kehutanan = ?, perikanan = ?, jenis_usaha_utama = ? WHERE id = ?";
    try {
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1, perusahaan.getKodeProvinsi());
      statement.setString(2, perusahaan.getKodeKabupaten());
      statement.setString(3, perusahaan.getKodeKecamatan());
      statement.setString(4, perusahaan.getKodeKJU());
      statement.setInt(5, perusahaan.getKodeUrut());
      statement.setString(6, perusahaan.getNamaPerusahaan());
      statement.setString(7, perusahaan.getAlamatPerusahaan());
      statement.setString(8, perusahaan.getNoTelp());
      statement.setString(9, perusahaan.getNoFax());
      statement.setString(10, perusahaan.getBentukBadanHukum());
      statement.setString(11, perusahaan.getVisited());
      statement.setString(12, perusahaan.getStatus());
      statement.setString(13, perusahaan.getTanamanPangan());
      statement.setString(14, perusahaan.getHortikultura());
      statement.setString(15, perusahaan.getPerkebunan());
      statement.setString(16, perusahaan.getPeternakan());
      statement.setString(17, perusahaan.getKehutanan());
      statement.setString(18, perusahaan.getPerikanan());
      statement.setString(19, perusahaan.getJenisUsahaUtama());
      statement.setInt(20, perusahaan.getId());
      statement.executeUpdate();
      JOptionPane.showMessageDialog(null, "Data Perusahaan Berhasil Diubah!");
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
  }

  public void delete(int idPerusahaan) {
    String sql = "DELETE FROM perusahaan WHERE id = ?";
    try {
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setInt(1, idPerusahaan);
      statement.executeUpdate();
      JOptionPane.showMessageDialog(null, "Data Perusahaan Berhasil Dihapus!");
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
  }
}
