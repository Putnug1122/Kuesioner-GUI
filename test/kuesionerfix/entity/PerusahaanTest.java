/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package kuesionerfix.entity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class PerusahaanTest {
    Perusahaan perusahaan = new Perusahaan();

    public PerusahaanTest() {
    }

    @Test
    public void testGetId() {
        perusahaan.setId(1);
        assertEquals(perusahaan.getId(), 1);
    }

    @Test
    public void testGetKodeProvinsi() {
        perusahaan.setKodeProvinsi("Jawa Barat");
        assertEquals(perusahaan.getKodeProvinsi(), "Jawa Barat");
    }

    @Test
    public void testGetKodeKabupaten() {
        perusahaan.setKodeKabupaten("Bandung");
        assertEquals(perusahaan.getKodeKabupaten(), "Bandung");
    }

    @Test
    public void testGetKodeKecamatan() {
        perusahaan.setKodeKecamatan("Cimahi");
        assertEquals(perusahaan.getKodeKecamatan(), "Cimahi");
    }

    @Test
    public void testGetKodeKJU() {
        perusahaan.setKodeKJU("KJU-01");
        assertEquals(perusahaan.getKodeKJU(), "KJU-01");
    }

    @Test
    public void testGetKodeUrut() {
        perusahaan.setKodeUrut(1);
        assertEquals(perusahaan.getKodeUrut(), 1);
    }

    @Test
    public void testGetNamaPerusahaan() {
        perusahaan.setNamaPerusahaan("PT. Perusahaan");
        assertEquals(perusahaan.getNamaPerusahaan(), "PT. Perusahaan");
    }

    @Test
    public void testGetAlamatPerusahaan() {
        perusahaan.setAlamatPerusahaan("Jl. Perusahaan");
        assertEquals(perusahaan.getAlamatPerusahaan(), "Jl. Perusahaan");
    }

    @Test
    public void testGetNoTelp() {
        perusahaan.setNoTelp("1234567890");
        assertEquals(perusahaan.getNoTelp(), "1234567890");
    }

    @Test
    public void testGetNoFax() {
        perusahaan.setNoFax("1234567890");
        assertEquals(perusahaan.getNoFax(), "1234567890");
    }

    @Test
    public void testGetBentukBadanHukum() {
        perusahaan.setBentukBadanHukum("PT");
        assertEquals(perusahaan.getBentukBadanHukum(), "PT");
    }

    @Test
    public void testGetVisited() {
        perusahaan.setVisited("Ya");
        assertEquals(perusahaan.getVisited(), "Ya");
    }

    @Test
    public void testGetStatus() {
        perusahaan.setStatus("Aktif");
        assertEquals(perusahaan.getStatus(), "Aktif");
    }

    @Test
    public void testGetTanamanPangan() {
        perusahaan.setTanamanPangan("Ada");
        assertEquals(perusahaan.getTanamanPangan(), "Ada");
    }

    @Test
    public void testGetHortikultura() {
        perusahaan.setHortikultura("Ada");
        assertEquals(perusahaan.getHortikultura(), "Ada");
    }

    @Test
    public void testGetPerkebunan() {
        perusahaan.setPerkebunan("Ada");
        assertEquals(perusahaan.getPerkebunan(), "Ada");
    }

    @Test
    public void testGetPeternakan() {
        perusahaan.setPeternakan("Ada");
        assertEquals(perusahaan.getPeternakan(), "Ada");
    }

    @Test
    public void testGetKehutanan() {
        perusahaan.setKehutanan("Ada");
        assertEquals(perusahaan.getKehutanan(), "Ada");
    }

    @Test
    public void testGetPerikanan() {
        perusahaan.setPerikanan("Ada");
        assertEquals(perusahaan.getPerikanan(), "Ada");
    }

    @Test
    public void testGetJenisUsahaUtama() {
        perusahaan.setJenisUsahaUtama("Padi/Palawija");
        assertEquals(perusahaan.getJenisUsahaUtama(), "Padi/Palawija");
    }

}
