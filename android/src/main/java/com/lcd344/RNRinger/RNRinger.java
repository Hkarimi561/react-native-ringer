package com.lcd344.RNRinger;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import org.json.JSONObject;
import org.json.JSONException;


public class RNRinger extends ReactContextBaseJavaModule {

	private AudioManager mAudioManager;

	public RNRinger(ReactApplicationContext reactContext) {
		super(reactContext);
        Context context = reactContext.getApplicationContext();
        mAudioManager = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
	}


	@Override
	public String getName() {
		return "RNRinger";
	}

	@ReactMethod
	public void normal() {
        mAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
	}

	@ReactMethod
	public void vibrate() {
        mAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
	}

	@ReactMethod
	public void silent() {
        mAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
	}
}
