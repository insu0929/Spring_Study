/*
 * @(#)UrlEncoder.java $version 2022/02/09
 *
 */
package com.jason.argos;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author Insu Yang
 */
public class UrlEncoder implements IEncoder{

    public String encode(String message){

        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
