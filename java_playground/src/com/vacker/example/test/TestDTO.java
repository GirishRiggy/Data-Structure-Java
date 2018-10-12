package com.vacker.example.test;

public class TestDTO {


    private static boolean isValid(EmailSmsDTO emailSmsDTO) {
        return (emailSmsDTO.getTermsAndConditionsUrl() == null
                || emailSmsDTO.getSupportEmail() == null || emailSmsDTO.getFromEmail() == null);
    }


    public static void main(String[] args) {
        EmailSmsDTO emailSmsDTO = new EmailSmsDTO();
        emailSmsDTO.setApiKey2Factor("dfdgfdg");
        emailSmsDTO.setFromEmail(null);
        emailSmsDTO.setSmsFrom("rgfdsd");
        emailSmsDTO.setSmsService("rgrre");
        emailSmsDTO.setSmsTemplateName("efe");
        emailSmsDTO.setSupportEmail("sdfd");
        emailSmsDTO.setTermsAndConditionsUrl("sdf");

        System.out.println(TestDTO.isValid(emailSmsDTO));

    }

}
