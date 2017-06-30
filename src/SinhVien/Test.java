package SinhVien;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	// Tao arraylist chua sinh vien
	public ArrayList<Object> ds = new ArrayList<>();

	public void TaoLop() {

		try {
			// Doc file
			FileInputStream FIS = new FileInputStream("sv.txt");
			InputStreamReader ISR = new InputStreamReader(FIS);
			BufferedReader BRsv = new BufferedReader(ISR);
			// Ghi file f1.txt
			FileOutputStream FOS1 = new FileOutputStream("f1.txt");
			OutputStreamWriter OSW1 = new OutputStreamWriter(FOS1);
			PrintWriter PWf1 = new PrintWriter(OSW1);
			// Ghi file f2.txt
			FileOutputStream FOS2 = new FileOutputStream("f2.txt");
			OutputStreamWriter OSW2 = new OutputStreamWriter(FOS2);
			PrintWriter PWf2 = new PrintWriter(OSW2);
			// Ghi file f3.txt
			FileOutputStream FOS3 = new FileOutputStream("f3.txt");
			OutputStreamWriter OSW3 = new OutputStreamWriter(FOS3);
			PrintWriter PWf3 = new PrintWriter(OSW3);
			while (true) {
				// doc tung dong , kiem tra du lieu
				String st = BRsv.readLine();
				if (st == "" || st == null || st.isEmpty())
					break;
				// tach tong tin
				String[] dssv = st.split("[;]");
				if (dssv.length == 4) {
					// tao ra lop SvCNTT
					SvCNTT sv = new SvCNTT(dssv[0], dssv[1], Double.parseDouble(dssv[2]), Double.parseDouble(dssv[3]));
					// ghi file f1.txt
					PWf1.println(st);
					// them sv vao ds
					ds.add(sv);
				}else if (dssv.length == 5) {
					// tao ra lop SvToan
					SvToan sv = new SvToan(dssv[0], dssv[1], Double.parseDouble(dssv[2]), Double.parseDouble(dssv[3]), Double.parseDouble(dssv[4]));
					// ghi file f2.txt
					PWf2.println(st);
					// them sv vao ds
					ds.add(sv);
				}else if (dssv.length == 6) {
					// tao ra lop SvLy
					SvLy sv = new SvLy(dssv[0], dssv[1], Double.parseDouble(dssv[2]), Double.parseDouble(dssv[3]), Double.parseDouble(dssv[4]), Double.parseDouble(dssv[5]));
					// ghi file f3.txt
					PWf3.println(st);
					// them sv vao ds
					ds.add(sv);
				}
			}
			BRsv.close();
			PWf1.close();
			PWf2.close();
			PWf3.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// xuat du lieu
		for (Object sv : ds) {
			if (sv instanceof SvCNTT){
				System.out.println(((SvCNTT) sv).getMaSv()+";"+((SvCNTT) sv).getHoten()+((SvCNTT) sv).DTB());
			}else if( sv instanceof SvToan) {
				System.out.println(((SvToan) sv).getMaSv()+";"+((SvToan) sv).getHoTen()+((SvToan) sv).DTB());
			}else if (sv instanceof SvLy) {
				System.out.println(((SvLy) sv).getMaSv()+";"+((SvLy) sv).getHoTen()+((SvLy) sv).DTB());
			}
		}
	}
	
	public void HienThiCNTT (ArrayList<Object> ds) {
		for (Object sv : ds) {
			if (sv instanceof SvCNTT) {
				SvCNTT sv1 = (SvCNTT) sv;
				sv1.HienThi();
			}
		}
	}
	public void HienThiToan (ArrayList<Object> ds) {
		for (Object sv : ds) {
			if (sv instanceof SvToan) {
				SvToan sv1 = (SvToan) sv;
				sv1.HienThi();
			}
		}
	}
	public void HienThiLy (ArrayList<Object> ds) {
		for (Object sv : ds) {
			if (sv instanceof SvLy) {
				SvLy sv1 = (SvLy) sv;
				sv1.HienThi();
			}
		}
	}
	public ArrayList<Object> DsLenLop () {
		ArrayList<Object> ll = new ArrayList<Object>();
		for (Object sv : ds) {
			if (sv instanceof SvCNTT) {
				SvCNTT sv1 = (SvCNTT) sv;
				if (sv1.DTB() >=5) {
					ll.add(sv1);
				}
			}else if (sv instanceof SvToan) {
				SvToan sv2 = (SvToan) sv;
				if (sv2.DTB() >= 5) {
					ll.add(sv2);
				}
			}else if (sv instanceof SvLy) {
				SvLy sv3 = (SvLy) sv;
				if (sv3.DTB() >= 5) {
					ll.add(sv3);
				}
			}
		}
		return ll;
	}
	/*public void HienThiSvDau() {
		for (SvCNTT sv : ds) {
			if (sv.DTB() >= 5) {
				System.out.println(sv.getMaSv() + ";" + sv.getHoten() + ";" + sv.DTB());
			}
		}
	}
	
	public void XuatDTB(String hoten) {
		for(SvCNTT sv : ds) {
			if (sv.getHoten().toLowerCase().trim().contains(hoten.toLowerCase().trim())) {
				System.out.println(sv.getMaSv() + ";" + sv.getHoten() + ";" + sv.DTB());
			}
		}
	}
	
	public ArrayList<SvCNTT> SvRot(){
		ArrayList<SvCNTT> dsRot = new ArrayList<>();
		
		for (SvCNTT sv : ds) {
			if(sv.DTB() < 5) {
				dsRot.add(sv);
			}
		}
		
		return dsRot;
	}
	*/
	public static void main(String[] args) {
		Test test = new Test();
		test.TaoLop();
		System.out.println("Danh sach len lop:");
		System.out.println("Sv CNTT: ");
		test.HienThiCNTT(test.DsLenLop());
		System.out.println("Sv Toan: ");
		test.HienThiToan(test.DsLenLop());
		System.out.println("Sv Ly: ");
		test.HienThiLy(test.DsLenLop());
		/*System.out.println("----------------------------------------------\nSv dau:");
		test.HienThiSvDau();
		Scanner scn = new Scanner(System.in);
		String st = scn.nextLine();*/
		/*ArrayList<SvCNTT> dsRot = test.SvRot();
		System.out.println("Danh sach Sv rot: ");
		for(SvCNTT sv : dsRot) {
			System.out.println(sv.getMaSv() + ";" + sv.getHoten() + ";" + sv.DTB());
		}*/
	}
}
