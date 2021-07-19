package com.platzi.jobsearch;

import com.beust.jcommander.JCommander;
import com.platzi.jobsearch.cli.CLIArguments;

public class JobSearch {
    public static void main(String[] args) {
        System.out.println("Hello job search");
        JCommander jCommander = CommanderFunctions.buildCommanderWithName("job-search", CLIArguments::newInstance);
    }
}
