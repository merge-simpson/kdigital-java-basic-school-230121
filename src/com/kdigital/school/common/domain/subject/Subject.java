package com.kdigital.school.common.domain.subject;

import com.kdigital.school.common.domain.BaseEntity;
import com.kdigital.school.core.error.Preconditions;
import com.kdigital.school.core.error.subject.SubjectErrorCode;

import java.text.MessageFormat;

public class Subject extends BaseEntity {
    private Integer code;
    private String name;
    private ScoreType scoreType;

    public Subject(Integer code, String name, ScoreType scoreType) {
        this(null, code, name, scoreType);
    }

    public Subject(Long id, Integer code, String name, ScoreType scoreType) {
        super(id);

        Preconditions.validate(code != null && code > 0,
                SubjectErrorCode.BLANK_SUBJECT_CODE);
        Preconditions.validate(name != null && name.length() > 0,
                SubjectErrorCode.UNNAMED_SUBJECT);
        Preconditions.validate(scoreType != null,
                SubjectErrorCode.SCORE_TYPE_IS_NULL);

        this.code = code;
        this.name = name;
        this.scoreType = scoreType;
    }

    private static class Builder {
        private Long id;
        private Integer code;
        private String name;
        private ScoreType scoreType;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder scoreType(ScoreType scoreType) {
            this.scoreType = scoreType;
            return this;
        }

        public Subject build() {
            return new Subject(this.id, this.code, this.name, this.scoreType);
        }
    }// Builder

    public static Builder builder() {
        return new Builder();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        Preconditions.validate(code != null && code > 0,
                SubjectErrorCode.BLANK_SUBJECT_CODE);

        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Preconditions.validate(name != null && name.length() > 0,
                SubjectErrorCode.UNNAMED_SUBJECT);

        this.name = name;
    }

    public ScoreType getScoreType() {
        return scoreType;
    }

    public void setScoreType(ScoreType scoreType) {
        Preconditions.validate(scoreType != null,
                SubjectErrorCode.SCORE_TYPE_IS_NULL);

        this.scoreType = scoreType;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Subject{code={0}, name='{1}', scoreType={2}}", code, name, scoreType);
    }
}
