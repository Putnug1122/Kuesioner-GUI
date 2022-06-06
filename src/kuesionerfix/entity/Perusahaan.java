package kuesionerfix.entity;

public class Perusahaan {
  private String kodeProvinsi;
  private String kodeKabupaten;
  private String kodeKecamatan;
  private String kodeKJU;
  private int kodeUrut;
  private String namaPerusahaan;
  private String alamatPerusahaan;
  private String noTelp;
  private String noFax;
  private String bentukBadanHukum;
  private String visited;
  private String status;
  private String tanamanPangan;
  private String hortikultura;
  private String perkebunan;
  private String peternakan;
  private String kehutanan;
  private String perikanan;
  private String jenisUsahaUtama;

  public Perusahaan() {

  }

  public Perusahaan(String kodeProvinsi, String kodeKabupaten, String kodeKecamatan, String kodeKJU, int kodeUrut,
      String namaPerusahaan, String alamatPerusahaan, String noTelp, String noFax, String bentukBadanHukum,
      String visited, String status, String tanamanPangan, String hortikultura, String perkebunan, String peternakan,
      String kehutanan, String perikanan, String jenisUsahaUtama) {
    this.kodeProvinsi = kodeProvinsi;
    this.kodeKabupaten = kodeKabupaten;
    this.kodeKecamatan = kodeKecamatan;
    this.kodeKJU = kodeKJU;
    this.kodeUrut = kodeUrut;
    this.namaPerusahaan = namaPerusahaan;
    this.alamatPerusahaan = alamatPerusahaan;
    this.noTelp = noTelp;
    this.noFax = noFax;
    this.bentukBadanHukum = bentukBadanHukum;
    this.visited = visited;
    this.status = status;
    this.tanamanPangan = tanamanPangan;
    this.hortikultura = hortikultura;
    this.perkebunan = perkebunan;
    this.peternakan = peternakan;
    this.kehutanan = kehutanan;
    this.perikanan = perikanan;
    this.jenisUsahaUtama = jenisUsahaUtama;
  }

  public String getKodeProvinsi() {
    return this.kodeProvinsi;
  }

  public void setKodeProvinsi(String kodeProvinsi) {
    this.kodeProvinsi = kodeProvinsi;
  }

  public String getKodeKabupaten() {
    return this.kodeKabupaten;
  }

  public void setKodeKabupaten(String kodeKabupaten) {
    this.kodeKabupaten = kodeKabupaten;
  }

  public String getKodeKecamatan() {
    return this.kodeKecamatan;
  }

  public void setKodeKecamatan(String kodeKecamatan) {
    this.kodeKecamatan = kodeKecamatan;
  }

  public String getKodeKJU() {
    return this.kodeKJU;
  }

  public void setKodeKJU(String kodeKJU) {
    this.kodeKJU = kodeKJU;
  }

  public int getKodeUrut() {
    return this.kodeUrut;
  }

  public void setKodeUrut(int kodeUrut) {
    this.kodeUrut = kodeUrut;
  }

  public String getNamaPerusahaan() {
    return this.namaPerusahaan;
  }

  public void setNamaPerusahaan(String namaPerusahaan) {
    this.namaPerusahaan = namaPerusahaan;
  }

  public String getAlamatPerusahaan() {
    return this.alamatPerusahaan;
  }

  public void setAlamatPerusahaan(String alamatPerusahaan) {
    this.alamatPerusahaan = alamatPerusahaan;
  }

  public String getNoTelp() {
    return this.noTelp;
  }

  public void setNoTelp(String noTelp) {
    this.noTelp = noTelp;
  }

  public String getNoFax() {
    return this.noFax;
  }

  public void setNoFax(String noFax) {
    this.noFax = noFax;
  }

  public String getBentukBadanHukum() {
    return this.bentukBadanHukum;
  }

  public void setBentukBadanHukum(String bentukBadanHukum) {
    this.bentukBadanHukum = bentukBadanHukum;
  }

  public String getVisited() {
    return this.visited;
  }

  public void setVisited(String visited) {
    this.visited = visited;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTanamanPangan() {
    return this.tanamanPangan;
  }

  public void setTanamanPangan(String tanamanPangan) {
    this.tanamanPangan = tanamanPangan;
  }

  public String getHortikultura() {
    return this.hortikultura;
  }

  public void setHortikultura(String hortikultura) {
    this.hortikultura = hortikultura;
  }

  public String getPerkebunan() {
    return this.perkebunan;
  }

  public void setPerkebunan(String perkebunan) {
    this.perkebunan = perkebunan;
  }

  public String getPeternakan() {
    return this.peternakan;
  }

  public void setPeternakan(String peternakan) {
    this.peternakan = peternakan;
  }

  public String getKehutanan() {
    return this.kehutanan;
  }

  public void setKehutanan(String kehutanan) {
    this.kehutanan = kehutanan;
  }

  public String getPerikanan() {
    return this.perikanan;
  }

  public void setPerikanan(String perikanan) {
    this.perikanan = perikanan;
  }

  public String getJenisUsahaUtama() {
    return this.jenisUsahaUtama;
  }

  public void setJenisUsahaUtama(String jenisUsahaUtama) {
    this.jenisUsahaUtama = jenisUsahaUtama;
  }

}
