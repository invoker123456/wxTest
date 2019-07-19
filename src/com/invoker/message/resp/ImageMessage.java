package com.invoker.message.resp;

/**
 * Created by invoker on 2019-07-18
 * Description: 回复图片消息</br>
 */
public class ImageMessage extends BaseMessage {
    private Image Image;

    public Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }
}
