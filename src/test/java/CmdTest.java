import java.io.*;
import java.util.List;

public class CmdTest {
    public static void main(String[] args) throws Exception {

				@SuppressWarnings("unchecked")
				ProcessBuilder builder = new ProcessBuilder((List<String>) Runtime.getRuntime().exec("cmd.exe /c start", null, new File("C:\\Users\\vrajput\\Desktop\\MavenDependency\\MavenDependency\\TestAutomation\\TestAutomation\\Downloads")));
    	        builder.redirectErrorStream(true);
    	        Process p = builder.start();
    	        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	        String line;
    	        while (true) {
    	            line = r.readLine();
    	            if (line == null) { break; }
    	            System.out.println(line);
    	        }
    	    }
}