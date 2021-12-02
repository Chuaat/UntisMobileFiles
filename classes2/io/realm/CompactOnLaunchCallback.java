// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.Keep;

@Keep
public interface CompactOnLaunchCallback
{
    boolean shouldCompact(final long p0, final long p1);
}
