// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media;

import androidx.media.AudioAttributesImplApi26;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public final class AudioAttributesImplApi26Parcelizer extends androidx.media.AudioAttributesImplApi26Parcelizer
{
    public static AudioAttributesImplApi26 read(final e e) {
        return androidx.media.AudioAttributesImplApi26Parcelizer.read(e);
    }
    
    public static void write(final AudioAttributesImplApi26 audioAttributesImplApi26, final e e) {
        androidx.media.AudioAttributesImplApi26Parcelizer.write(audioAttributesImplApi26, e);
    }
}
