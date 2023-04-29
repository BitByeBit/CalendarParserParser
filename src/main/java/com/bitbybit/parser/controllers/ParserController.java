package com.bitbybit.parser.controllers;

import com.bitbybit.parser.dtos.CalendarDto;
import com.bitbybit.parser.dtos.ParserDataDto;
import com.bitbybit.parser.services.ParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ParserController {
    @Autowired
    private ParserService parserService;

    @PostMapping("/parse")
    public CalendarDto parse(@RequestParam("user_uid") String userUid,
                             @RequestParam("series") String series,
                             @RequestParam("group") String group,
                             @RequestParam("subgroup") String subGroup,
                             @RequestBody MultipartFile file) throws IOException {
        ParserDataDto parserDataDto = new ParserDataDto();
        parserDataDto.series = series;
        parserDataDto.group = group;
        parserDataDto.subGroup = subGroup;
        parserDataDto.file = file;

        parserDataDto.userUid = userUid;
        return parserService.execParser(parserDataDto);
    }
}
