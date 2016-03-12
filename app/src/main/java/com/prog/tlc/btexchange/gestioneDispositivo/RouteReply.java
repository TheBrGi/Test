package com.prog.tlc.btexchange.gestioneDispositivo;

/**
 * Created by BrGi on 12/03/2016.
 */
public class RouteReply {
    private String source_addr;
    private String dest_addr;
    private int dest_sequence_number;
    private int hop_cnt;
    private int lifetime;

    public RouteReply(String source_addr, String dest_addr, int dest_sequence_number, int hop_cnt, int lifetime) {
        this.source_addr = source_addr;
        this.dest_addr = dest_addr;
        this.dest_sequence_number = dest_sequence_number;
        this.hop_cnt = hop_cnt;
        this.lifetime = lifetime;
    }

    public String getSource_addr() {
        return source_addr;
    }

    public String getDest_addr() {
        return dest_addr;
    }

    public int getDest_sequence_number() {
        return dest_sequence_number;
    }

    public int getHop_cnt() {
        return hop_cnt;
    }

    public int getLifetime() {
        return lifetime;
    }
}
