package kuesionerfix.repository;

import java.sql.Connection;

public class PerusahaanRepository {
  private Connection connection;

  public PerusahaanRepository(Connection connection) {
    this.connection = connection;
  }

}
