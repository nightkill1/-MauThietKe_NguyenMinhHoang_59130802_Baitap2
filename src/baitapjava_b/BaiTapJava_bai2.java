/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_b;

/**
 *
 * @author beron
 */
public class BaiTapJava_bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv = new NhanVien();
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        NhanVien nv3 = new NhanVien();
        NhanVien nv4 = new NhanVien();
            
        IQuanLy NV1 = new NhanVien();
        IQuanLy NV2 = new NhanVien();
        IQuanLy NV3 = new NhanVien();
        IQuanLy NV4 = new NhanVien();
        IQuanLy NV5 = new NhanVien();
        NV1.Them(nv);
        NV2.Them(nv1);
        NV3.Them(nv2);
        NV4.Them(nv3);
        NV5.Them(nv4);
        System.out.println("-----------Nhan Vien 1--------");
        NV1.inDS(nv);
        System.out.println("-----------Nhan Vien 2--------");
        NV2.inDS(nv1);
        System.out.println("-----------Nhan Vien 3--------");
        NV3.inDS(nv2);
        System.out.println("-----------Nhan Vien 4--------");
        NV4.inDS(nv3);
        System.out.println("-----------Nhan Vien 5--------");
        NV5.inDS(nv4);
        
    }
    
}
