// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.media.AudioAttributes$Builder;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.media.AudioAttributes;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(21)
@t0({ t0.a.G })
public class AudioAttributesImplApi21 implements AudioAttributesImpl
{
    @t0({ t0.a.G })
    public AudioAttributes a;
    @t0({ t0.a.G })
    public int b;
    
    @t0({ t0.a.G })
    public AudioAttributesImplApi21() {
        this.b = -1;
    }
    
    AudioAttributesImplApi21(final AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }
    
    AudioAttributesImplApi21(final AudioAttributes a, final int b) {
        this.b = -1;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int a() {
        final int b = this.b;
        if (b != -1) {
            return b;
        }
        return AudioAttributesCompat.h(false, this.w(), this.c());
    }
    
    @Override
    public int b() {
        return this.b;
    }
    
    @Override
    public int c() {
        return this.a.getUsage();
    }
    
    @k0
    @Override
    public Object d() {
        return this.a;
    }
    
    @Override
    public int e() {
        return this.a.getContentType();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof AudioAttributesImplApi21 && this.a.equals((Object)((AudioAttributesImplApi21)o).a);
    }
    
    @Override
    public int f() {
        return AudioAttributesCompat.h(true, this.w(), this.c());
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.a);
        return sb.toString();
    }
    
    @Override
    public int w() {
        return this.a.getFlags();
    }
    
    @p0(21)
    static class a implements AudioAttributesImpl.a
    {
        final AudioAttributes$Builder a;
        
        a() {
            this.a = new AudioAttributes$Builder();
        }
        
        a(final Object o) {
            this.a = new AudioAttributes$Builder((AudioAttributes)o);
        }
        
        @j0
        public a a(final int contentType) {
            this.a.setContentType(contentType);
            return this;
        }
        
        @j0
        public a b(final int flags) {
            this.a.setFlags(flags);
            return this;
        }
        
        @j0
        public a d(final int legacyStreamType) {
            this.a.setLegacyStreamType(legacyStreamType);
            return this;
        }
        
        @j0
        public a e(final int n) {
            int usage = n;
            if (n == 16) {
                usage = 12;
            }
            this.a.setUsage(usage);
            return this;
        }
        
        @j0
        @Override
        public AudioAttributesImpl h() {
            return new AudioAttributesImplApi21(this.a.build());
        }
    }
}
