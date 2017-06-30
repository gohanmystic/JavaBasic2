package SinhVien;

public class SvToan {
	private	String MaSv;
	private String HoTen;
	private Double Dm1;
	private Double Dm2;
	private Double Dm3;
	public void HienThi(){
		System.out.println(MaSv+"|"+HoTen+"|"+Dm1+"|"+Dm2+"|"+Dm3);
	}
	SvToan(){
		
	}
	SvToan(String masv, String hoten, double dm1, double dm2, double dm3){
		this.MaSv = masv;
		this.HoTen = hoten;
		this.Dm1 = dm1;
		this.Dm2 = dm2;
		this.Dm3 = dm3;
	}
	public String getMaSv() {
		return MaSv;
	}
	public void setMaSv(String maSv) {
		MaSv = maSv;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public Double getDm1() {
		return Dm1;
	}
	public void setDm1(Double dm1) {
		Dm1 = dm1;
	}
	public Double getDm2() {
		return Dm2;
	}
	public void setDm2(Double dm2) {
		Dm2 = dm2;
	}
	public Double getDm3() {
		return Dm3;
	}
	public void setDm3(Double dm3) {
		Dm3 = dm3;
	}
	public Double DTB(){
		return (Dm1+Dm2+Dm3)/3;
	}
}
