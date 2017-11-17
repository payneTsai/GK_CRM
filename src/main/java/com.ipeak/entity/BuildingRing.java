package com.ipeak.entity;
public class BuildingRing {
    private Long ringId;//工作圈表
    private String content;
    public BuildingRing() {
        super();
    }
    public BuildingRing(Long ringId,String content) {
        super();
        this.ringId = ringId;
        this.content = content;
    }
    public Long getRingId() {
        return this.ringId;
    }

    public void setRingId(Long ringId) {
        this.ringId = ringId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
