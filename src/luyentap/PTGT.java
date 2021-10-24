
package luyentap;

public class PTGT {
//    số khung xe (Bắt đầu là AB sau đó 2 số kết thúc C), 
//    hãng, ngày lăn bánh (tháng và năm: 10/2021), giá bán
    private String sokhung;
    private String hang,ngaylanbanh;
    private double gia; 
    
    public PTGT() {
    }
    public PTGT(String sokhung, String hang, String ngaylanbanh, double gia) {
        this.sokhung = sokhung;
        this.hang = hang;
        this.ngaylanbanh = ngaylanbanh;
        this.gia = gia;
    }

    public String getSokhung() {
        return sokhung;
    }

    public void setSokhung(String sokhung) {
        this.sokhung = sokhung;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNgaylanbanh() {
        return ngaylanbanh;
    }

    public void setNgaylanbanh(String ngaylanbanh) {
        this.ngaylanbanh = ngaylanbanh;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
    

    
    
    
}
