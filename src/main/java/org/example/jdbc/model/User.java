package org.example.jdbc.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class User {
    private int id;
    private String firstName;
    private String lastName;
}
