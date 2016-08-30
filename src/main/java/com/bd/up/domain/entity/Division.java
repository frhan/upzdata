package com.bd.up.domain.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by farhan on 8/15/16.
 */
@Entity
@Table(name = "divisions")
public class Division {
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

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "division",fetch = FetchType.EAGER)
    private List<District> districts;

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

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
