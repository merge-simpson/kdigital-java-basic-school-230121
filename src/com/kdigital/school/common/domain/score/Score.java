package com.kdigital.school.common.domain.score;

import com.kdigital.school.common.domain.BaseEntity;

import java.text.MessageFormat;

public class Score extends BaseEntity {
    private Integer value;
    private Integer studentId;
    private Integer subjectCode;
    private String studentName;
    private String subjectName;

    public Score(Integer value, Integer studentId, Integer subjectCode, String studentName, String subjectName) {
        this(null, value, studentId, subjectCode, studentName, subjectName);
    }

    public Score(Long id, Integer value, Integer studentId, Integer subjectCode, String studentName, String subjectName) {
        super(id);
        this.value = value;
        this.studentId = studentId;
        this.subjectCode = subjectCode;
        this.studentName = studentName;
        this.subjectName = subjectName;
    }

    private static class Builder {
        private Long id;
        private Integer score;
        private Integer studentId;
        private Integer subjectCode;
        private String studentName;
        private String subjectName;

        public Builder score(Integer score) {
            this.score = score;
            return this;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder studentId(Integer studentId){
            this.studentId = studentId;
            return this;
        }
        public Builder subjectCode(Integer subjectCode){
            this.subjectCode = subjectCode;
            return this;
        }
        public Builder studentName(String studentName){
            this.studentName = studentName;
            return this;
        }
        public Builder subjectName(String subjectName){
            this.subjectName = subjectName;
            return this;
        }

        public Score build() {
            return new Score(this.id, this.score, this.studentId, this.subjectCode, this.studentName, this.subjectName);
        }
    }// Builder

    public static Builder builder() {
        return new Builder();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(Integer subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return MessageFormat.format(
                "Score{value={0}, studentId={1}, subjectCode={2}, studentName='{3}', subjectName='{4}'"
                , value,  studentId, subjectCode, studentName, subjectName
        );
    }
}
