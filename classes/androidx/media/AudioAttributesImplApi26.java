// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import androidx.annotation.j0;
import android.media.AudioAttributes;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(26)
@t0({ t0.a.G })
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21
{
    @t0({ t0.a.G })
    public AudioAttributesImplApi26() {
    }
    
    AudioAttributesImplApi26(final AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
    
    @Override
    public int f() {
        return super.a.getVolumeControlStream();
    }
    
    @p0(26)
    static class a extends AudioAttributesImplApi21.a
    {
        a() {
        }
        
        a(final Object o) {
            super(o);
        }
        
        @j0
        public a f(final int usage) {
            super.a.setUsage(usage);
            return this;
        }
        
        @j0
        @Override
        public AudioAttributesImpl h() {
            return new AudioAttributesImplApi26(super.a.build());
        }
    }
}
