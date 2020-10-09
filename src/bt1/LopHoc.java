/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1; // HAM MAIN O DAY

import java.util.ArrayList;

/**
 *
 * @author long
 */
public class LopHoc {
    
    QuanLyDanhSach dsHocSinh = new QuanLyDanhSach();
    QuanLyDanhSach dsGV = new QuanLyDanhSach();
    
    public void themHocSinh(HocSinh hs) {
        dsHocSinh.them(hs);
    }
    
    public void themGVGD(GiaoVien gv) {
        dsGV.them(gv);
    }
    
    public void inDSHS() {
        dsHocSinh.inDS();
    }
    
    public void inDSGVGD() {
        dsGV.inDS();
    }

}
