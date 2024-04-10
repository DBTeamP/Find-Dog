package com.dbteam.application;

import com.dbteam.common.dtopackage.VolDTO;
import com.dbteam.xml.volunteer.VolService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class MenuController {
    private final VolService volService;

    private final PrintResult printResult;


    public MenuController(){
        volService = new VolService();
        printResult = new PrintResult();
    }

    public void deleteVol(Map<String, String> parameter){
        int num = Integer.parseInt(parameter.get("num"));

        if(volService.deleteVol(num)){
            printResult.printSuccessMessage("delete");
        }
    }

    public void registMenu(Map<String, String> parameter){
        String volName = parameter.get("volName");
        String volTxt = parameter.get("volTxt");

        //String 형태 Date -> Date형태로 변환
        String volDateString = parameter.get("volDate");
        Date volDate = null;
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
            volDate = format.parse(volDateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        int regionNum = Integer.parseInt(parameter.get("regionNum"));
        int managerNum = Integer.parseInt(parameter.get("managerNum"));

        VolDTO volDTO = new VolDTO();
        volDTO.setVolName(volName);
        volDTO.setVolTxt(volTxt);
        volDTO.setVolDate(volDate);
        volDTO.setRegionNum(regionNum);
        volDTO.setManagerNum(managerNum);

        if(volService.registVol(volDTO)){
            printResult.printSuccessMessage("insert");
        }

    }
}
