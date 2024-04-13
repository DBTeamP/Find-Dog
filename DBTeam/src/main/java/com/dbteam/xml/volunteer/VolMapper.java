package com.dbteam.xml.volunteer;

import com.dbteam.common.dtopackage.VolDTO;

import java.util.List;

public interface VolMapper {

    int deleteVol(int num);

    int insertVol(VolDTO vol);

    List<VolDTO> selectVolByTxt(String volTxt);

    List<VolDTO> selectAllVol();
}
