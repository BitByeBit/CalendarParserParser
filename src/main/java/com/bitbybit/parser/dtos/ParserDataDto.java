package com.bitbybit.parser.dtos;

import org.springframework.web.multipart.MultipartFile;

public class ParserDataDto {
    public String userUid;
    public String series;
    public String group;
    public String subGroup;
    public MultipartFile file;
}
