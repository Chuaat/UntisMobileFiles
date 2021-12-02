// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp;

import org.apache.commons.cli.n;
import org.apache.commons.cli.j;

public class GlobalOptions
{
    public final j optionHelp;
    public final j optionListPlugins;
    public final j optionProcess;
    public final n options;
    
    public GlobalOptions() {
        final j optionHelp = new j("h", "help", false, "Print this help");
        this.optionHelp = optionHelp;
        final j optionListPlugins = new j("l", "list", false, "List available plugins");
        this.optionListPlugins = optionListPlugins;
        final j optionProcess = new j("p", "process", true, "Specify target process");
        this.optionProcess = optionProcess;
        final n options = new n();
        (this.options = options).c(optionHelp);
        options.c(optionListPlugins);
        options.c(optionProcess);
    }
}
