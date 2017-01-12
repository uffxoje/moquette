package io.moquette.connections;

import java.util.Collection;

/**
 * A class that represents the overall connection status of a MQTT session. Its
 * instances will be used by an external codebase when the broker is configured
 * in embedded mode.
 * 
 * @author lbarrios
 *
 */
public class MqttSession {

	private boolean connectionEstablished;
	private boolean cleanSession;
	private int inflightMessages;
	private int pendingPublishMessagesNo;
	private int secondPhaseAckPendingMessages;
	private Collection<MqttSubscription> activeSubscriptions;

	public boolean isConnectionEstablished() {
		return connectionEstablished;
	}

	public void setConnectionEstablished(boolean connectionEstablished) {
		this.connectionEstablished = connectionEstablished;
	}

	public boolean isCleanSession() {
		return cleanSession;
	}

	public void setCleanSession(boolean cleanSession) {
		this.cleanSession = cleanSession;
	}
	
	public int getPendingPublishMessagesNo() {
        return pendingPublishMessagesNo;
    }
	
	public void setPendingPublishMessagesNo(int pendingPublishMessagesNo) {
        this.pendingPublishMessagesNo = pendingPublishMessagesNo;
    }

	public int getInflightMessages() {
		return inflightMessages;
	}

	public void setInflightMessages(int inflightMessages) {
		this.inflightMessages = inflightMessages;
	}

	public int getSecondPhaseAckPendingMessages() {
		return secondPhaseAckPendingMessages;
	}

	public void setSecondPhaseAckPendingMessages(int secondPhaseAckPendingMessages) {
		this.secondPhaseAckPendingMessages = secondPhaseAckPendingMessages;
	}

	public Collection<MqttSubscription> getActiveSubscriptions() {
		return activeSubscriptions;
	}

	public void setActiveSubscriptions(Collection<MqttSubscription> activeSubscriptions) {
		this.activeSubscriptions = activeSubscriptions;
	}

}
