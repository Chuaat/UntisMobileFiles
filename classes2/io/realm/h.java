// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

public class h implements CompactOnLaunchCallback
{
    @Override
    public boolean shouldCompact(final long n, final long n2) {
        return n > 52428800L && n2 / (double)n < 0.5;
    }
}
