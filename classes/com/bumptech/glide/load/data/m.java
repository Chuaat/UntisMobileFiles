// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.j0;
import java.io.IOException;
import android.os.Build$VERSION;
import androidx.annotation.p0;
import android.os.ParcelFileDescriptor;

public final class m implements e<ParcelFileDescriptor>
{
    private final b a;
    
    @p0(21)
    public m(final ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new b(parcelFileDescriptor);
    }
    
    public static boolean c() {
        return Build$VERSION.SDK_INT >= 21;
    }
    
    @Override
    public void b() {
    }
    
    @j0
    @p0(21)
    public ParcelFileDescriptor d() throws IOException {
        return this.a.a();
    }
    
    @p0(21)
    public static final class a implements e.a<ParcelFileDescriptor>
    {
        @j0
        @Override
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }
        
        @j0
        public e<ParcelFileDescriptor> c(@j0 final ParcelFileDescriptor parcelFileDescriptor) {
            return new m(parcelFileDescriptor);
        }
    }
    
    @p0(21)
    private static final class b
    {
        private final ParcelFileDescriptor a;
        
        b(final ParcelFileDescriptor a) {
            this.a = a;
        }
        
        ParcelFileDescriptor a() throws IOException {
            try {
                Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.a;
            }
            catch (ErrnoException cause) {
                throw new IOException((Throwable)cause);
            }
        }
    }
}
