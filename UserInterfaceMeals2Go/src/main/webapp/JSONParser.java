package main.webapp;
/* The Summer Garden Supply us their Menu updates as a JSON  file which they can export in a fixed format from their internal company software
 * Our job is to parse the JSON File and format it for output on our Delivery Web page.
 * Other customers of ours may supply similar menu details in XML or CSV format and may display slightly different options - dependent on their business/menu items.
 * Think of us as a JustEat type of delivery service. We will call ourselves "Meals2Go"
 * We will need to implement an Adapter Pattern to interpret all these different formats that the restaurants supply their menus in.
 * But first let's deal with the JSON  file supplied by The Summer Garden
 */
import com.google.gson.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class JSONParser {  
    ArrayList<SGItem> items = new ArrayList<>();   

    public void parse() {
        // Create a GsonBuilder instance
        GsonBuilder gsonBuilder = new GsonBuilder();
        
        // Register the custom deserializer
        gsonBuilder.registerTypeAdapter(SGItem.class, new SGItemDeserializer());
        
        // Create the Gson instance from the GsonBuilder
        Gson gson = gsonBuilder.create();
        
        String fileName = "/home/watso/eclipse_Workspace_JEEE/UserInterfaceMeals2Go/src/SummerGardenMenuItems.json";
        
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            SGItem[] items = gson.fromJson(content, SGItem[].class);
            
            for (SGItem item : items) {
                this.items.add(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SGItem> getMenu() {
        return items;
    }
}