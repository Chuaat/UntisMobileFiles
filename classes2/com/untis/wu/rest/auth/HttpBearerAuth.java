// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public class HttpBearerAuth implements Authentication
{
    private String bearerToken;
    private final String scheme;
    
    public HttpBearerAuth(final String scheme) {
        this.scheme = scheme;
    }
    
    private static String upperCaseBearer(final String anotherString) {
        String s = anotherString;
        if ("bearer".equalsIgnoreCase(anotherString)) {
            s = "Bearer";
        }
        return s;
    }
    
    @Override
    public void applyToParams(final MultiValueMap<String, String> multiValueMap, final HttpHeaders httpHeaders) {
        if (this.bearerToken == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        String string;
        if (this.scheme != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(upperCaseBearer(this.scheme));
            sb2.append(" ");
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        sb.append(this.bearerToken);
        httpHeaders.add("Authorization", sb.toString());
    }
    
    public String getBearerToken() {
        return this.bearerToken;
    }
    
    public void setBearerToken(final String bearerToken) {
        this.bearerToken = bearerToken;
    }
}
