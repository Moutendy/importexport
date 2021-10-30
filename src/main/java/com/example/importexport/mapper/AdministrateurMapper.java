package com.example.importexport.mapper;

import com.example.importexport.dto.AdministrateurDto;
import com.example.importexport.model.AdministrateurModel;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class AdministrateurMapper
{
    DozerBeanMapper beanMapper = new DozerBeanMapper();

    //convertire dto en model
    public AdministrateurModel dtoToadministrateurModel(AdministrateurDto administrateurDto)
    {
       AdministrateurModel administrateurModel=beanMapper.map(administrateurDto,AdministrateurModel.class);
       return administrateurModel;
    }
    //convertire model en dto
    public AdministrateurDto administrateurModelToDto(AdministrateurModel administrateurModel)
    {
        AdministrateurDto administrateurDto=beanMapper.map(administrateurModel,AdministrateurDto.class);
        return administrateurDto;
    }
    //convertisseur dto en model
    public List<AdministrateurModel> DtoToadministrateurModels(List<AdministrateurDto> administrateurDtos)
    {
        List<AdministrateurModel> administrateurModels= new ArrayList<AdministrateurModel>();
        for(AdministrateurDto administrateurDto:administrateurDtos)
        {
            administrateurModels.add(dtoToadministrateurModel(administrateurDto));
        }

        return administrateurModels;
    }

    //convertisseur model vers Dto
    public List<AdministrateurDto> administrateurModelsToDto(List<AdministrateurModel> administrateurModels)
    {
        List<AdministrateurDto> administrateurDtos= new ArrayList<AdministrateurDto>();
        for(AdministrateurModel administrateurModel:administrateurModels)
        {
            administrateurDtos.add(administrateurModelToDto(administrateurModel));
        }

        return administrateurDtos;
    }
}
