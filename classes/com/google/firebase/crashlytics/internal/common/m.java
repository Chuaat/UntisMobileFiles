// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.io.IOException;
import com.google.firebase.crashlytics.internal.f;
import java.io.File;
import com.google.firebase.crashlytics.internal.persistence.h;

class m
{
    private final String a;
    private final h b;
    
    public m(final String a, final h b) {
        this.a = a;
        this.b = b;
    }
    
    private File b() {
        return new File(this.b.b(), this.a);
    }
    
    public boolean a() {
        boolean newFile;
        try {
            newFile = this.b().createNewFile();
        }
        catch (IOException ex) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Error creating marker: ");
            sb.append(this.a);
            f.e(sb.toString(), ex);
            newFile = false;
        }
        return newFile;
    }
    
    public boolean c() {
        return this.b().exists();
    }
    
    public boolean d() {
        return this.b().delete();
    }
}
