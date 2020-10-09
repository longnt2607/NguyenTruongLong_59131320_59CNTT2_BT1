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

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    
    public String HienThiTT() {
//        System.out.println("----- Thong tin ca nhan -----");
//        System.out.println("Ho va ten       : " + hoTen);
//        System.out.println("Tuoi            : " + tuoi);
//        System.out.println("Dia chi         : " + diaChi);
//        System.out.println("So dien thoai   : " + sdt);
        StringBuilder builder = new StringBuilder();
        builder.append("Ho va ten: ").append(this.getHoTen()).append("\n")
                .append("Tuoi: ").append(this.getTuoi()).append("\n")
                .append("Dia chi: ").append(this.getDiaChi()).append("\n")
                .append("SDT: ").append(this.getSdt()).append("\n");
        
        return builder.toString();
    }
}
