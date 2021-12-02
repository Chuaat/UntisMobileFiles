// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer
{
    public static AudioAttributesImplBase read(final e e) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(e);
    }
    
    public static void write(final AudioAttributesImplBase audioAttributesImplBase, final e e) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, e);
    }
}
