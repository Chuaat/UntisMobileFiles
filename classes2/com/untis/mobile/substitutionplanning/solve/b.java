// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.solve;

import android.view.ViewGroup;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.c;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView$g0;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import com.untis.mobile.substitutionplanning.model.AskTeacherRequestStateDto;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.recyclerview.widget.o$i;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u00126\u0010 \u001a2\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J@\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006#" }, d2 = { "Lcom/untis/mobile/substitutionplanning/solve/b;", "Landroidx/recyclerview/widget/o$i;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "viewHolder", "", "dX", "Lkotlin/j2;", "I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "target", "", "A", "", "direction", "D", "Landroid/graphics/Canvas;", "c", "dY", "actionState", "isCurrentlyActive", "w", "Lcom/untis/mobile/substitutionplanning/solve/a;", "k", "Lcom/untis/mobile/substitutionplanning/solve/a;", "adapter", "Lkotlin/Function2;", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherRequestStateDto;", "Lkotlin/t0;", "name", "dto", "position", "onDelete", "<init>", "(Lcom/untis/mobile/substitutionplanning/solve/a;Ln6/p;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends o$i
{
    @e
    private final a k;
    @e
    private final p<AskTeacherRequestStateDto, Integer, j2> l;
    
    public b(@e final a k, @e final p<? super AskTeacherRequestStateDto, ? super Integer, j2> l) {
        k0.p(k, "adapter");
        k0.p(l, "onDelete");
        super(0, 4);
        this.k = k;
        this.l = (p<AskTeacherRequestStateDto, Integer, j2>)l;
    }
    
    private final void I(final RecyclerView$g0 recyclerView$g0, final float translationX) {
        ((ViewGroup)recyclerView$g0.itemView.findViewById(c.i.xu)).setTranslationX(translationX);
    }
    
    public boolean A(@e final RecyclerView recyclerView, @e final RecyclerView$g0 recyclerView$g0, @e final RecyclerView$g0 recyclerView$g2) {
        k0.p(recyclerView, "recyclerView");
        k0.p(recyclerView$g0, "viewHolder");
        k0.p(recyclerView$g2, "target");
        return true;
    }
    
    public void D(@e final RecyclerView$g0 recyclerView$g0, final int n) {
        k0.p(recyclerView$g0, "viewHolder");
        this.l.invoke(this.k.i(recyclerView$g0.getAdapterPosition()), recyclerView$g0.getAdapterPosition());
        this.k.notifyItemChanged(recyclerView$g0.getAdapterPosition());
    }
    
    public void w(@e final Canvas canvas, @e final RecyclerView recyclerView, @e final RecyclerView$g0 recyclerView$g0, final float n, final float n2, final int n3, final boolean b) {
        k0.p(canvas, "c");
        k0.p(recyclerView, "recyclerView");
        k0.p(recyclerView$g0, "viewHolder");
        this.I(recyclerView$g0, n);
    }
}
