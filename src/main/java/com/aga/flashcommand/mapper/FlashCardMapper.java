package com.aga.flashcommand.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.aga.flashcommand.dto.FlashCardDTO;
import com.aga.flashcommand.dto.FlashCardResponseDTO;
import com.aga.flashcommand.model.FlashCard;


@Mapper(componentModel="spring", uses={CommandMapper.class, ArgumentMapper.class})
public interface FlashCardMapper{
    FlashCardDTO toDto(FlashCard flashCard);

    List<FlashCardDTO> toDtoList(List<FlashCard> flashCards);

    FlashCard toEntity(FlashCardDTO flashCardDTO);

    @Mapping(target="commandDTO", source="command")
    @Mapping(target="status", constant="CREATED")
    public FlashCardResponseDTO toResponseDTO(FlashCard flashCard);

    List<FlashCardResponseDTO> toResponseDTOList(List<FlashCard> flashCards);
}
