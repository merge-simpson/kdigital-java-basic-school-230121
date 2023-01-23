package com.kdigital.school.core.error.member;

public class MemberException extends RuntimeException {

    public MemberException(MemberErrorCode errorCode) {
        super(errorCode.MESSAGE);
    }

    public MemberException(MemberErrorCode errorCode, Throwable cause) {
        super(errorCode.MESSAGE, cause);
    }
}
