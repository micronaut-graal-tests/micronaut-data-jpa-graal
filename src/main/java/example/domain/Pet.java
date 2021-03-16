package example.domain;

import io.micronaut.core.annotation.Introspected;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class Pet {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @ManyToOne
    private Owner owner;

    private PetType type = PetType.DOG;

    public PetType getType() {
        return type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    @Introspected
    public enum PetType {
        DOG,
        CAT
    }
}