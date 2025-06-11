package com.xworkz.common.util;

import com.xworkz.common.dto.CommonDto;
import com.xworkz.common.entity.CommonEntity;
import org.springframework.beans.BeanUtils;

public class CommonUtil {
    public static CommonEntity convertDtotoEntity(CommonDto commonDto){
        CommonEntity commonEntity=new CommonEntity();
        BeanUtils.copyProperties(commonDto,commonEntity);
        return commonEntity;
    }

    public static CommonDto convertEntitytoDto(CommonEntity commonEntity){
      CommonDto commonDto=new CommonDto();
        BeanUtils.copyProperties(commonEntity,commonDto);
        return commonDto;
    }
}
