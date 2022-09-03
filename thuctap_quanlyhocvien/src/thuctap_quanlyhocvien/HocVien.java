package thuctap_quanlyhocvien;

public class HocVien {
	private String maHV;
	private String tenHV ;
	private float diemHV;
	private String emailHV;
	private String hocLucHV;

	public HocVien(String maHV, String tenHV, float diemHV, String emailHV,String hocLucHV) {
		this.maHV = maHV;
		this.tenHV = tenHV;
		this.diemHV = diemHV;
		this.emailHV = emailHV;
		this.hocLucHV = hocLucHV;
	}
	

	public String getMaHV() {
		return maHV;
	}
	public void setMaHV(String maHV) {
		this.maHV = maHV;
	}
	public String getTenHV() {
		return tenHV;
	}
	public void setTenHV(String tenHV) {
		this.tenHV = tenHV;
	}
	public float getDiemHV() {
		return diemHV;
	}
	public void setDiemHV(float diemHV) {
		this.diemHV = diemHV;
	}
	public String getEmailHV() {
		return emailHV;
	}
	public void setEmailHV(String emailHV) {
		this.emailHV = emailHV;
	}
	public String getHocLucHV() {
		return hocLucHV;
	}
	public void setHocLucHV(String hocLucHV) {
		this.hocLucHV = hocLucHV;
	}
	
	
	@Override
	public String toString() {
		return "HocVien [maHV=" + maHV + ", tenHV=" + tenHV + ", diemHV=" + diemHV + ", emailHV=" + emailHV
				+ ", hocLucHV=" + hocLucHV + "]";
	}

	
	

}
