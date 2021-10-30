package com.example.importexport.mapper;

import com.example.importexport.dto.CommentaireDto;
import com.example.importexport.model.CommentaireModel;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommentaireMapper
{
    DozerBeanMapper beanMapper = new DozerBeanMapper();

    //convertisseur de dto vers model
    public CommentaireModel dtoTocommentaireModel(CommentaireDto commentaireDto)
    {
        CommentaireModel commentaireModel=beanMapper.map(commentaireDto,CommentaireModel.class);
        return commentaireModel;
    }
    //convertisseur liste dto vers liste model
    public List<CommentaireModel> dtoToCommentaireModels(List<CommentaireDto> commentaireDtoList)
    {
        List<CommentaireModel> commentaireModels = new ArrayList<CommentaireModel>();
        for(CommentaireDto commentaireDto:commentaireDtoList)
        {
            commentaireModels.add(dtoTocommentaireModel(commentaireDto));
        }
        return commentaireModels;
    }

    //convertisseur model vers dto
    public CommentaireDto commentaireModelToDto(CommentaireModel commentaireModel)
    {
        CommentaireDto commentaireDto = beanMapper.map(commentaireModel,CommentaireDto.class);
        return commentaireDto;
    }
    //convertisseur liste model vers liste dto
    public List<CommentaireDto> commentaireModelToDtoList(List<CommentaireModel> commentaireModels)
    {
        List<CommentaireDto> commentaireDtoList= new ArrayList<CommentaireDto>();
        for(CommentaireModel commentaireModel:commentaireModels)
        {
            commentaireDtoList.add(commentaireModelToDto(commentaireModel));
        }
        return commentaireDtoList;
    }
}
