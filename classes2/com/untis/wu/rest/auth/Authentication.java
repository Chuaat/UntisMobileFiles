// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.wu.rest.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public interface Authentication
{
    void applyToParams(final MultiValueMap<String, String> p0, final HttpHeaders p1);
}
