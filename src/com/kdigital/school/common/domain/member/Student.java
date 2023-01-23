package com.kdigital.school.common.domain.member;

import com.kdigital.school.common.domain.BaseEntity;
import com.kdigital.school.core.error.Preconditions;
import com.kdigital.school.core.error.member.MemberErrorCode;

public class Student extends BaseEntity {
    private Integer studentId;
    private String fullName;

    public Student(Integer studentId,String fullName) {
        this(null, studentId, fullName);
    }

    public Student(Long id, Integer studentId,String fullName) {
        super(id);

        Preconditions.validate(studentId != null,
                MemberErrorCode.STUDENT_ID_IS_NULL);
        Preconditions.validate(fullName != null && fullName.length() > 0,
                MemberErrorCode.STUDENT_FULLNAME_IS_BLANK);

        this.studentId = studentId;
        this.fullName = fullName;
    }

    private static class Builder {
        private Long id;
        private Integer studentId;
        private String fullName;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder studentId(Integer studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Student build() {
            return new Student(id, studentId, fullName);
        }
    }// Builder

    public static Builder builder() {
        return new Builder();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        Preconditions.validate(studentId != null,
                MemberErrorCode.STUDENT_ID_IS_NULL);

        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        Preconditions.validate(fullName != null && fullName.length() > 0,
                MemberErrorCode.STUDENT_FULLNAME_IS_BLANK);

        this.fullName = fullName;
    }
}
