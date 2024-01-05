package view;

import model.NhanVien;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = NhanVien.getInstance("NV001", "Nguyen Van A");
        System.out.println(nv1);
        NhanVien nv2 = NhanVien.getInstance("NV002", "Nguyen Van B");
        System.out.println(nv2);
    }
}