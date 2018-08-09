package com.nj.treedemo;

/**
 * Created by Administrator on 2018-08-09.
 */

public class Peijlb {
    @TreeNodeId
    public int peijlb_dm;
    @TreeNodePid
    public int peijlb_top;
    @TreeNodeLabel
    public String peijlb_mc;

    public Peijlb() {
    }

    public Peijlb(int peijlb_dm, int peijlb_top, String peijlb_mc) {
        this.peijlb_dm = peijlb_dm;
        this.peijlb_top = peijlb_top;
        this.peijlb_mc = peijlb_mc;
    }
}
