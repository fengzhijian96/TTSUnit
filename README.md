
```java
allprojects {
    	repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```


```java
dependencies {
            implementation 'com.github.kimfengzj:TTSUnit:Tag'
	}
```


```java
TTSUtil ttsUtil = new TTSUtil(context);//初始化
  
ttsUtil.setTextTOSpeech("你好啊");//调用函数，传递语音播报字符串

ttsUtil.closeTTS();//页面销毁时调用，防止内存泄漏
```
