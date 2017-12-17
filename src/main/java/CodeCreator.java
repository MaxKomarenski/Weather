import org.json.simple.JSONObject;

import java.util.ArrayList;

public class CodeCreator {
    public StringBuilder makeCode(JSONObject data){
        StringBuilder code = new StringBuilder();
        ArrayList<String> listOfKeys = new ArrayList<String>(data.keySet());
        for (String listOfKey : listOfKeys) {
            code.append(listOfKey).append("=").append(data.get(listOfKey)).append("&");
        }
        return code.deleteCharAt(code.length() - 1);
    }
}