package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class CLIArguments {

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            description = "KEYWORD"
    )
    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada búsqueda puede incluir una ubicación"
    )
    private String location;

    @Parameter(
            names = {"--page", "-p"},
            description = "La API devuelve 50 resultados, usa un número para la página"
    )
    private int page = 0;

    @Parameter(
            names = {"--full-time"},
            description = "Agrega si queremos trabajos de tiempo completo"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--markdown"},
            description = "Obtener los resultados en markdown"
    )
    private boolean isMarkdown = false;

    @Parameter(
            names = {"--help"},
            help = true,
            description = "Mostrar esta ayuda"
    )
    private boolean isHelp;

    CLIArguments() {

    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }


}
