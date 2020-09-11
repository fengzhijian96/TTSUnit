package cn.longest.ttslibrary;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by: "kimfengzj"
 * Date:
 * 说明：
 */
public class TTSUtil implements TextToSpeech.OnInitListener{
    private String TAG = "TTSUtil";

    private Context mContext;
    private TextToSpeech tts;

    public TTSUtil(final Context context) {
        this.mContext = context;
        Intent checkIntent = new Intent();
        checkIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);

        tts = new TextToSpeech(context, this);
    }

    public void setTextTOSpeech(String str) {
        Log.i(TAG, "setTextTOSpeech");
        if ( !tts.isSpeaking())
            tts.speak(str, TextToSpeech.QUEUE_ADD, null);
    }

    public void closeTTS(){
        if (tts!=null) {
            tts.shutdown();//关闭TTS
        }
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            Log.i(TAG, "Text-To-Speech engine is initialized");
        } else if (status == TextToSpeech.ERROR) {
            Log.i(TAG, "Error occurred while initializing Text-To-Speech engine");
        }
    }
}
