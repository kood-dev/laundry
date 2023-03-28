package com.laundry.laundrysample.common.constant.type;

import com.laundry.laundrysample.common.constant.CommonCodeType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum YNType implements CommonCodeType {
    Y("Y", "예"),
    N("N", "아니오");

    private final String code;
    private final String desc;
}
