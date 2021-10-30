package com.example.importexport.mapper;

import com.example.importexport.dto.AgentDto;
import com.example.importexport.dto.ClientDto;
import com.example.importexport.model.*;
import com.example.importexport.repository.CommentaireRepository;
import com.example.importexport.repository.MarchandiseRepository;
import com.example.importexport.repository.MessageRepository;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AgentMapper {

    DozerBeanMapper dozerBeanMapper= new DozerBeanMapper();

    @Autowired
    MarchandiseRepository marchandiseRepository;

    @Autowired
    CommentaireRepository commentaireRepository;

    @Autowired
    MessageRepository messageRepository;

    //tranferer dto vers model
    public AgentModel agentDtoToAgentModel(AgentDto agentDto)
    {
        AgentModel agentModel=dozerBeanMapper.map(agentDto,AgentModel.class);

        if((agentDto.getMarchandiseId()!=null)&&(agentDto.getMessageId()!=null)&&(agentDto.getCommentaireId()!=null))
        {
            MarchandiseModel marchandiseModel = marchandiseRepository.getOne(agentDto.getMarchandiseId());
            CommentaireModel commentaireModel = commentaireRepository.getOne(agentDto.getCommentaireId());
            MessagerieModel messagerieModel=messageRepository.getOne(agentDto.getMessageId());


            agentModel.setMarchandiseModel(marchandiseModel);
            agentModel.setCommentaireModel(commentaireModel);
            agentModel.setMessagerieModel(messagerieModel);
        }

        return agentModel;
    }

    //tranferer model  vers  dto
    public AgentDto agentModelToAgentDto(AgentModel agentModel)
    {
        AgentDto agentDto=dozerBeanMapper.map(agentModel,AgentDto.class);

        MarchandiseModel marchandiseModel=agentModel.getMarchandiseModel();

        MessagerieModel messagerieModel=agentModel.getMessagerieModel();


        CommentaireModel commentaireModel=agentModel.getCommentaireModel();

        if((marchandiseModel != null) && (commentaireModel != null) && ( messagerieModel != null))
        {
            agentDto.setMarchandiseId(marchandiseModel.getId());
            agentDto.setCommentaireId(commentaireModel.getId());
            agentDto.setMessageId(messagerieModel.getId());
        }
        return agentDto;
    }

    //tranferer la liste de model  vers la liste dto
    public List<AgentDto> agentModelToAgentDto(List<AgentModel> agentModels)
    {
        List<AgentDto> agentDtos= new ArrayList<AgentDto>();
        for(AgentModel agentModel:agentModels)
        {
            agentDtos.add( agentModelToAgentDto(agentModel));

        }

        return agentDtos;
    }

    //tranferer la liste de dto  vers la liste model
    public List<AgentModel> agentDtoToAgentModel(List<AgentDto> agentDtos)
    {
        List<AgentModel> agentModels=new ArrayList<AgentModel>();
        for(AgentDto agentDto:agentDtos)
        {
            agentModels.add(agentDtoToAgentModel(agentDto));
        }

        return  agentModels;
    }

}
