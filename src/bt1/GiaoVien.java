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
public class GiaoVien extends CaNhan{
    
    private String monDay, toBoMon;
    
    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
    
    @Override
    public void HienThiTT() {
        super.HienThiTT();
        System.out.println("Mon giang day   : " + monDay);
        System.out.println("To bo mon       : " + toBoMon + "\n");
    }
}
