package com.dbteam.xml.volunteer;

import com.dbteam.common.dtopackage.VolDTO;

public interface VolMapper {

    int deleteVol(int num);

    int insertVol(VolDTO vol);
}
