package com.kdigital.school.core.error.subject;

import com.kdigital.school.core.error.ErrorCode;

public enum SubjectErrorCode implements ErrorCode {
    DUPLICATED_SUBJECT_CODE("과목 코드가 이미 존재합니다."),
    SCORE_TYPE_IS_NULL("Score type cannot be null.");

    public final String MESSAGE;

    SubjectErrorCode(String message) {
        this.MESSAGE = message;
    }

    @Override
    public SubjectException toException() {
        return new SubjectException(this);
    }
}
