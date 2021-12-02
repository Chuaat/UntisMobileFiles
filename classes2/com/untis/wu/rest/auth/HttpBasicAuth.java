// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.auth;

import org.springframework.util.Base64Utils;
import java.nio.charset.StandardCharsets;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public class HttpBasicAuth implements Authentication
{
    private String password;
    private String username;
    
    @Override
    public void applyToParams(final MultiValueMap<String, String> multiValueMap, final HttpHeaders httpHeaders) {
        if (this.username == null && this.password == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        final String username = this.username;
        final String s = "";
        String str;
        if ((str = username) == null) {
            str = "";
        }
        sb.append(str);
        sb.append(":");
        String password = this.password;
        if (password == null) {
            password = s;
        }
        sb.append(password);
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(Base64Utils.encodeToString(string.getBytes(StandardCharsets.UTF_8)));
        httpHeaders.add("Authorization", sb2.toString());
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
}
