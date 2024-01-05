package model;

public class NhanVien {
    private String maNV;
    private String hoTen;


    private static NhanVien instance;

    public NhanVien(String maNV, String hoTen) {
        this.maNV = maNV;
        this.hoTen = hoTen;
    }

    public static NhanVien getInstance(String maNV, String hoTen) {
        if (instance == null) {
            synchronized (NhanVien.class) {
                if (instance == null) {
                    instance = new NhanVien(maNV, hoTen);
                }
                return instance;
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
