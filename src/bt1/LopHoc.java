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
    //private ArrayList<CaNhan> dsHocSinh = new ArrayList<>();
    //private ArrayList<CaNhan> dsGVGD = new ArrayList<>();
    
    public void themHocSinh(HocSinh hs) {
        //dsHocSinh.add(hs);
        dsHocSinh.them(hs);
    }
    
    public void themGVGD(GiaoVien gv) {
        //dsGVGD.add(gv);
        dsGV.them(gv);
    }
    
    public void inDSHS() {
        /*for (CaNhan x : dsHocSinh) {
            x.HienThiTT();
        }*/
        dsHocSinh.inDS();
    }
    
    public void inDSGVGD() {
        /*for (CaNhan x : dsGVGD) {
            x.HienThiTT();
        }*/
        dsGV.inDS();
    }

}
