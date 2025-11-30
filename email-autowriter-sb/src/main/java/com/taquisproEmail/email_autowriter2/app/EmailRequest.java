package com.taquisproEmail.email_autowriter2.app;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}