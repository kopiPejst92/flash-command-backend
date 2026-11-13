package com.aga.flashcommand.dto;

import java.util.List;

public record FlashCardResponseDTO(
    String title,
    CommandDTO commandDTO,
    List<String> problemTags, 
    String status
){}
