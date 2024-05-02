package com.caroline.email.service.core;

public record EmailRequest(String to, String subject, String body) {
}
