package com.aga.flashcommand.service;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.aga.flashcommand.dto.FlashCardDTO;
import com.aga.flashcommand.repo.FlashCardRepository;

public class FlashCommandServiceTest {
    private final FlashCardRepository mockRepository= mock(FlashCardRepository.class);
    private FlashCardService flashCardService;

    @Test 
    @DisplayName("Should create flashcard, when raw command string is provided")
    void shouldCreateFlashCardFromRawCommandString(){
        String inputTitle = "Git configuration - update global username";
        String inputRawSyntax = "git config --global user.name \"Andrzej\"";
        
        // FlashCardDTO creCardDTO = flashCardService.createFlashCard();

    }

}
