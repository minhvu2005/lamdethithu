package com.example.lamdethithu;


public class Bai1 {
    public int KiemThuTinhTong(int... numbers) {
        if (numbers.length == 0){
         throw new IllegalArgumentException("Mang Khoong Duoc ");
        }
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}

