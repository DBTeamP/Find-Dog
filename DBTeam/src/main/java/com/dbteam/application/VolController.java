package com.dbteam.application;

import com.dbteam.common.dtopackage.UsersDTO;
import com.dbteam.common.dtopackage.VolDTO;
import com.dbteam.xml.volunteer.VolService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class VolController {
    private final VolService volService;

    private final PrintResult printResult;


    public VolController(){
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
        volDTO.setManagerNum(managerNum);

        if(volService.registVol(volDTO)){
            printResult.printSuccessMessage("insert");
        }

    }

    public void selectAllMenu() {
        List<VolDTO> volList = volService.selectAllVol();

        if (volList != null) {
            printResult.printVolList(volList);
        } else{
            printResult.printErrorMessage("selectAllVol");
        }
    }

    public void selectVolByTxt(Map<String, String> parameter) {
        String volTxt = parameter.get("volTxt");

        List<VolDTO> selectVolList = volService.selectVolByTxt(volTxt);

        if(selectVolList != null){
            printResult.printVol(selectVolList);
        } else{
            printResult.printErrorMessage("selectOne");
        }
    }


    public boolean checkRights(UsersDTO user) {

        boolean result = false;

        if(user.getAdminRights() == "Y"){
            return true;
        } else {
            return false;
        }
    }
}
