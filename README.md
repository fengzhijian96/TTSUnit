# TTSUnit

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.kimfengzj:TTSUnit:Tag'
	}
  
  
  TTSUtil ttsUtil = new TTSUtil(getApplicationContext());
  
  ttsUtil.setTextTOSpeech("你好啊");
