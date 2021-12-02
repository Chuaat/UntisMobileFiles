// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.homeworks;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/homeworks/k0;", "Landroidx/fragment/app/r;", "", "position", "Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorkFragment;", "a", "getCount", "", "b", "J", "periodId", "", "Ljava/lang/String;", "profileId", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;J)V", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k0 extends r
{
    @e
    public static final a c;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    @e
    private final String a;
    private final long b;
    
    static {
        c = new a(null);
    }
    
    public k0(@e final FragmentManager fragmentManager, @e final String a, final long b) {
        kotlin.jvm.internal.k0.p(fragmentManager, "supportFragmentManager");
        kotlin.jvm.internal.k0.p(a, "profileId");
        super(fragmentManager);
        this.a = a;
        this.b = b;
    }
    
    @e
    public HomeWorkFragment a(final int n) {
        final HomeWorkFragment.a n2 = HomeWorkFragment.N;
        final String a = this.a;
        final long b = this.b;
        boolean b2 = true;
        if (n != 1) {
            b2 = false;
        }
        return n2.a(a, b, b2);
    }
    
    public int getCount() {
        return 2;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t" }, d2 = { "com/untis/mobile/ui/activities/classbook/homeworks/k0$a", "", "", "PAGES", "I", "PAGE_ALL", "PAGE_UNCOMPLETED", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
