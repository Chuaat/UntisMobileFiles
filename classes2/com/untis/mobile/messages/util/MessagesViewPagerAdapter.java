// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import androidx.viewpager.widget.a;
import org.jetbrains.annotations.f;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.e;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import androidx.fragment.app.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/messages/util/MessagesViewPagerAdapter;", "Landroidx/fragment/app/r;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "", "getPageTitle", "getCount", "fragment", "", "title", "Lkotlin/j2;", "addFragment", "index", "removeFragment", "", "fragmentList", "Ljava/util/List;", "titleList", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesViewPagerAdapter extends r
{
    @e
    private final List<Fragment> fragmentList;
    @e
    private final List<String> titleList;
    
    public MessagesViewPagerAdapter(@e final FragmentManager fragmentManager) {
        k0.p(fragmentManager, "fm");
        super(fragmentManager, 1);
        this.fragmentList = new ArrayList<Fragment>();
        this.titleList = new ArrayList<String>();
    }
    
    public final void addFragment(@e final Fragment fragment, @e final String s) {
        k0.p(fragment, "fragment");
        k0.p(s, "title");
        this.fragmentList.add(fragment);
        this.titleList.add(s);
    }
    
    public int getCount() {
        return this.fragmentList.size();
    }
    
    @e
    public Fragment getItem(final int n) {
        return this.fragmentList.get(n);
    }
    
    @f
    public CharSequence getPageTitle(final int n) {
        return this.titleList.get(n);
    }
    
    public final void removeFragment(final int n) {
        if (this.fragmentList.size() > 1) {
            this.fragmentList.remove(n);
            this.titleList.remove(n);
            ((a)this).notifyDataSetChanged();
        }
    }
}
