// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server.http;

import androidx.annotation.k0;
import java.util.ArrayList;

public class LightHttpMessage
{
    public final ArrayList<String> headerNames;
    public final ArrayList<String> headerValues;
    
    public LightHttpMessage() {
        this.headerNames = new ArrayList<String>();
        this.headerValues = new ArrayList<String>();
    }
    
    public void addHeader(final String e, final String e2) {
        this.headerNames.add(e);
        this.headerValues.add(e2);
    }
    
    @k0
    public String getFirstHeaderValue(final String s) {
        for (int size = this.headerNames.size(), i = 0; i < size; ++i) {
            if (s.equals(this.headerNames.get(i))) {
                return this.headerValues.get(i);
            }
        }
        return null;
    }
    
    public void reset() {
        this.headerNames.clear();
        this.headerValues.clear();
    }
}
