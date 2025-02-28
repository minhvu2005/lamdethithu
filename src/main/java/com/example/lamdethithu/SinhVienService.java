package com.example.lamdethithu;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> sinhvien = new ArrayList<SinhVien>();

    public SinhVienService() {
        sinhvien.add(new SinhVien("SV01", "Nguyen Minh Vu", 20, 8.5f, 1, "IT"));
        sinhvien.add(new SinhVien("SV02", "Nguyen Van Hung", 12, 8.6f, 2, "WEB"));
    }

    public String updateSinhVien(String maSV, String tenMoi) {
        if (maSV.isEmpty() || tenMoi.isEmpty()) {
            return "Sinh Vien is Empty";
        }
        for (SinhVien sv : sinhvien) {
            if (sv.getMaSV().equals(maSV)) {
                sv.setTen(tenMoi);
                return "Sinh Vien is Updated";
            }

        }
        return "Sinh Vien is Not Updated";
    }

}
