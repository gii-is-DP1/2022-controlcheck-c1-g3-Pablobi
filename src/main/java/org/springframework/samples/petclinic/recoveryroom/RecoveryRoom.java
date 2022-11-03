package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="recovery_room")
public class RecoveryRoom extends BaseEntity{

	
	@NotNull
	@Size(min = 3, max = 50)
    String name;
	
	@NotNull
	@PositiveOrZero
    double size;
	
	@NotNull
    boolean secure;
    @Transient
    RecoveryRoomType roomType;
}
