// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media;

import androidx.media.AudioAttributesImplApi21;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public final class AudioAttributesImplApi21Parcelizer extends androidx.media.AudioAttributesImplApi21Parcelizer
{
    public static AudioAttributesImplApi21 read(final e e) {
        return androidx.media.AudioAttributesImplApi21Parcelizer.read(e);
    }
    
    public static void write(final AudioAttributesImplApi21 audioAttributesImplApi21, final e e) {
        androidx.media.AudioAttributesImplApi21Parcelizer.write(audioAttributesImplApi21, e);
    }
}
