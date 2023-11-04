package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "packet")
public class Packet {

    @Id
    @Column(name = "packet_id")
    private Integer packetId;

    @Column(name = "user_receiver_id")
    private Integer userReceiverId;

    @Column(name = "user_sender_id")
    private Integer userSenderId;

    @Column(name = "date_send")
    @Temporal(TemporalType.DATE)
    private java.sql.Date dateSend;

    @Column(name = "date_receive ")
    @Temporal(TemporalType.DATE)
    private java.sql.Date dateReceive;
}
