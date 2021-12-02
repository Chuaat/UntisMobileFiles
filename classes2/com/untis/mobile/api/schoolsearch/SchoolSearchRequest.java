// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.schoolsearch;

import androidx.annotation.j0;
import androidx.annotation.k0;
import java.io.Serializable;

public class SchoolSearchRequest implements Serializable
{
    @k0
    public Long schoolid;
    @k0
    public String schoolname;
    @k0
    public String search;
    
    public SchoolSearchRequest() {
    }
    
    public SchoolSearchRequest(final long l) {
        this.schoolid = l;
    }
    
    public SchoolSearchRequest(@j0 final String search) {
        this.search = search;
    }
    
    public SchoolSearchRequest(@k0 final String search, @k0 final Long schoolid, @k0 final String schoolname) {
        this.search = search;
        this.schoolid = schoolid;
        this.schoolname = schoolname;
    }
}
