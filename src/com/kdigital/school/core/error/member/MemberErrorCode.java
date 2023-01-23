package com.kdigital.school.core.error.member;

import com.kdigital.school.core.error.ErrorCode;

public enum MemberErrorCode implements ErrorCode {
    DUPLICATED_MEMBER_ID("학번 또는 교번, 교직원 번호 등이 이미 존재합니다."),
    STUDENT_ID_IS_NULL("Student ID는 null이 될 수 없습니다."),
    STUDENT_FULLNAME_IS_BLANK("Student fullName 속성은 빈 값이 될 수 없습니다."),
    STUDENT_ID_INVALID("Student ID가 올바른 양식을 따르지 않습니다.");

    public final String MESSAGE;

    MemberErrorCode(String message) {
        this.MESSAGE = message;
    }

    @Override
    public MemberException toException() {
        return new MemberException(this);
    }
}
