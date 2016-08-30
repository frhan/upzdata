package com.bd.up.domain.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by farhan on 8/15/16.
 */
@Entity
@Table(name = "districts")
public class District {

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
    @JoinColumn(name = "division")
    private Division division;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "district",fetch = FetchType.EAGER)
    private List<Upazilla> upazillas;

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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Upazilla> getUpazillas() {
        return upazillas;
    }

    public void setUpazillas(List<Upazilla> upazillas) {
        this.upazillas = upazillas;
    }
}
