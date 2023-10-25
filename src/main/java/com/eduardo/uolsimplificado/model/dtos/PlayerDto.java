package com.eduardo.uolsimplificado.model.dtos;

import com.eduardo.uolsimplificado.model.GroupType;

public record PlayerDto(
        String name,
        String email,
        String phoneNumber,
        GroupType groupType
) {
}
