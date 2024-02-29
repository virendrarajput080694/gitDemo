import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;


public class writeJsonFileDemo {

    public static void main(String[] args) throws JSONException, IOException 
    {
        ObjectMapper mapper = new ObjectMapper();
        String key = "key1"; //whatever

        JSONObject jo = new JSONObject("{shipmentId:\"EDI1020304050\", customerId:\"Cust_1357\"}");
        //Read from file
        JSONObject root = mapper.readValue(new File("C:\\Users\\vrajput\\Desktop\\MavenDependency\\MavenDependency\\TestAutomation\\TestAutomation\\Downloads\\EDI_load_Tender.postman_collection.json"), JSONObject.class);

        String val_newer = jo.getString(key);
        String val_older = root.getString(key);

        //Compare values
        if(!val_newer.equals(val_older))
        {
          //Update value in object
           root.put(key,val_newer);

           //Write into the file
            try (FileWriter file = new FileWriter("C:\\Users\\vrajput\\Desktop\\MavenDependency\\MavenDependency\\TestAutomation\\TestAutomation\\Downloads\\EDI_load_Tender.postman_collection.json")) 
            {
                file.write(root.toString());
                System.out.println("Successfully updated json object to file...!!");
            }
        }
    }
}