package com.xworkz.common.service;

import com.xworkz.common.dto.CommonDto;

import com.xworkz.common.entity.CommonEntity;
import com.xworkz.common.repo.CmmonRepo;
import com.xworkz.common.util.CommonUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImp implements CommonService{
    @Autowired
    CmmonRepo repo;
    @Override
    public String saveRegisterDto(CommonDto dto) {

            System.out.println("Invoking saveRegisterDto");
            String isCheck=null;
            if(dto!=null){

                boolean isSaved=repo.saveRegisterDetails(CommonUtil.convertDtotoEntity(dto));
                if(isSaved){
                    isCheck="Registered ";
                }else {
                    isCheck="Not Registered ";
                }
            }else {
                isCheck="Register Data is Null";
            }
            return isCheck;

    }
}
