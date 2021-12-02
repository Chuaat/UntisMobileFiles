// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lcom/untis/mobile/utils/settings/a;", "Lcom/untis/mobile/utils/settings/f;", "", "", "aliasKey", "defaultValue", "secure", "<init>", "(Ljava/lang/String;ZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends f<Boolean>
{
    public a(@e final String s, final boolean b, final boolean b2) {
        k0.p(s, "aliasKey");
        super(s, b, b2);
    }
}
