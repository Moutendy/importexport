package com.example.importexport.mapper;

import com.example.importexport.dto.MarchandiseDto;
import com.example.importexport.model.MarchandiseModel;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MarchandiseMapper
{
    private DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    //convertisseur dto vers model
    public MarchandiseModel marchandiseDtoToModel(MarchandiseDto marchandiseDto)
    {
        MarchandiseModel marchandiseModel = dozerBeanMapper.map(marchandiseDto,MarchandiseModel.class);
        return marchandiseModel;
    }
    //convertisseur liste dto vers liste model
    public List<MarchandiseModel> marchandiseModelListToDto(List<MarchandiseDto> marchandiseDtos)
    {
        List<MarchandiseModel> marchandiseModelList=new ArrayList<MarchandiseModel>();
        for(MarchandiseDto marchandiseDto:marchandiseDtos)
        {
            marchandiseModelList.add(marchandiseDtoToModel(marchandiseDto));
        }
        return marchandiseModelList;
    }
    //convertisseur model vers dto
    public MarchandiseDto marchandiseModelToDto(MarchandiseModel marchandiseModel)
    {
        MarchandiseDto marchandiseDto=dozerBeanMapper.map(marchandiseModel,MarchandiseDto.class);
        return marchandiseDto;
    }
    //convertisseur liste model vers liste dto
    public List<MarchandiseDto> marchandiseModelToDtos(List<MarchandiseModel>marchandiseModelList)
    {
        List<MarchandiseDto>marchandiseDtos=new ArrayList<MarchandiseDto>();
        for(MarchandiseModel marchandiseModel:marchandiseModelList)
        {
            marchandiseDtos.add(marchandiseModelToDto(marchandiseModel));
        }
        return marchandiseDtos;
    }
}
