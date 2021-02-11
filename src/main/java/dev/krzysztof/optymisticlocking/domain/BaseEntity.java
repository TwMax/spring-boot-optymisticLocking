package dev.krzysztof.optymisticlocking.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Version
    private Long version;

}
