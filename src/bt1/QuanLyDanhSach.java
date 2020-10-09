/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author long
 */
public class QuanLyDanhSach implements IQuanLyDanhSach{
    
    ArrayList<CaNhan> list = new ArrayList<>();

    @Override
    public void them(CaNhan p) {
        list.add(p);
    }

    @Override
    public void xoa(String ten) {
        for (CaNhan x : list) {
            if (x.getHoTen() == ten) {
                list.remove(ten);
            }
        }
    }

    @Override
    public void inDS() {
        for (CaNhan x : list) {
            x.HienThiTT();
        }
    }
}
