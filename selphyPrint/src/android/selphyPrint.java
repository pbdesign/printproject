package selphyPrint;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import go.Selphy.Selphy;

/**
 * This class echoes a string called from JavaScript.
 */
public class selphyPrint extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if (action.equals("print")) {

cordova.getThreadPool().execute(new Runnable() {
    public void run() {
            String message = Selphy.Greetings("merandy.jpeg");
            callbackContext.success(message);

    			}


	});
	return true;
        }
        return false;
    }
}
