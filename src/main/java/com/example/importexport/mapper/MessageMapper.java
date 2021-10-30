package com.example.importexport.mapper;

import com.example.importexport.dto.MessagerieDto;
import com.example.importexport.model.MessagerieModel;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageMapper {

    DozerBeanMapper beanMapper=new DozerBeanMapper();

    //convertisseur dto vers model
    public MessagerieModel messagerieDtoModel(MessagerieDto messagerieDto)
    {
        MessagerieModel messagerieModel = beanMapper.map(messagerieDto,MessagerieModel.class);
        return messagerieModel;

    }
    public List<MessagerieModel> messagerieModelsToDto(List<MessagerieDto> messagerieDtos)
    {
        List<MessagerieModel> messagerieModels=new ArrayList<MessagerieModel>();
        for(MessagerieDto messagerieDto:messagerieDtos)
        {
            messagerieModels.add(messagerieDtoModel(messagerieDto));
        }
        return messagerieModels;
    }
    //convertisseur model vers dto
    public MessagerieDto messagerieModelToDto(MessagerieModel messagerieModel)
    {
        MessagerieDto messagerieDto = beanMapper.map(messagerieModel,MessagerieDto.class);
        return messagerieDto;
    }
    //convertisseur liste model vers liste dto
    public List<MessagerieDto> messagerieModelToDto(List<MessagerieModel> messagerieModels)
    {
        List<MessagerieDto> messagerieDtoList=new ArrayList<MessagerieDto>();
        for(MessagerieModel messagerieModel:messagerieModels)
        {
            messagerieDtoList.add(messagerieModelToDto(messagerieModel));
        }
        return messagerieDtoList;
    }
}
