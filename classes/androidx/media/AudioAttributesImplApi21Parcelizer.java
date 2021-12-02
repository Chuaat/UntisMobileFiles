// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class AudioAttributesImplApi21Parcelizer
{
    public static AudioAttributesImplApi21 read(final e e) {
        final AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = e.W(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = e.M(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }
    
    public static void write(final AudioAttributesImplApi21 audioAttributesImplApi21, final e e) {
        e.j0(false, false);
        e.X0((Parcelable)audioAttributesImplApi21.a, 1);
        e.M0(audioAttributesImplApi21.b, 2);
    }
}
