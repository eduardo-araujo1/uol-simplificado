package com.eduardo.uolsimplificado.model;

import com.eduardo.uolsimplificado.model.dtos.PlayerDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "players")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private String phoneNumber;
    private String codiname;
    private GroupType groupType;

    public Player(PlayerDto dto) {
        this.name = dto.name();
        this.email =dto.email();
        this.phoneNumber =dto.phoneNumber();
        this.groupType = dto.groupType();
    }
}
