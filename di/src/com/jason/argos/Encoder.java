/*
 * @(#)Encoder.java $version 2022/02/09
 *
 */
package com.jason.argos;

import java.util.Base64;

/**
 * @author Insu Yang
 */
public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}
