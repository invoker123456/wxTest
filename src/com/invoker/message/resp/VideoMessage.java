package com.invoker.message.resp;

/**
 * Created by invoker on 2019-07-18
 * Description: 回复的视频消息 </br>
 */
public class VideoMessage extends BaseMessage {
    // 视频
    private Video Video;

    public Video getVideo() {
        return Video;
    }

    public void setVideo(Video video) {
        Video = video;
    }
}
