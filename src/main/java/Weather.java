
import org.json.simple.JSONObject;


public class Weather {
    public static void main(String[] args) throws Exception {
        JsonCreator jsonCreator = new JsonCreator();
        CodeCreator codeCreator = new CodeCreator();


        String url = "http://api.openweathermap.org/data/2.5/weather";

        JSONObject data = jsonCreator.makeJson("Lviv");
        String code = codeCreator.makeCode(data).toString();

        String req = url + "?" + code;

        org.json.JSONObject json = URLReader.readJsonFromUrl(req);

        System.out.print("description: ");
        System.out.println(json.getJSONArray("weather").getJSONObject(0).get("description"));
        System.out.print("temperature in Kelvin: ");
        System.out.println(json.getJSONObject("main").getInt("temp"));
        System.out.print("temperature in Celsius: ");
        System.out.println(json.getJSONObject("main").getInt("temp") - 273.15);

    }

}
