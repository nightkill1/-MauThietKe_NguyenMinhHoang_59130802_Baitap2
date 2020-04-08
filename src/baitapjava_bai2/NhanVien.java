/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava_bai2;

import java.util.Scanner;

/**
 *
 * @author beron
 */
public class NhanVien implements IQuanLy{
    
    public String Ten;
    public  int Tuoi;
    public  String DiaChi;
    public  Float Luong;
    public  Integer TongSoGio;
    
    public String getTen()
    {
        return Ten;
    }
    public void setTen(String Ten)
    {
        this.Ten = Ten;
    }
    public Integer getTuoi()
    {
        return Tuoi;
    }
    public void setTuoi(int Tuoi)
    {
        this.Tuoi = Tuoi;
    }
    
    public String getDiaChi()
    {
        return DiaChi;
    }
    public void setDiaChi(String DiaChi)
    {
        this.DiaChi = DiaChi;
    }
    public Float getLuong()
    {
        return  Luong;
    }
    public void setLuong(float Luong)
    {
        this.Luong = Luong;
    }
    public Integer getTongSoGio()
    {
        return TongSoGio;
    }
    public void setTongSoGio(Integer TongSoGio)
    {
        this.TongSoGio  = TongSoGio;
    }
    
    public void getThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten");
         Ten = sc.nextLine();
         System.out.println("Nhap Tuoi");
         Tuoi = sc.nextInt();
         sc.nextLine();
         System.out.println("Nhap DiaChi");
         DiaChi = sc.nextLine();
         System.out.println("Nhap Luong");
         Luong = sc.nextFloat();
         System.out.println("Nhap T ongSo Gio Lam");
         TongSoGio = sc.nextInt();
         
    }
    public float tinhThuong()
    {
        float luongthuong;
        if(this.TongSoGio >= 200)
        {
            luongthuong =  this.Luong*20/100;
        }else if(this.TongSoGio <200 && this.TongSoGio>=100)
        {
             luongthuong = this.Luong*10/100;
        }else
        {
            luongthuong = this.Luong;
        }
        return luongthuong;
    }
    @Override
    public void Them(NhanVien nv) {
        nv.getThongTin();
    }

    @Override
    public void inDS(NhanVien nv) {
         System.out.println("ten \t\t:" + nv.Ten);
        System.out.println("Tuoi \t\t:" + nv.Tuoi);
        System.out.println("Dia chi \t:" + nv.DiaChi);
        System.out.println("Luong \t\t:" + nv.Luong);
        System.out.println("Tong so gio lam :" + nv.TongSoGio);
        System.out.println("Tien thuong cho vien :"+ nv.tinhThuong());
    }

  
    
}
