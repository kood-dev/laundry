package com.laundry.laundrysample.sample.application.port.in;

import com.laundry.laundrysample.sample.application.model.CreateSampleCommand;

public interface SampleCommandUseCase {
    Long createSample(CreateSampleCommand createSampleCommand);
}
