package phamthanhhuong.com.model;

public class NhanVienThoiVu extends NhanVien {
	public NhanVienThoiVu()
	{
		super();
	}
	public NhanVienThoiVu(int ma, String ten)
	{
		super(ma,ten);
	}
	public void tinhLuong()
	{
		super.tinhLuong();
		System.out.println("=> Đây là Nhân Viên thời vụ");
	}
}
