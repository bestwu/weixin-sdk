package com.riversoft.weixin.mp.event.template;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.riversoft.weixin.common.event.EventRequest;

/**
 * 模板消息事件 Created by exizhai on 12/16/2015.
 */
public class JobFinishedEvent extends EventRequest {

  @JsonProperty("MsgID")
  private String msgId;

  @JsonProperty("Status")
  @JacksonXmlCData
  private String status;

  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public boolean success() {
    return "success".equalsIgnoreCase(this.status);
  }
}
