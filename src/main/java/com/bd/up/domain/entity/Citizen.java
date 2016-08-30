package com.bd.up.domain.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citizens")
public class Citizen{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_en")
    private String nameInEng;

    @Column(name = "name_bn")
    private String nameInBn;

    @Column(name = "fathers_name")
    private String fathersName;

    @Column(name = "mothers_name")
    private String mothersName;

    @Column(name = "spouse_name")
    private String spouseName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "word_no")
    private int wordNo;

    @Column(name = "post")
    private String post;

    @Column(name = "nid")
    private String nid;

    @Column(name = "birthId")
    private String birthId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "modified_at")
    private Date modifiedAt;

    @Column(name = "status")
    private Date status;

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

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWordNo() {
        return wordNo;
    }

    public void setWordNo(int wordNo) {
        this.wordNo = wordNo;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getBirthId() {
        return birthId;
    }

    public void setBirthId(String birthId) {
        this.birthId = birthId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Date getStatus() {
        return status;
    }

    public void setStatus(Date status) {
        this.status = status;
    }
}
