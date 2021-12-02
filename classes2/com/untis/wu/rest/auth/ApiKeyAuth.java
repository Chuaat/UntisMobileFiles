// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public class ApiKeyAuth implements Authentication
{
    private String apiKey;
    private String apiKeyPrefix;
    private final String location;
    private final String paramName;
    
    public ApiKeyAuth(final String location, final String paramName) {
        this.location = location;
        this.paramName = paramName;
    }
    
    @Override
    public void applyToParams(final MultiValueMap<String, String> multiValueMap, final HttpHeaders httpHeaders) {
        String s = this.apiKey;
        if (s == null) {
            return;
        }
        if (this.apiKeyPrefix != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.apiKeyPrefix);
            sb.append(" ");
            sb.append(this.apiKey);
            s = sb.toString();
        }
        if (this.location.equals("query")) {
            multiValueMap.add((Object)this.paramName, (Object)s);
        }
        else if (this.location.equals("header")) {
            httpHeaders.add(this.paramName, s);
        }
    }
    
    public String getApiKey() {
        return this.apiKey;
    }
    
    public String getApiKeyPrefix() {
        return this.apiKeyPrefix;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public String getParamName() {
        return this.paramName;
    }
    
    public void setApiKey(final String apiKey) {
        this.apiKey = apiKey;
    }
    
    public void setApiKeyPrefix(final String apiKeyPrefix) {
        this.apiKeyPrefix = apiKeyPrefix;
    }
}
