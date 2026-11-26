package com.aga.flashcommand.service.parser;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import com.aga.flashcommand.dto.CommandDTO;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic("Command Collection")
@Feature("Command Parsing")
public class MasterCommandParserTest {

    private final MasterCommandParser parser= new MasterCommandParser(List.of(new CLICommandParser()));

    @Test 
    @DisplayName("Should parse Command from raw CLI syntax")
    void shouldParseCliCommandWithoutArguments(){
        String raw = "mvn clean";

        CommandDTO result = parser.parse(raw);

        assertThat(result.tool()).isEqualTo("mvn");
        assertThat(result.syntax()).isEqualTo("clean");
    }

    @Test
    @DisplayName("Should parse Command with arguments from raw CLI syntax")
    void shouldParseCliCommandWithArguments(){
        String raw = "bim-cli check --storey Level_01 --cords ";

        CommandDTO result= parser.parse(raw);

        assertThat(result.tool()).isEqualTo("bim-cli");
        assertThat(result.syntax()).isEqualTo("check");
        assertThat(result.arguments()).extracting("name")
        .containsExactly("--storey", "Level_01", "--cords");
    }
    
}
