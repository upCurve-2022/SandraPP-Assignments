import java.io.FileOutputStream;
public class fileoutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream ft=new FileOutputStream("C:\\Users\\USER\\Desktop\\text.txt");
			ft.write(76);
			ft.close();
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}

}
