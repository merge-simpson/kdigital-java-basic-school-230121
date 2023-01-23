package com.kdigital.school.core.error.score;

import com.kdigital.school.core.error.ErrorCode;

public enum ScoreErrorCode implements ErrorCode {
    NO_SUCH_SUBJECT("No such subject."),
    SUBJECT_TYPE_CANNOT_BE_NULL("Subject type must exists, and cannot be null."),
    SCORE_OUT_OF_BOUND("점수가 유효한 범위로 입력되지 않았습니다."),
    DUPLICATED_SUBJECT_SCORE_REGISTRY("The score of this subject for this student already exists.");

    public final String MESSAGE;

    ScoreErrorCode(String message) {
        this.MESSAGE = message;
    }

    @Override
    public ScoreException toException() {
        return new ScoreException(this);
    }
}
