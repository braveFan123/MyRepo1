package com.mrfan.Entity;

public class Stduent {
    private Integer id;
    private String name;
    private Integer cid;

    public Stduent() {

    }

    public Stduent(String name, Integer cid) {
        this.id = id;
        this.name = name;
        this.cid = cid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}
