package com.crio.codingame.commands;

import java.util.List;

import com.crio.codingame.entities.ScoreOrder;
import com.crio.codingame.entities.User;
import com.crio.codingame.services.IUserService;

public class LeaderBoardCommand implements ICommand{

    private final IUserService userService;
    
    public LeaderBoardCommand(IUserService userService) {
        this.userService = userService;
    }

    // TODO: CRIO_TASK_MODULE_CONTROLLER
    // Execute getAllUserScoreOrderWise method of IUserService and print the result.
    // Look for the unit tests to see the expected output.
    // Sample Input Token List:- ["LEADERBOARD","ASC"]
    // or
    // ["LEADERBOARD","DESC"]

    @Override
    public void execute(List<String> tokens) {
        // if (tokens.size() != 2) {
        //     System.out.println("Invalid command format. Please provide the required arguments.");
        //     return;
        // }
    
        // String order = tokens.get(1);
    
        // ScoreOrder scoreOrder;
        // if ("ASC".equalsIgnoreCase(order)) {
        //     scoreOrder = ScoreOrder.ASC;
        // } else if ("DESC".equalsIgnoreCase(order)) {
        //     scoreOrder = ScoreOrder.DESC;
        // } else {
        //     System.out.println("Invalid score order. Please provide either ASC or DESC.");
        //     return;
        // }
    
        // List<User> userList = userService.getAllUserScoreOrderWise(scoreOrder);
    
        // if (userList.isEmpty()) {
        //     System.out.println("No users found.");
        // } else {
        //     userList.forEach(user -> System.out.println(user));
        // }
        if (tokens.size() != 2) {
            System.out.println("Invalid command format. Please provide the required arguments.");
            return;
        }
        
        ScoreOrder order = ScoreOrder.valueOf(tokens.get(1));
    
        List<User> userList = userService.getAllUserScoreOrderWise(order);
      
            System.out.println(userList.toString());
        
    }
    
}
