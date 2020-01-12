package com.eis.communication.network.commands;

import androidx.annotation.NonNull;

import com.eis.communication.Peer;
import com.eis.communication.network.Command;
import com.eis.communication.network.NetSubscriberList;

/**
 * Command to add a peer to the Subscribers list
 *
 * @author Edoardo Raimondi
 * @author Marco Cognolato
 */
public class AddPeer implements Command {

    private Peer peer;
    private NetSubscriberList netSubscribers;

    /**
     * AddPeer command constructor, receives the data it needs to operate
     *
     * @param peer           The Peer to add to the network
     * @param netSubscribers The subscribers list to add the peer to
     */
    public AddPeer(@NonNull Peer peer, @NonNull NetSubscriberList netSubscribers) {
        this.peer = peer;
        this.netSubscribers = netSubscribers;
    }

    /**
     * Add the peer to the subscribers list and broadcasts it to the net
     */
    public void execute() {
        netSubscribers.addSubscriber(peer);
        //TODO broadcast
    }
}