package com.kdigital.school.core.error.subject;

import com.kdigital.school.core.error.ErrorCode;

public enum SubjectErrorCode implements ErrorCode {
    DUPLICATED_SUBJECT_CODE("과목 코드가 이미 존재합니다."),
    BLANK_SUBJECT_CODE("Subject code는 null이 될 수 없습니다."),
    UNNAMED_SUBJECT("과목 이름이 입력되어야 합니다."),
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
