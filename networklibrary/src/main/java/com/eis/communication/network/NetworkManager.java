package com.eis.communication.network;

/**
 * Manager of any type of network, contains methods that should be in every network
 *
 * @param <RK> Type of resource key handled by the network
 * @param <RV> Type of resource value handled by the network
 * @author Luca Crema
 * @author Marco Mariotto
 * @author Alberto Ursino
 * @author Alessandra Tonin
 */
public interface NetworkManager<RK, RV, U extends NetworkUser, FR extends FailReason> {

    void setResource(RK key, RV value, SetResourceListener<RK, RV, FR> setResourceListener);

    void getResource(RK key, GetResourceListener<RK, RV, FR> getResourceListener);

    void invite(U user, InviteListener<U> inviteListener);

    void join(Invitation<U> invitation);

    void setJoinListener(JoinListener<U> joinListener);

}
