package com.invoker.message.resp;

/**
 * Created by invoker on 2019-07-18
 * Description: 回复的语音消息</br>
 */
public class VoiceMessage extends BaseMessage {
    // 语音
    private Voice Voice;

    public Voice getVoice() {
        return Voice;
    }

    public void setVoice(Voice voice) {
        Voice = voice;
    }
}
