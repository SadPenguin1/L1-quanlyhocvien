package thuctap_quanlyhocvien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachHV {
	private ArrayList<HocVien> danhSachHV;

	public DanhSachHV() {
		this.danhSachHV = new ArrayList<HocVien>();
	}

	public DanhSachHV(ArrayList<HocVien> danhSachHV) {
		this.danhSachHV = danhSachHV;
	}

	// 1. Nhap hoc vien
	public void nhapHV(HocVien hv) {
		this.danhSachHV.add(hv);
	}

	// 2. Xuat danh sach hoc vien
	public void xuatDanhSachHV() {
		for (HocVien hocVien : danhSachHV) {
			System.out.println(hocVien);
		}
	}
	// 4.tim kiem hoc vien theo hocluc
	public void timHVTheohocLucHV(String hocLucHV) {
		for(HocVien hocVien : danhSachHV) {
			if(hocVien.getHocLucHV().indexOf(hocLucHV)>=0) {
				System.out.println(hocVien);
			}
		}
	}
     // 5.Tim hoc vien theo maHV
	public void timHVTheomaHV(String maHV) {
			for (HocVien hocVien : danhSachHV) {
				if(hocVien.getMaHV().indexOf(maHV)>=0) {
					System.out.println(hocVien);
				}							
				
			}						
	}
	
	//6.Sap xep hoc vien tu cao toi thap
	public void xapSepHVTheoDiem() {
		Collections.sort(this.danhSachHV, new Comparator<HocVien>() {

			@Override
			public int compare(HocVien o1, HocVien o2) {
				if(o1.getDiemHV()<o2.getDiemHV()) {
					return 1;
				}else if (o1.getDiemHV()>o2.getDiemHV()){
					return -1;
				}else {
					return 0;
				}
			}
			
		});
	}
	//7 lay ra so luong hoc vien la 5 nguoi gioi nhat
	public int laySoLuong5HV() {
		return this.danhSachHV.size();
		
	}
}
