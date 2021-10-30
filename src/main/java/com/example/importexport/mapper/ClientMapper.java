package com.example.importexport.mapper;

import com.example.importexport.dto.ClientDto;
import com.example.importexport.model.ClientModel;
import com.example.importexport.model.CommentaireModel;
import com.example.importexport.model.MarchandiseModel;
import com.example.importexport.model.MessagerieModel;
import com.example.importexport.repository.ClientRepository;
import com.example.importexport.repository.CommentaireRepository;
import com.example.importexport.repository.MarchandiseRepository;
import com.example.importexport.repository.MessageRepository;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientMapper {


    DozerBeanMapper dozerBeanMapper= new DozerBeanMapper();

    @Autowired
    MarchandiseRepository marchandiseRepository;

    @Autowired
    CommentaireRepository commentaireRepository;

    @Autowired
    MessageRepository messageRepository;

    //tranferer dto vers model
    public ClientModel clientDtoToClientModel(ClientDto clientDto)
    {
        ClientModel clientModel=dozerBeanMapper.map(clientDto,ClientModel.class);

        if((clientDto.getMarchandiseId()!=null)&&(clientDto.getMessageId()!=null)&&(clientDto.getCommentaireId()!=null))
        {
            MarchandiseModel marchandiseModel = marchandiseRepository.getOne(clientDto.getMarchandiseId());
            CommentaireModel commentaireModel = commentaireRepository.getOne(clientDto.getCommentaireId());
            MessagerieModel messagerieModel=messageRepository.getOne(clientDto.getMessageId());


            clientModel.setMarchandiseModel(marchandiseModel);
            clientModel.setCommentaireModel(commentaireModel);
            clientModel.setMessagerieModel(messagerieModel);
        }

        return clientModel;
    }

    //tranferer model  vers  dto
    public ClientDto clientModelToClientDto(ClientModel clientModel)
    {
        ClientDto clientDto=dozerBeanMapper.map(clientModel,ClientDto.class);

        MarchandiseModel marchandiseModel=clientModel.getMarchandiseModel();

        MessagerieModel messagerieModel=clientModel.getMessagerieModel();


        CommentaireModel commentaireModel=clientModel.getCommentaireModel();

        if((marchandiseModel != null) && (commentaireModel != null) && ( messagerieModel != null))
        {
            clientDto.setMarchandiseId(marchandiseModel.getId());
            clientDto.setCommentaireId(commentaireModel.getId());
            clientDto.setMessageId(messagerieModel.getId());
        }
        return clientDto;
    }

    //tranferer la liste de model  vers la liste dto
    public List<ClientDto> clientModelToClientDto(List<ClientModel> clientModels)
    {
        List<ClientDto> clientDtos= new ArrayList<ClientDto>();
        for(ClientModel clientModel:clientModels)
        {
            clientDtos.add( clientModelToClientDto(clientModel));

        }

        return clientDtos;
    }

    //tranferer la liste de dto  vers la liste model
    public List<ClientModel> clientDtoToClientModel(List<ClientDto> clientDtos)
    {
        List<ClientModel> clientModels=new ArrayList<ClientModel>();
        for(ClientDto clientDto:clientDtos)
        {
            clientModels.add(clientDtoToClientModel(clientDto));
        }

    return  clientModels;
    }
}
