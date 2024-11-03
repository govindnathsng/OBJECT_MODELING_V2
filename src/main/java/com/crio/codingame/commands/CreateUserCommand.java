package com.crio.codingame.commands;

import java.util.List;

import com.crio.codingame.entities.User;
import com.crio.codingame.services.IUserService;

public class CreateUserCommand implements ICommand{

    private final IUserService userService;
    
    public CreateUserCommand(IUserService userService) {
        this.userService = userService;
    }

    // TODO: CRIO_TASK_MODULE_CONTROLLER
    // Execute create method of IUserService and print the result.
    // Look for the unit tests to see the expected output.
    // Sample Input Token List:- ["CREATE_QUESTION","Ross"]

    @Override
    public void execute(List<String> tokens) {
        // try {
        //     String username = tokens.get(1);
    
        //     User user = userService.create(username);
        //     System.out.println("User created: " + user.toString());  // Print the created user
    
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }
        
        try {
            if (tokens.size() < 2) {
                throw new IllegalArgumentException("Invalid number of arguments. Expected: 2, Actual: " + tokens.size());
            }
            String command = tokens.get(0);
            String userName = tokens.get(1);
    
            if (!command.equals("CREATE-USER")) {
                throw new IllegalArgumentException("Invalid command. Expected: CREATE-USER, Actual: " + command);
            }
    
            User user = userService.create(userName);
            System.out.println(user.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
