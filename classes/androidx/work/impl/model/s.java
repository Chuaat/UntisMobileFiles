// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.work.f;
import androidx.room.e1;
import androidx.annotation.j0;
import androidx.work.c0;
import androidx.room.c3;
import java.util.List;
import androidx.room.n1;
import androidx.room.l0;
import android.annotation.SuppressLint;

@SuppressLint({ "UnknownNullness" })
@l0
public interface s
{
    @n1("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int A(final String p0);
    
    @n1("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void B(final String p0, final long p1);
    
    @c3
    @n1("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<r.c> C(final String p0);
    
    @c3
    @n1("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    List<r.c> D(final List<String> p0);
    
    @n1("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
    List<r> E(final int p0);
    
    @n1("SELECT id FROM workspec")
    List<String> F();
    
    @n1("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int G();
    
    @n1("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int a(final c0.a p0, final String... p1);
    
    @n1("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void b();
    
    @n1("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int c(@j0 final String p0, final long p1);
    
    @n1("DELETE FROM workspec WHERE id=:id")
    void d(final String p0);
    
    @n1("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<r.b> e(final String p0);
    
    @n1("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
    List<r> f(final long p0);
    
    @n1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<r> g(final int p0);
    
    @e1(onConflict = 5)
    void h(final r p0);
    
    @n1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<r> i();
    
    @n1("SELECT * FROM workspec WHERE id IN (:ids)")
    r[] j(final List<String> p0);
    
    @n1("UPDATE workspec SET output=:output WHERE id=:id")
    void k(final String p0, final f p1);
    
    @c3
    @n1("SELECT id FROM workspec")
    LiveData<List<String>> l();
    
    @c3
    @n1("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    LiveData<List<r.c>> m(final String p0);
    
    @n1("SELECT * FROM workspec WHERE state=1")
    List<r> n();
    
    @c3
    @n1("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    LiveData<List<r.c>> o(final String p0);
    
    @n1("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> p();
    
    @n1("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> q(@j0 final String p0);
    
    @c3
    @n1("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=:id")
    r.c r(final String p0);
    
    @n1("SELECT state FROM workspec WHERE id=:id")
    c0.a s(final String p0);
    
    @n1("SELECT * FROM workspec WHERE id=:id")
    r t(final String p0);
    
    @n1("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int u(final String p0);
    
    @c3
    @n1("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<r.c> v(final String p0);
    
    @n1("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    LiveData<Long> w(@j0 final String p0);
    
    @c3
    @n1("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    LiveData<List<r.c>> x(final List<String> p0);
    
    @n1("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<String> y(@j0 final String p0);
    
    @n1("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<f> z(final String p0);
}
