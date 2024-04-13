package com.dbteam.xml;

import com.dbteam.common.dtopackage.CountDTO;
import com.dbteam.common.dtopackage.VolPDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VolPMapper {

    int insertVolP(VolPDTO list);


    int deleteVolP(VolPDTO num);


    List<CountDTO> selectVolP(@Param("volNameList") List<String> volNameList);
}
