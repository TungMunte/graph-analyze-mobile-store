package com.example.demo.repository;

import com.example.demo.entity.Packet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacketRepository extends JpaRepository<Packet, Integer> {
}
