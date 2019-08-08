package com.ciwei.smsserver.entity;

/**
 *功能描述
 * @author FuHang
 * @date 2019/8/5
 */
public class AliSmsRequest extends BaseRequest {
    private String[] phoneNumbers;

    private String signName;

    private String templateCode;

    private String templateParam;

    private String smsUpExtendCode;

    private String outId;

    private boolean isSendBatchSms = false;

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateParam() {
        return templateParam;
    }

    public void setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
    }

    public String getSmsUpExtendCode() {
        return smsUpExtendCode;
    }

    public void setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public boolean getIsSendBatchSms() {
        return isSendBatchSms;
    }

    public void setIsSendBatchSms(boolean isSendBatchSms) {
        this.isSendBatchSms = isSendBatchSms;
    }
}
