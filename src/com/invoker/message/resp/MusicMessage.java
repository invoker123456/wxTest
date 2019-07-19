package com.invoker.message.resp;

/**
 * Created by invoker on 2019-07-18
 * Description: 回复的音乐消息 </br>
 */
public class MusicMessage extends BaseMessage {
    // 音乐
    private Music Music;

    public Music getMusic() {
        return Music;
    }

    public void setMusic(Music music) {
        Music = music;
    }
}
