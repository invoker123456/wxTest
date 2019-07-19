package com.invoker.message.req;

/**
 * Created by invoker on 2019-07-18
 * Description: 请求消息之文本消息 </br>
 */
public class TextMessage extends BaseMessage {
    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
