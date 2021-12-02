// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer
{
    public static AudioAttributesCompat read(final e e) {
        return androidx.media.AudioAttributesCompatParcelizer.read(e);
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final e e) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, e);
    }
}
