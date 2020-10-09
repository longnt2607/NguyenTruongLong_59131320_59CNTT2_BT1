/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import BT1.GiaoVien;
import BT1.HocSinh;
import BT1.LopHoc;

/**
 *
 * @author long
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
         
        HocSinh hs1 = new HocSinh("Nguyen Van A", 21, "Ninh Hoa, Khanh Hoa", "0123456789", "59CNTT2", "Nhay mua");
        HocSinh hs2 = new HocSinh("Nguyen Ngoc B", 21, "Ninh Hoa, Khanh Hoa", "0123456789", "59CNTT2", "Nhay mua");
        HocSinh hs3 = new HocSinh("Tran Ngoc C", 21, "Ninh Hoa, Khanh Hoa", "0123456789", "59CNTT2", "Nhay mua");

        GiaoVien gv1 = new GiaoVien("Nguyen Van D", 45, "Vinh Dien Trung, Nha Trang", "0369753156", "Co so du lieu", "Toan");
        GiaoVien gv2 = new GiaoVien("Bui Thi E", 45, "Vinh Dien Trung, Nha Trang", "0369753156", "Phan tich thiet ke he thong thong tin", "Cong nghe phan mem");

        lopHoc.themHocSinh(hs1);
        lopHoc.themHocSinh(hs2);
        lopHoc.themHocSinh(hs3);

        lopHoc.themGVGD(gv1);
        lopHoc.themGVGD(gv2);  

        System.out.println("========== Danh sach hoc sinh ==========");
        lopHoc.inDSHS();
        System.out.println("========== Danh sach giao vien ==========");
        lopHoc.inDSGVGD();

//        lopHoc.xoaHS("Tran Ngoc C");
//        lopHoc.xoaGV("Bui Thi E");
//        
//        System.out.println("========== Danh sach hoc sinh ==========");
//        lopHoc.inDSHS();
//        System.out.println("========== Danh sach giao vien ==========");
//        lopHoc.inDSGVGD();
    }
    
}
