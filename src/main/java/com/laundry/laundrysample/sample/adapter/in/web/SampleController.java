package com.laundry.laundrysample.sample.adapter.in.web;

import com.laundry.laundrysample.common.model.CommonResponse;
import com.laundry.laundrysample.sample.application.model.CreateSampleCommand;
import com.laundry.laundrysample.sample.application.model.SampleFilter;
import com.laundry.laundrysample.sample.application.model.SampleQuery;
import com.laundry.laundrysample.sample.application.port.in.SampleCommandUseCase;
import com.laundry.laundrysample.sample.application.port.in.SampleQueryUseCase;
import com.laundry.laundrysample.sample.domain.SampleId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SampleController {
    private final SampleCommandUseCase sampleCommandUseCase;
    private final SampleQueryUseCase sampleQueryUseCase;

    @GetMapping("/v2/sample")
    public CommonResponse<List<SampleQuery>> findSamples(@RequestBody SampleFilter samplesRequest) {
        return CommonResponse.ok(sampleQueryUseCase.findSamples(samplesRequest));
    }

    @GetMapping("/v2/sample/{sampleId}")
    public CommonResponse<SampleQuery> findSample(@PathVariable Long sampleId) {
        return CommonResponse.ok(sampleQueryUseCase.findSampleBySampleId(new SampleId(sampleId)));
    }

    @PostMapping("/v2/sample")
    public CommonResponse<SampleQuery> createSample(@RequestBody CreateSampleCommand command) {
        Long sampleId = sampleCommandUseCase.createSample(command);
        SampleQuery sampleQuery = sampleQueryUseCase.findSampleBySampleId(new SampleId(sampleId));
        return CommonResponse.created(sampleQuery);
    }
}
