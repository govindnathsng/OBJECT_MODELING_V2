package com.crio.codingame.commands;

import java.util.List;

import com.crio.codingame.entities.Contest;
import com.crio.codingame.entities.Level;
import com.crio.codingame.entities.Question;
import com.crio.codingame.services.IContestService;

public class ListContestCommand implements ICommand{

    private final IContestService contestService;
    
    public ListContestCommand(IContestService contestService) {
        this.contestService = contestService;
    }

    // TODO: CRIO_TASK_MODULE_CONTROLLER
    // Execute getAllContestLevelWise method of IContestService and print the result.
    // Look for the unit tests to see the expected output.
    // Sample Input Token List:- ["LIST_CONTEST","HIGH"]
    // or
    // ["LIST_CONTEST"]

    @Override
    public void execute(List<String> tokens) {
        // if (tokens.size() == 1) {
        //     // If no level is specified, get all contests
        //     List<Contest> contests = contestService.getAllContestLevelWise(null);
        //     for (Contest contest : contests) {
        //         System.out.println(contest);
        //     }
        // } else if (tokens.size() == 2) {
        //     // If a level is specified, get contests of that level
        //     Level level = Level.valueOf(tokens.get(1));
        //     List<Contest> contests = contestService.getAllContestLevelWise(level);
        //     for (Contest contest : contests) {
        //         System.out.println(contest);
        //     }
        // } else {
        //     System.out.println("Invalid command format. Please provide the required arguments.");
        // }
    //     if (tokens.size() == 1 && tokens.get(0).equals("LIST-CONTEST")) {
    //         List<Contest> contests = contestService.getAllContestLevelWise(null);
    //         for (Contest contest : contests) {
    //             System.out.println(contest.toString());
    //         }
    //         return;
    //     } else if (tokens.size() == 2 && tokens.get(0).equals("LIST-CONTEST")) {
    //         Level level = Level.valueOf(tokens.get(1));
    //         List<Contest> contests = contestService.getAllContestLevelWise(level);
    //         for (Contest contest : contests) {
    //             System.out.println(contest.toString());
    //         }
    //         return;
    //     }
    //     throw new IllegalArgumentException("Invalid command format. Please provide the required arguments.");
    Level level = tokens.size() > 1 ? Level.valueOf(tokens.get(1)) : null;

    List<Contest> contests = contestService.getAllContestLevelWise(level);

    
        System.out.println(contests.toString());
        
    
    // System.out.println(contests);
}

    
}
