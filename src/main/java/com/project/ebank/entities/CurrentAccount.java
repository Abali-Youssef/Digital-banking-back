package com.project.ebank.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue("CUR")
public class CurrentAccount extends BankAccount {
    @Column(nullable = false)
    private double overDraft;
}
