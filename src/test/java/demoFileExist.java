import java.io.File;

public class demoFileExist {

	public static void main(String[] args) {
		
		
		File file = new File("C:\\Users\\vrajput\\Desktop\\MavenDependency\\MavenDependency\\TestAutomation\\TestAutomation\\Downloads\\");
		String[] myFiles;    
		if (file.isDirectory()) {
		    myFiles = file.list();
		    for (int i = 0; i < myFiles.length; i++) {
		        File myFile = new File(file, myFiles[i]); 
		        myFile.delete();
		    }
		}

	}

}
