package Test;

import java.util.Scanner;

import thuctap_quanlyhocvien.DanhSachHV;
import thuctap_quanlyhocvien.HocVien;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DanhSachHV dshv = new DanhSachHV();
		int luaChon = 0;
		do {
			System.out.println("-------------------QUAN LY HOC VIEN--------------------");
			System.out.println("--------------Vui long lua chon chuc nang--------------");

			System.out.println("Nhap danh sach hoc vien");
			System.out.println("Xuat danh sach hoc vien");
			System.out.println("Tim kiem hoc vien theo khoang diem");
			System.out.println("Tim kiem hoc vien theo hoc luc");
			System.out.println("Tim kiem hoc vien theo ma so va cap nhat thong tin hoc vien");
			System.out.println("Sap xem hoc vien theo diem");
			System.out.println("Xuat 5 hoc viem co diem cao nhat");
			System.out.println("Tinh diem trung binh cua lop");
			System.out.println("Xuat danh sach hoc vien co diem tren diem trung binh cua lop");
			System.out.println("Tong hop so hoc vien theo hoc luc");
			System.out.println("-------------------------------------------------------");
			
			luaChon = sc.nextInt();
			 sc.nextLine();
			 
			
			if(luaChon==1) {
				
				System.out.println("Nhap ma HV: ");
				String maHV = sc.nextLine();
				System.out.println("Nhap ho va ten HV: ");
				String tenHV = sc.nextLine();
				System.out.println("Nhap email HV: "); 
				String emailHV = sc.nextLine();
				System.out.println("Nhap diem HV: "); 
				float diemHV = sc.nextFloat();
				
				// tinh hoc luc HV
				String hocLucHV;
				if(diemHV>=9) {
					hocLucHV = "Xuat Sac";
				}else if ((diemHV >=7.5) && (diemHV <9)){
					hocLucHV = "Gioi";
				}else if ((diemHV >=6.5) && (diemHV <7.5)){
					hocLucHV = "Kha";
				}else if ((diemHV >=5) && (diemHV <6.5)){
					hocLucHV = "Trung Binh";
				}else if ((diemHV >=3) && (diemHV <5)){
					hocLucHV = "Yeu";
				}else {
					hocLucHV = "Yeu";
				}
											
				HocVien hv = new HocVien(maHV, tenHV, diemHV, emailHV, hocLucHV);
				dshv.nhapHV(hv);

			}else if(luaChon==2) {
				//2. Xuat danh sach hv
				dshv.xuatDanhSachHV();
				
			}else if(luaChon==3) {
				
			}else if(luaChon==4) {
				System.out.println("Nhap hoclucHV: ");
				String hocLucHV = sc.nextLine();
				System.out.println("Ket qua tim kiem:");
				dshv.timHVTheohocLucHV(hocLucHV);
				
			}else if(luaChon==5) {
				// tim kiem hoc vien theo maHV
				System.out.println("Nhap ma HV: ");
				String maHV = sc.nextLine();
				System.out.println("Ket qua tim kiem:");
				dshv.timHVTheomaHV(maHV);
				
			}else if(luaChon==6) {
				// Sap xep HV theo diem tu cao toi thap
				dshv.xapSepHVTheoDiem();
				dshv.xuatDanhSachHV();
				

			}else if(luaChon==7) {
				
			}else if(luaChon==8) {
				
			}else if(luaChon==9) {
				
			}else if(luaChon==10) {
				
			}
						
		}while(luaChon!=0);

	}

	
}
