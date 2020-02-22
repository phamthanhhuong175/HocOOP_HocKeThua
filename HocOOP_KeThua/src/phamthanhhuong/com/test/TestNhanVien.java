package phamthanhhuong.com.test;

import phamthanhhuong.com.model.NhanVienChinhThuc;
import phamthanhhuong.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1,"Nguyễn Văn Tèo");
		NhanVienThoiVu ty=new NhanVienThoiVu(2,"Nguyễn Thị Tý");
		teo.tinhLuong();
		ty.tinhLuong();
	}

}
