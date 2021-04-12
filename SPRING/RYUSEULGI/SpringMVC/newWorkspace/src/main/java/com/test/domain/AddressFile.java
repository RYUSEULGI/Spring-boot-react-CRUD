package com.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressFile {
    private int seqf;
    private String ofname;
    private String sfname;
    private long fsize;
}