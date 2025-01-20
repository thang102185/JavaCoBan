package ontap;

public class Cau1Lan3 {
	public static boolean isValidPassword(String s) {
		if (s.length() < 6 || s.length() > 12) {
			return false;
		}
		
		boolean thuong = false;
		boolean hoa = false;
		boolean so = false;
		
		for (char c : s.toCharArray()) {
			if (Character.isLowerCase(c)) {
				thuong = true;
			}
			else if (Character.isUpperCase(c)) {
				hoa = true;
			}
			else if (Character.isDigit(c)) {
				so = true;
			}
		}
		
		return thuong && hoa && so;
	}
	public static void main(String[] args) {
		// copy đoãn mã sau vào main() của lớp Test
		String pass = "hello1";
		if (isValidPassword(pass))
			System.out.printf("'%s' là mật khẩu hợp lệ.", pass);
		else
			System.out.printf("'%s' là mật khẩu không hợp lệ.", pass);
	}

}
