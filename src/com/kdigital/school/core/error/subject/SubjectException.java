package com.kdigital.school.core.error.subject;

public class SubjectException extends RuntimeException {
    public SubjectException(SubjectErrorCode errorCode) {
        super(errorCode.MESSAGE);
    }

    public SubjectException(SubjectErrorCode errorCode, Throwable cause) {
        super(errorCode.MESSAGE, cause);
    }
}
