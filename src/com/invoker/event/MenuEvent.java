package com.invoker.event;

/**
 * Created by invoker on 2019-07-18
 * Description: 自定义菜单事件 </br>
 */
public class MenuEvent extends BaseEvent {
    // 事件KEY值，与自定义菜单接口中KEY值对应
    private String EventKey;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }
}
