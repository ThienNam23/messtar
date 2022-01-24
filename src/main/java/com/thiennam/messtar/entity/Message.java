package com.thiennam.messtar.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "MESSTAR_MESSAGE")
@Entity(name = "messtar_Message")
public class Message extends StandardEntity {
    @ManyToOne
    @JoinColumn(name = "SENDER", nullable = false)
    private User sender;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID", nullable = false)
    private Room room;

    @Column(name = "PINNED", nullable = false)
    private Boolean pinned;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "CONTENT", nullable = false)
    private String content;

    @Column(name = "MODIFIED")
    private LocalDateTime modified;

    @Column(name = "CREATED_TIME", nullable = false)
    private LocalDateTime createdTime;

    @OneToMany(mappedBy = "message", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<UserMessage> userMessages = new ArrayList<>();

    public List<UserMessage> getUserMessages() {
        return userMessages;
    }

    public void setUserMessages(List<UserMessage> userMessages) {
        this.userMessages = userMessages;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public MessageTypeEnum getType() {
        return MessageTypeEnum.fromId(type);
    }

    public void setType(MessageTypeEnum type) {
        this.type = type == null ? null : type.getId();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
}
