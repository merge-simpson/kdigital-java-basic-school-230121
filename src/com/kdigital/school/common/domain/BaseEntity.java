package com.kdigital.school.common.domain;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable, Cloneable {
    private Long id;

    public BaseEntity() { }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public void setId(Long id) { this.id = id; }

    public Long getId() { return this.id; }

    @Override
    public BaseEntity clone() {
        try {
            return (BaseEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
