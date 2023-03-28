package com.laundry.laundrysample.sample.application.model;

import lombok.Getter;

@Getter
public class CreateSampleCommand {
    private String title;
    private String contents;
    private int ordinal;
    private Integer creator;
}
