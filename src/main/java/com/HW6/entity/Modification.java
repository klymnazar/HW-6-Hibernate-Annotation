package com.HW6.entity;

import javax.persistence.*;
import java.util.Date;

@Embeddable
public class Modification {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date", nullable = false)
    private Date modifyDate;

    @PrePersist
    private void prePersist() {
        if (createDate == null) {
            createDate = new Date();
        }
        modifyDate = new Date();
    }

    @PreUpdate
    private void preUpdate() {
        modifyDate = new Date();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}

