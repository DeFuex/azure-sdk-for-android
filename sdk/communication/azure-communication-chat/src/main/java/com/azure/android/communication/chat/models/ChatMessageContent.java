// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.android.communication.chat.models;

import com.azure.android.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ChatMessageContent model.
 */
@Fluent
public final class ChatMessageContent {
    /*
     * Chat message content for messages of types text or html.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Chat message content for messages of type topicUpdated.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /*
     * Chat message content for messages of types participantAdded or
     * participantRemoved.
     */
    @JsonProperty(value = "participants")
    private List<ChatParticipant> participants;

    /*
     * Chat message content for messages of types participantAdded or
     * participantRemoved.
     */
    @JsonProperty(value = "initiator")
    private String initiator;

    /**
     * Get the message property: Chat message content for messages of types
     * text or html.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Chat message content for messages of types
     * text or html.
     *
     * @param message the message value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the topic property: Chat message content for messages of type
     * topicUpdated.
     *
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: Chat message content for messages of type
     * topicUpdated.
     *
     * @param topic the topic value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the participants property: Chat message content for messages of
     * types participantAdded or participantRemoved.
     *
     * @return the participants value.
     */
    public List<ChatParticipant> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: Chat message content for messages of
     * types participantAdded or participantRemoved.
     *
     * @param participants the participants value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setParticipants(List<ChatParticipant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Get the initiator property: Chat message content for messages of types
     * participantAdded or participantRemoved.
     *
     * @return the initiator value.
     */
    public String getInitiator() {
        return this.initiator;
    }

    /**
     * Set the initiator property: Chat message content for messages of types
     * participantAdded or participantRemoved.
     *
     * @param initiator the initiator value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setInitiator(String initiator) {
        this.initiator = initiator;
        return this;
    }
}
