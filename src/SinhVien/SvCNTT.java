package SinhVien;

public class SvCNTT {
	private String MaSv;
	private String Hoten;
	private Double Dm1;
	private Double Dm2;
	
	public void HienThi(){
		System.out.println(MaSv+"|"+Hoten+"|"+Dm1+"|"+Dm2);
	}
	public SvCNTT(){
		
	}	
	public SvCNTT(String maSv, String hoten, Double dm1, Double dm2) {
		super();
		MaSv = maSv;
		Hoten = hoten;
		Dm1 = dm1;
		Dm2 = dm2;
	}
	public String getMaSv() {
		return MaSv;
	}
	public void setMaSv(String maSv) {
		MaSv = maSv;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
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
	public Double DTB() {
		return (Dm1 + Dm2) /2;
	}
}
