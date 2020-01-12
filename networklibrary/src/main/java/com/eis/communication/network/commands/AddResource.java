package com.eis.communication.network.commands;

import com.eis.communication.network.smsnetwork.SMSNetDictionary;

/**
 * Command to add a resource
 *
 * @author Edoardo Raimondi
 */
public class AddResource implements Command {

    /*Using strings to be coherent to SMSNetDictionary class*/
    private String key;
    private String value;
    private SMSNetDictionary netDictionary;

    public AddResource(String key, String value, SMSNetDictionary netDictionary){
        this.key = key;
        this.value = value;
        this.netDictionary = netDictionary;
    }

    public void execute() {
        netDictionary.addResource(key, value);
        //TODO broadcast
    }
}