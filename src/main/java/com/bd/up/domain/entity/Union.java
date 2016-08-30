package com.bd.up.domain.entity;

import javax.persistence.*;

/**
 * Created by farhan on 8/15/16.
 */
@Entity
@Table(name = "unions")
public class Union {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_en")
    private String nameInEng;

    @Column(name = "name_bn")
    private String nameInBn;

    @Column(name = "description")
    private String desc;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "upazila")
    private Upazilla upazila;

    public Long getId() {
        return id;
    }

    public String getNameInEng() {
        return nameInEng;
    }

    public void setNameInEng(String nameInEng) {
        this.nameInEng = nameInEng;
    }

    public String getNameInBn() {
        return nameInBn;
    }

    public void setNameInBn(String nameInBn) {
        this.nameInBn = nameInBn;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Upazilla getUpazila() {
        return upazila;
    }

    public void setUpazila(Upazilla upazila) {
        this.upazila = upazila;
    }
}
