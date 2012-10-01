package at.univie.seattlesensors;

import android.app.Application;
import android.util.Log;

public class SeattleSensorsApplication extends Application {
	public void onCreate() {
		Log.d("SettleSensors", "application starting, binding service");
		SensorServiceSingleton.getInstance().bindService(this);
//		bindService();
	}
	
	public void onDestroy(){
		Log.d("SeattleSensors", "application exiting, unbinding service");
		SensorServiceSingleton.getInstance().unbindService(this);
	}
}
