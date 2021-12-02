// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class AudioAttributesImplBaseParcelizer
{
    public static AudioAttributesImplBase read(final e e) {
        final AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = e.M(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = e.M(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = e.M(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = e.M(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }
    
    public static void write(final AudioAttributesImplBase audioAttributesImplBase, final e e) {
        e.j0(false, false);
        e.M0(audioAttributesImplBase.a, 1);
        e.M0(audioAttributesImplBase.b, 2);
        e.M0(audioAttributesImplBase.c, 3);
        e.M0(audioAttributesImplBase.d, 4);
    }
}
