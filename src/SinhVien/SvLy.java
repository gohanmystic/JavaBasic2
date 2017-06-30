package SinhVien;

public class SvLy {
	private String MaSv;
	private String HoTen;
	private Double Dm1;
	private Double Dm2;
	private Double Dm3;
	private Double Dm4;
	public void HienThi(){
		System.out.println(MaSv+"|"+HoTen+"|"+Dm1+"|"+Dm2+"|"+Dm3+"|"+Dm4);
	}
	public SvLy(){
		
	}
	public SvLy(String maSv, String hoTen, Double dm1, Double dm2, Double dm3, Double dm4) {
		super();
		MaSv = maSv;
		HoTen = hoTen;
		Dm1 = dm1;
		Dm2 = dm2;
		Dm3 = dm3;
		Dm4 = dm4;
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
	public Double getDm4() {
		return Dm4;
	}
	public void setDm4(Double dm4) {
		Dm4 = dm4;
	}
	public Double DTB(){
		return (Dm1+Dm2+Dm3+Dm4)/4;
	}
}
