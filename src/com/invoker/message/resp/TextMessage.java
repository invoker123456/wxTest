package com.invoker.message.resp;

/**
 * Created by invoker on 2019-07-18
 * Description: 回复文本消息
 */
public class TextMessage extends BaseMessage {
    // 回复的消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
