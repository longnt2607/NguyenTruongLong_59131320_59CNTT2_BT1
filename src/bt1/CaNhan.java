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
public abstract class CaNhan {
    
    private String hoTen, diaChi, sdt;
    private int tuoi;
    
    public CaNhan() {
        
    }
    
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public void HienThiTT() {
        System.out.println("----- Thong tin ca nhan -----");
        System.out.println("Ho va ten       : " + hoTen);
        System.out.println("Tuoi            : " + tuoi);
        System.out.println("Dia chi         : " + diaChi);
        System.out.println("So dien thoai   : " + sdt);
    }
}
