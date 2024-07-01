package main.webapp;

import com.google.gson.*;
import java.lang.reflect.Type;

public class SGItemDeserializer implements JsonDeserializer<SGItem> {
    @Override
    public SGItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        SGItem item = new SGItem();
        
        // Map the known fields with null checks
        item.setId(jsonObject.has("id") ? jsonObject.get("id").getAsString() : null);
        item.setName(jsonObject.has("name") ? jsonObject.get("name").getAsString() : null);
        item.setPrice(jsonObject.has("price") ? jsonObject.get("price").getAsString() : null);
        item.setDescription(jsonObject.has("description") ? jsonObject.get("description").getAsString() : null);
        item.setRecommendations(jsonObject.has("recommendations") ? jsonObject.get("recommendations").getAsString() : null);
        
        // Handle extra fields if necessary
        // For example, log them or store them in a map
        
        return item;
    }
}
