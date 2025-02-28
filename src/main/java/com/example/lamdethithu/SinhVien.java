package com.example.lamdethithu;

public class SinhVien {
    private String maSV;
    private String ten;
    private Integer tuoi;
    private Float diemTrungBinh;
    private Integer kyHoc;
    private String ChuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, Integer tuoi, Float diemTrungBinh, Integer kyHoc, String chuyenNganh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTrungBinh = diemTrungBinh;
        this.kyHoc = kyHoc;
        ChuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Integer getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(Integer kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        ChuyenNganh = chuyenNganh;
    }
}
