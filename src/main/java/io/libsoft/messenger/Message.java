package io.libsoft.messenger;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {

  private final UUID messageUUID;
  private final UUID senderUUID;
  private final UUID recipientUUID;
  private final MessageType messageType;
  private final GameState gameState;
  private final String payload;


  private Message(Builder builder) {
    messageUUID = builder.messageUUID;
    senderUUID = builder.senderUUID;
    recipientUUID = builder.recipientUUID;
    messageType = builder.messageType;
    gameState = builder.gameState;
    payload = builder.payload;
  }

  public static Builder build() {
    return new Builder();
  }

  public UUID getMessageUUID() {
    return messageUUID;
  }

  public UUID getSenderUUID() {
    return senderUUID;
  }

  public UUID getRecipientUUID() {
    return recipientUUID;
  }

  public MessageType getMessageType() {
    return messageType;
  }

  public GameState getGameState() {
    return gameState;
  }

  public String getPayload() {
    return payload;
  }

  public static final class Builder {

    private MessageType messageType;
    private GameState gameState;
    private UUID messageUUID;
    private UUID senderUUID;
    private UUID recipientUUID;
    private String payload;

    private Builder() {

    }

    public Builder messageUUID(UUID messageUUID) {
      this.messageUUID = messageUUID;
      return this;
    }


    public Builder recipientUUID(UUID recipientUUID) {
      this.recipientUUID = recipientUUID;
      return this;
    }

    public Builder messageType(MessageType messageType) {
      this.messageType = messageType;
      return this;
    }

    public Builder gameState(GameState gameState) {
      this.gameState = gameState;
      return this;
    }

    public Builder payload(String payload) {
      this.payload = payload;
      return this;
    }

    public Message sign(UUID senderUUID) {
      this.senderUUID = senderUUID;
      return new Message(this);
    }
  }
}
