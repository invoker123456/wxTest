package com.invoker.message.req;

/**
 * Created by invoker on 2019-07-18
 * Description: 请求消息之视频消息 </br>
 */
public class VideoMessage extends BaseMessage {
    // 媒体ID
    private String MediaId;
    // 语音格式
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
