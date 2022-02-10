package com.zerocellombak;

import com.creditdatamw.zerocell.annotation.Column;
import lombok.Data;

/**
 * Impletemented zerocell and lombak functions
 */

@Data
public class TestData {

    @Column(name = "testcase", index = 0)
    private String testcase;
    @Column(name = "action", index = 1)
    private String action;
    @Column(name = "locator", index = 2)
    private String locator;
    @Column(name = "data", index = 3)
    private String data;

}
