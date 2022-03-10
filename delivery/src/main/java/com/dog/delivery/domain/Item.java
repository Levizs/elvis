package com.dog.delivery.domain;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Item  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @NotNull
    @Length(min=2, max=30,message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String nome;

    @NotNull
    @Min(value=20,message="O valor mínimo deve ser {value} reais")
	private Double preco;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Item item = (Item) o;
		return id != null && Objects.equals(id, item.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
