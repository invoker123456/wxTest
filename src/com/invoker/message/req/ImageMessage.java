package com.invoker.message.req;

/**
 * Created by invoker on 2019-07-18
 * Description: 请求消息之图片消息 </br>
 */
public class ImageMessage extends BaseMessage {
    // 图片链接
    private String PicUrl;
    private String MediaId;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
