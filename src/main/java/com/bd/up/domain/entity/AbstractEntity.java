package com.bd.up.domain.entity;

import javax.persistence.*;

@Entity
public abstract  class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_en")
    private String nameInEng;

    @Column(name = "name_bn")
    private String nameInBn;

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

    @Override
    public String toString() {
        return super.toString();
    }
}
