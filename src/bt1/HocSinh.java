/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author long
 */
public class HocSinh extends CaNhan{
    
    private String lop, nangKhieu;
    
    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public void HienThiTT() {
        super.HienThiTT();
        System.out.println("Lop             : " + lop);
        System.out.println("Nang khieu      : " + nangKhieu + "\n");
    }
}
