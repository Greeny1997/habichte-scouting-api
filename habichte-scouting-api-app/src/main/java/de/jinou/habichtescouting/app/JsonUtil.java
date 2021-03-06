/**
 * Habicht Scouting
 * Api fuer Habicht Scouting.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: admin@jinou.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.jinou.habichtescouting.app;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import de.jinou.habichtescouting.app.model.Scout;
import de.jinou.habichtescouting.app.model.Spieler;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Scout".equalsIgnoreCase(className)) {
      return new TypeToken<List<Scout>>(){}.getType();
    }
    
    if ("Spieler".equalsIgnoreCase(className)) {
      return new TypeToken<List<Spieler>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Scout".equalsIgnoreCase(className)) {
      return new TypeToken<Scout>(){}.getType();
    }
    
    if ("Spieler".equalsIgnoreCase(className)) {
      return new TypeToken<Spieler>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
