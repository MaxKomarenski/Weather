import org.json.simple.JSONObject;

class JsonCreator {

    public JSONObject makeJson(String country) {
        String APPID = "5496614f4ca95e6dcc0445c1e7f3916d";

        JSONObject obj = new JSONObject();
        obj.put("q", country);
        obj.put("APPID", APPID);

        return obj;

    }

}