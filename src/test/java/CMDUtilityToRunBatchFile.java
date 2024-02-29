import java.io.IOException;

public class CMDUtilityToRunBatchFile {

	public static void main(String args[]) throws IOException {

		CMDUtilityToRunBatchFile testScript = new CMDUtilityToRunBatchFile();

		execDOSCmd();

	}

public static void execDOSCmd() throws IOException
{

	
	String batCommand = "cmd /c start C:\\Users\\vrajput\\Desktop\\abc.bat";
	 Runtime.getRuntime().exec(batCommand);
	 Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
}
}