package com.kdigital.school.core.error.score;

public class ScoreException extends RuntimeException {

    public ScoreException(ScoreErrorCode errorCode) {
        super(errorCode.MESSAGE);
    }

    public ScoreException(ScoreErrorCode errorCode, Throwable cause) {
        super(errorCode.MESSAGE, cause);
    }
}
