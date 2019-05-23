import java.io.IOException;
import java.io.PrintWriter;

public class BatchDemo {

	public static void main(String[] args) throws IOException {
		
		
		PrintWriter out=new PrintWriter("testing.bat");
		
		
		out.println("@color 02");
		out.println("@title test window");
		out.println("@echo testing!");
		out.println("@pause");
		out.println("@echo Press enter to close window..");
		out.println("@pause");
		out.println("@exit");
		out.close();
		Runtime rt= Runtime.getRuntime();
		rt.exec("cmd /c start " + "testing.bat");
	}

}
