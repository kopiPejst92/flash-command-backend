package com.aga.flashcommand.service;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.aga.flashcommand.dto.ArgumentDTO;
import com.aga.flashcommand.dto.CommandDTO;
import com.aga.flashcommand.mapper.CommandMapper;
import com.aga.flashcommand.model.Command;
import com.aga.flashcommand.repo.CommandRepository;
import com.aga.flashcommand.service.parser.MasterCommandParserTest;

@ExtendWith(MockitoExtension.class)
public class CommandServiceTest {
    @Mock CommandRepository repository;
    @Mock CommandMapper mapper;
    @Mock MasterCommandParserTest parser;

    @InjectMocks CommandService service;

    @Test
    @DisplayName("Should create Command with Arguments from raw syntax")
    void shouldParseCommandWithArgumentsWhenRawSyntaxIsProvided() {
        // String tool = "git";
        // String command ="config";
        // String arg1= "user.name";
        // String arg2="\"name\"";
        // String rawString =String.join(" ", tool, command, arg1, arg2);
        // String cDescription="Parsed CLI command";
        // String argDescription = "Parsed argument";
        // ArgumentDTO arg1DTO= new ArgumentDTO(null, arg1, argDescription);
        // ArgumentDTO arg2DTO= new ArgumentDTO(null, arg2, argDescription);
        
        // var parsed = new CommandDTO(null, tool, command, cDescription, List.of(arg1DTO, arg2DTO));
        // var entity = new Command(command, cDescription);

        // when(parser.parse(rawString)).thenReturn(parsed);
    }

    @Test
    @DisplayName("Should create Command without Arguments from raw syntax")
    void shouldParseCommandWithoutArgumentsWhenRawSyntaxIsProvided() {
        // String tool = "git";
        // String baseSyntax ="init";
        // String rawString = tool +" " + baseSyntax;
        // String cDescription="Parsed CLI command";
        
        
        // var parsed = new CommandDTO(null, tool, baseSyntax, cDescription, List.of());
        // var entity = new Command(baseSyntax, cDescription);

        // when(parser.parse(rawString)).thenReturn(parsed);
        // when(repository.findByToolAndSyntax(tool, baseSyntax)).thenReturn(Optional.empty());
    }
}
