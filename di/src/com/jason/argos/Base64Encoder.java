/*
 * @(#)Base64Encoder.java $version 2022/02/09
 *
 */
package com.jason.argos;

import java.util.Base64;

/**
 * @author Insu Yang
 */
public class Base64Encoder implements IEncoder {
    @Override
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
