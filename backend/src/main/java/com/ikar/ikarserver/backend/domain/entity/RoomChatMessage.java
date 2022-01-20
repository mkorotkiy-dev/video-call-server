package com.ikar.ikarserver.backend.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "room_chat_messages")
public class RoomChatMessage extends ChatMessage {

}