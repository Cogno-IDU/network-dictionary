package com.eis.communication.network.commands;

/**
 * This interface has to be implemented by any class that needs to be a command
 *
 * Created following the Command design pattern
 * @link https://refactoring.guru/design-patterns/command
 *
 * @author Edoardo Raimondi, idea by Marco Cognolato, Enrico Cestaro
 */
public interface Command {

    /**
     * Execute the specific class command
     */
    void execute();
}