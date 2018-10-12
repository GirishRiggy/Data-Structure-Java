package com.vacker.example.test;

public class EmailSmsDTO {

    private String termsAndConditionsUrl;
    private String supportEmail;
    private String fromEmail;

    private String apiKey2Factor;
    private String smsFrom;
    private String smsTemplateName;
    private String smsService;

    public EmailSmsDTO() {
        //default constructor
    }

    public String getTermsAndConditionsUrl() {
        return termsAndConditionsUrl;
    }

    public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getApiKey2Factor() {
        return apiKey2Factor;
    }

    public void setApiKey2Factor(String apiKey2Factor) {
        this.apiKey2Factor = apiKey2Factor;
    }

    public String getSmsFrom() {
        return smsFrom;
    }

    public void setSmsFrom(String smsFrom) {
        this.smsFrom = smsFrom;
    }

    public String getSmsTemplateName() {
        return smsTemplateName;
    }

    public void setSmsTemplateName(String smsTemplateName) {
        this.smsTemplateName = smsTemplateName;
    }

    public String getSmsService() {
        return smsService;
    }

    public void setSmsService(String smsService) {
        this.smsService = smsService;
    }

}
